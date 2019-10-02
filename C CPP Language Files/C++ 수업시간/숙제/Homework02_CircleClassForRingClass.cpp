#include <iostream>
using namespace std;

class Point {
private :
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
private :
	int radius;
public :
	void Init(int radius) {
		this->radius = radius;
	}

	void ShowCircleInfo() const {
		cout << "radius: " << radius << endl;
	}
};

class Ring {
private :
	Point poi1;
	Point poi2;

	Circle cir1;
	Circle cir2;

public :
	void Init(int x1, int y1, int radius1, int x2, int y2, int radius2) {
		poi1.Init(x1, y1);
		poi2.Init(x2, y2);
		cir1.Init(radius1);
		cir2.Init(radius2);
	}

	void ShowRingInfo() const {
		cout << "Inner Circle Info..." << endl;
		cir1.ShowCircleInfo();
		poi1.ShowPointInfo();

		cout << "Outter Circle Info..." << endl;
		cir2.ShowCircleInfo();
		poi2.ShowPointInfo();
	}
};

int main() {
	Ring ring;
	ring.Init(1, 1, 4, 2, 2, 9);
	ring.ShowRingInfo();
	return 0;
}