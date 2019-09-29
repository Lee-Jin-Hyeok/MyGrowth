/*
	파일명 - Homework01_Use_Reference.cpp
	제작자 - 이진혁
	내용 {
		x, y 좌표값을 저장할 수 있는 Point 라는 구조체를 사용해서 두 개의 Point를 더하는 프로그램이다.
		단, PntAdder 함수의 형식은 아래와 같이 정해져 있다.

	}
*/

#include <iostream>
#include <string.h>
#include <stdlib.h>
using namespace std;

typedef struct __Point {
	int xpos;
	int ypos;
} Point;

Point& PntAdder(const Point&, const Point&);

int main() {
	Point* point1 = new Point;
	Point* point2 = new Point;

	cout << "첫 번째 점의 x좌표를 입력하세요" << endl;
	cin >> (*point1).xpos;

	cout << "첫 번째 점의 y좌표를 입력하세요" << endl;
	cin >> (*point1).ypos;

	cout << "두 번째 점의 x좌표를 입력하세요" << endl;
	cin >> (*point2).xpos;

	cout << "두 번째 점의 y좌표를 입력하세요" << endl;
	cin >> (*point2).ypos;

	Point& point3 = PntAdder(*point1, *point2);

	cout << "Point xpos : " << point3.xpos << endl;
	cout << "Point ypos : " << point3.ypos << endl;

	delete point1;
	delete point2;
	delete& point3;

	return 0;
}

Point& PntAdder(const Point& p1, const Point& p2) {
	Point* point = new Point;
	(*point).xpos = p1.xpos + p2.xpos;
	(*point).ypos = p1.ypos + p2.ypos;

	return *point;
}