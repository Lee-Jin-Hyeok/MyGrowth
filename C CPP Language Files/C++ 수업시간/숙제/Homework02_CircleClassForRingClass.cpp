/*
	파일명 ImplementedRingClass.cpp
	제작자 이진혁
	내용 {
		본 코드는 대덕소프트웨어 마이스터 고등학교에서 진행하는 C++ 수업 중
		제시된 수행평가를 진행하기 위해서 만든 코드입니다.

		본 코드의 목적은 수행평가를 완수하는데에 있습니다.
		본 코드는 제시된 Point 클래스를 기반으로 하여
		반지름의 길이를 포함하여 출력해주는 Circle 클래스를 정의하고
		그를 이용하여 두 개의 Circle 클래스 즉, 두 개의 원을 정의하는
		Ring 클래스를 정의한 코드입니다.

		+ 본 코드를 헤더파일 클래스 정의파일 메인파일로 분활하여야 하기 때문에
		모두 분할 시킬 예정입니다.
	}
*/

#include <iostream>
using namespace std;

class Point {
private:
	int xpos;
	int ypos;

public:
	void Init(int x, int y) {
		xpos = x;
		ypos = y;
	}

	void ShowPointInfo() const {
		cout << "[" << xpos << ", " << ypos << "]" << endl;
	}
};

class Circle {
private:
	Point point;
	int radius;
public:
	void Init(int x, int y, int radius) {
		point.Init(x, y);
		this->radius = radius;
	}

	void ShowCircleInfo() const {
		cout << "radius: " << radius << endl;
		point.ShowPointInfo();
	}
};

class Ring {
private:
	Circle circle1;
	Circle circle2;

public:
	void Init(int x1, int y1, int radius1, int x2, int y2, int radius2) {
		circle1.Init(x1, y1, radius1);
		circle2.Init(x2, y2, radius2);
	}

	void ShowRingInfo() const {
		cout << "Inner Circle Info..." << endl;
		circle1.ShowCircleInfo();

		cout << "Outter Circle Info..." << endl;
		circle2.ShowCircleInfo();
	}
};

int main() {
	Ring ring;
	ring.Init(1, 1, 4, 2, 2, 9);
	ring.ShowRingInfo();
	return 0;
}