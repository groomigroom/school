/*
 * buzzer.c
 *
 * Created: 2026-09-18 오후 2:18:17
 * Author : user
 */ 

#define F_CPU 16000000
#include <stdio.h>
#include <avr/io.h>
#include <util/delay.h>


int main(void)
{
    DDRB = 0x10;
	PORTB = 0x00;
	
	for(uint16_t loop = 0; loop < 2730; loop++) {
		PORTB = 0x10;
		_delay_us(183);
		PORTB = 0x00;
		_delay_us(183);
	}
	
	while(1) {}
}

