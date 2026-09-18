/*
 * buzzer.c
 *
 * Created: 2026-09-18 오후 2:56:28
 *  Author: user
 */ 

#include "buzzer.h"

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
