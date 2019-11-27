#include <iostream>

class Rectangle {
private :
	int height;
	int width;
public :
	Rectangle(int height, int width) : height(height), width(width) {}
	void ShowAreaInfo() {
		std::cout << "¸éÀû : " << height * width << std::endl;
	}
};

class Square : public Rectangle {
public :
	Square(int hw) : Rectangle(hw, hw) {}
};

int main() {
	Rectangle rec(4, 3);
	rec.ShowAreaInfo();

	Square sqr(7);
	sqr.ShowAreaInfo();
	return 0;
}