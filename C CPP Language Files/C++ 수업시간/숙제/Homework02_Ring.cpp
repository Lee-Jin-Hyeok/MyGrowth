#include "Ring.h"

void Point::Init(int x, int y) {
	xpos = x;
	ypos = y;
}

void Point::ShowPointInfo() const {
	cout << "[" << xpos << ", " << ypos << "]" << endl;
}

void Circle::Init(int x, int y, int radius) {
	point.Init(x, y);
	this->radius = radius;
}

void Circle::ShowCircleInfo() const {
	cout << "radius: " << radius << endl;
	point.ShowPointInfo();
}

void Ring::Init(int x1, int y1, int radius1, int x2, int y2, int radius2) {
	circle1.Init(x1, y1, radius1);
	circle2.Init(x2, y2, radius2);
}

void Ring::ShowRingInfo() const {
	cout << "Inner Circle Info..." << endl;
	circle1.ShowCircleInfo();

	cout << "Outter Circle Info..." << endl;
	circle2.ShowCircleInfo();
}