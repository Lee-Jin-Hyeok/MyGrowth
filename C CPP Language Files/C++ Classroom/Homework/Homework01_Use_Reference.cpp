/*
	���ϸ� - Homework01_Use_Reference.cpp
	������ - ������
	���� {
		x, y ��ǥ���� ������ �� �ִ� Point ��� ����ü�� ����ؼ� �� ���� Point�� ���ϴ� ���α׷��̴�.
		��, PntAdder �Լ��� ������ �Ʒ��� ���� ������ �ִ�.

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

	cout << "ù ��° ���� x��ǥ�� �Է��ϼ���" << endl;
	cin >> (*point1).xpos;

	cout << "ù ��° ���� y��ǥ�� �Է��ϼ���" << endl;
	cin >> (*point1).ypos;

	cout << "�� ��° ���� x��ǥ�� �Է��ϼ���" << endl;
	cin >> (*point2).xpos;

	cout << "�� ��° ���� y��ǥ�� �Է��ϼ���" << endl;
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