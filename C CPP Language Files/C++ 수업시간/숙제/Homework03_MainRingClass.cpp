/*
	파일명 Homework03_MainRingClass.cpp
	내용 {
		저번 Homework02_MainRingClass.cpp 와 다르게 멤버 이니셜라이저를 이용해서
		멤버 변수를 초기화 하는 Init 함수를 대체한 코드이다.

		연관 파일 - Homework03_Ring.h  -  Homework03_Ring.cpp
	}
*/

#include <iostream>
#include "Ring.h"
using namespace std;

int main() {
	Ring ring(1, 1, 4, 2, 2, 9);
	ring.ShowRingInfo();
	return 0;
}