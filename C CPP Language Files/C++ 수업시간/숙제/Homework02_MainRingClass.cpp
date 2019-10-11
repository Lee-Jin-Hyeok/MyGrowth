/*
	파일명 Homework02_MainRingClass.cpp
	제작자 이진혁
	내용 {
		본 코드는 대덕소프트웨어 마이스터 고등학교에서 진행하는 C++ 수업 중
		제시된 수행평가를 진행하기 위해서 만든 코드입니다.

		본 코드의 목적은 수행평가를 완수하는데에 있습니다.
		본 코드는 제시된 Point 클래스를 기반으로 하여
		반지름의 길이를 포함하여 출력해주는 Circle 클래스를 정의하고
		그를 이용하여 두 개의 Circle 클래스 즉, 두 개의 원을 정의하는
		Ring 클래스를 정의한 코드입니다.

		+ 본 코드를 헤더파일 클래스 정의파일 메인파일로 분할하여야 하기 때문에
		모두 분할 시킬 예정입니다.
		+ 분할 완료 했습니다.

		연관 파일 Homework02_Ring.h (선언파일)  Homework02_Ring.cpp (정의파일)
	}
*/

#include <iostream>
#include "Ring.h"
using namespace std;

int main() {
	Ring ring;
	ring.Init(1, 1, 4, 2, 2, 9);
	ring.ShowRingInfo();
	return 0;
}