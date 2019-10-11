#ifndef __Ring__H__
#define __Ring__H__

#include <iostream>
using namespace std;

class Point {
private:
	int xpos;
	int ypos;
public:
	Point(int, int);
	void ShowPointInfo() const;
};

class Circle {
private:
	Point point;
	int radius;
public:
	Circle(int, int, int);
	void ShowCircleInfo() const;
};

class Ring {
private:
	Circle circle1;
	Circle circle2;
public:
	Ring(int, int, int, int, int, int);
	void ShowRingInfo() const;
};

#endif