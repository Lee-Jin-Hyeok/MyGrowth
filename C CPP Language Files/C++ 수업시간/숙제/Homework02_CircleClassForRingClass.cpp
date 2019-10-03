/*
	���ϸ� ImplementedRingClass.cpp
	������ ������
	���� {
		�� �ڵ�� �������Ʈ���� ���̽��� ����б����� �����ϴ� C++ ���� ��
		���õ� �����򰡸� �����ϱ� ���ؼ� ���� �ڵ��Դϴ�.

		�� �ڵ��� ������ �����򰡸� �ϼ��ϴµ��� �ֽ��ϴ�.
		�� �ڵ�� ���õ� Point Ŭ������ ������� �Ͽ�
		�������� ���̸� �����Ͽ� ������ִ� Circle Ŭ������ �����ϰ�
		�׸� �̿��Ͽ� �� ���� Circle Ŭ���� ��, �� ���� ���� �����ϴ�
		Ring Ŭ������ ������ �ڵ��Դϴ�.

		+ �� �ڵ带 ������� Ŭ���� �������� �������Ϸ� ��Ȱ�Ͽ��� �ϱ� ������
		��� ���� ��ų �����Դϴ�.
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