/*
 * buzzer.h
 *
 * Created: 2026-09-18 오후 2:55:00
 *  Author: user
 */ 

#define F_CPU 16000000
#include <stdio.h>
#include <avr/io.h>
#include <util/delay.h>
#ifndef BUZZER_H_
#define BUZZER_H_

void alarmOne();

void alarmTwo();


#endif /* BUZZER_H_ */
