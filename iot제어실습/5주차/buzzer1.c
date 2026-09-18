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
#include "util/buzzer.h"


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

