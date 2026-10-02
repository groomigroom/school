/*
 * Timertimer.c
 *
 * Created: 2026-10-02 오후 2:00:51
 * Author : user
 */ 
#define F_CPU 16000000
#include <avr/io.h>
#include <avr/interrupt.h>
#include <util/delay.h>

uint8_t LED = 0b00000000;

ISR(TIMER1_COMPA_vect) {
	if (LED == 0b00000000) {
		LED = 0b11111111;
	} else if (LED == 0b11111111) {
		LED = 0b00000000;
	}
	PORTA = LED;
}


int main(void)
{
    DDRA = 0b11111111;
	DDRC = 0xFF;
	DDRG = 0x0F;
	TCCR1A = 0x00;
	TCCR1B = 0x08 | 0x05;
	TCCR1C = 0x00;
	OCR1A = 15624;
	
	TCNT1 = 0x0000;
	TIMSK = 0x10;
	ETIMSK = 0x00;
	TIFR = 0x3C;
	ETIFR = 0x01;
	
	sei();
	PORTC = 0xFF;
    while (1) 
    {
		PORTG = 0x0C;
		_delay_ms(500);
		PORTG = 0x03;
		_delay_ms(500);
    }
}

