#define F_CPU 16000000UL
//CPU의 클록 주파수를 컴파일러에 알려주는 설정임.
#include <avr/io.h>
#include <util/delay.h>
#include <stdio.h>
#include <avr/interrupt.h>

uint8_t FNDCount = 0;                 // fnd카운트 
uint16_t FNDNumber = 0;               // fnd넘버 
//FNDNumber가 1234라면 1, 2, 3, 4를 각 자리에 나누어 표시함.

uint8_t FNDPattern[10] = {                 //배열 만들기
	0x3F, 0x06, 0x5B, 0x4F, 0x66,
	0x6D, 0x7D, 0x07, 0x7F, 0x6F
	//숫자를 LED 모양으로 바꾸기
};

void setFND(uint8_t chSelect, uint8_t number)           //매개변수 채널선택, 넘버
//chSelect 표시할 자리의 선택값
//number 표시할 숫자 0~9
//자리와 숫자를 출력하기.
{
	PORTG = chSelect;                                     // 숫자칸 = 채널
	//PORTG에 자리 선택 신호를 출력함.
	
	PORTC = FNDPattern[number];                           // 숫자 = 패턴
}

ISR(TIMER1_COMPA_vect)
//ISR은 Interrupt Service Routine, 즉 인터럽트 서비스 루틴입니다.
{
	uint8_t chSelect = 1 << FNDCount;

	if (FNDCount == 0) {
		setFND(chSelect, FNDNumber % 10);
		} else if (FNDCount == 1) {
		setFND(chSelect, FNDNumber / 10 % 10);
		} else if (FNDCount == 2) {
		setFND(chSelect, FNDNumber / 100 % 10);
		} else if (FNDCount == 3) {
		setFND(chSelect, FNDNumber / 1000 % 10);
	}

	FNDCount++;
	
	if (FNDCount >= 4) {            // 자리 반복시키기
		FNDCount = 0;
	}
}

int main(void)
{
	DDRC = 0xff;
	DDRG = 0x0f;

	TCCR1A = 0x00;   //타이머 ctc
	TCCR1B = 0x08 | 0x03;     //분주비 64
	//분주비는 입력 클럭의 주파수를 나누어 타이머가 동작하는 속도를 조절하는 설정
	//분주비는 타이머가 얼마나 빠르게 카운트하는지 결정
	TCCR1C = 0x00;
	OCR1A = 249;      //  함수식에 -1 해서 만든거

	TCNT1 = 0x0000;   // 근데 이거 왜 0000인지
	TIMSK = 0x10;
	//타이머 인터럽트를 어떤거를 사용하지 설정하는 거.

	sei();

	while (1)
	{
		FNDNumber++;

		if (FNDNumber > 9999) {       //꽉차면 초기값으로 돌아가라
			FNDNumber = 0;
		}

		_delay_ms(1000);
	}
}
