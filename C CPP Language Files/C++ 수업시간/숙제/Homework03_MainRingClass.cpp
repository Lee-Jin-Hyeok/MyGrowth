/*
	���ϸ� Homework03_MainRingClass.cpp
	���� {
		���� Homework02_MainRingClass.cpp �� �ٸ��� ��� �̴ϼȶ������� �̿��ؼ�
		��� ������ �ʱ�ȭ �ϴ� Init �Լ��� ��ü�� �ڵ��̴�.

		���� ���� - Homework03_Ring.h  -  Homework03_Ring.cpp
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