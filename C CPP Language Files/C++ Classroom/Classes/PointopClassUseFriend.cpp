#include <iostream>
using namespace std;

class Point;

class PointOP {
private:
	int opcnt;
public:
	PointOP() : opcnt(0) {}

	Point PointAdd(const Point&, const Point&);
	Point PointSub(const Point&, const Point&);
	~PointOP()
	{
		cout << "Operation times: " << opcnt << endl;
	}
};

class Point {
private:
	int x;
	int y;
public:
	Point(const int& xpos, const int& ypos) : x(xpos), y(ypos) {}
	friend Point PointOP::PointAdd(const Point& pnt1, const Point& pnt2);
	friend Point PointOP::PointSub(const Point& pnt1, const Point& pnt2);
	friend void ShowPointPos(const Point& pos);
};

Point PointOP::PointAdd(const Point& pnt1, const Point& pnt2) {
	Point point(pnt1.x + pnt2.x, pnt1.y + pnt2.y);
	(this->opcnt)++;
	return point;
}

Point PointOP::PointSub(const Point& pnt1, const Point& pnt2) {
	Point point(pnt1.x - pnt2.x, pnt1.y - pnt2.y);
	(this->opcnt)++;
	return point;
}

int main(void) {
	Point pos1(1, 2);
	Point pos2(2, 4);
	PointOP op;

	ShowPointPos(op.PointAdd(pos1, pos2));
	ShowPointPos(op.PointSub(pos2, pos1));
	return 0;
}

void ShowPointPos(const Point& pos) {
	cout << "x : " << pos.x << ", y : " << pos.y << endl;
}