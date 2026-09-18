/*
 * september11.c
 *
 * Created: 2026-09-11 오후 1:31:51
 * Author : 김구름이
 */ 

#define F_CPU 16000000
#include <avr/io.h>
#include <util/delay.h>
#include "util/fnd4ch.h"


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
