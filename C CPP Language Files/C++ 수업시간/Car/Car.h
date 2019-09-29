#ifndef __CAR_H_
#define __CAR_H_

#include <iostream>
#include <cstring>
using namespace std;

namespace CAR_CONST {
	enum {
		ID_LEN = 20,
		MAX_SPD = 100,
		FUEL_STEP = 2,
		ACC_STEP = 10,
		BRK_STEP = 10
	};
}

class Car {
private:
	char gamerID[CAR_CONST::ID_LEN];
	int fuelGauge;
	int curSpeed;
public:
	inline void InitMembers(const char* ID, int fuel);
	inline void ShowCarState(void);
	void Accel(void);
	void Break(void);
};

inline void Car::InitMembers(const char* ID, int fuel) {
	strcpy(gamerID, ID);
	fuelGauge = fuel;
	curSpeed = 0;
}

inline void Car::ShowCarState() {
	cout << "소유자ID : " << gamerID << endl;
	cout << "연료량 : " << fuelGauge << "%" << endl;
	cout << "현재속도 : " << curSpeed << "km/s" << endl << endl;
}

#endif