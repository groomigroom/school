/*
 * buzzer2.c
 *
 * Created: 2026-09-18 오후 2:35:54
 * Author : user
 */ 
#define F_CPU 16000000
#include <stdio.h>
#include <avr/io.h>
#include <util/delay.h>

void alarmOne() {
	for(uint16_t loop = 0; loop < 2730; loop++) {
		PORTB = 0x10;
		_delay_us(183);
		PORTB = 0x00;
		_delay_us(183);
	}
}

void alarmTwo() {
	// 약 0.333초 울림
	for(uint16_t loop = 0; loop < 910; loop++) {
		PORTB = 0x10;
		_delay_us(183);
		PORTB = 0x00;
		_delay_us(183);
	}

	// 약 0.333초 정지
	_delay_ms(333);

	// 약 0.333초 울림
	for(uint16_t loop = 0; loop < 910; loop++) {
		PORTB = 0x10;
		_delay_us(183);
		PORTB = 0x00;
		_delay_us(183);
	}
}

int main(void)
{
	DDRB = 0x10;
	PORTB = 0x00;
	alarmOne();
	_delay_ms(1000);
	alarmTwo();
	
    /* Replace with your application code */
    while (1) 
    {
    }
}

