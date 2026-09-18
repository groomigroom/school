/*
 * september11.c
 *
 * Created: 2026-09-11 오후 1:31:51
 * Author : 김구름이
 */ 

#define F_CPU 16000000
#include <avr/io.h>
#include <util/delay.h>

void setFND(uint8_t ch, uint8_t n) {
	PORTG = ch;
	uint8_t fndNumber[] = {0x3F, 0x06, 0x5B, 0x4F, 0x66, 0x6D, 0x7D, 0x27, 0x7F, 0x6F};
	PORTC = fndNumber[n];
	
}

void setFNDs(int16_t n) {
	setFND(0x08, n / 1000 % 10);
	_delay_ms(1);
	setFND(0x04, n / 100 % 10);
	_delay_ms(1);
	setFND(0x02, n / 10 % 10);
	_delay_ms(1);	
	setFND(0x01, n % 10);
	_delay_ms(1);
	
}

int main(void)
{
    DDRC = 0xFF;
	DDRG = 0x0F;
	
	int16_t number = 0;
    while (1) 
    {
		setFNDs(number);
		number++;
    }
}
