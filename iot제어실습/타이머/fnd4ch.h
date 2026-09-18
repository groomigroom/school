/*
 * IncFile1.h
 *
 * Created: 2026-09-18 오후 1:39:38
 *  Author: user
 */ 


#ifndef FND4CH_H_
#define FND4CH_H_

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



#endif /* FND4CH_H_ */
