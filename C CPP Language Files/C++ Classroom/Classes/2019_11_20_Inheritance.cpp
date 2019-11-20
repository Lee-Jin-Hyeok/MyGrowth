#include <iostream>
#include <string>

class Base {
	std::string s;
public:
	Base() : s("기초") {
		std::cout << "기초 클래스" << std::endl;
	}

	void what() {
		std::cout << s << std::endl;
	}
};

class Derived : public Base {
	std::string s;
public:
	Derived() : Base(), s("유도") {
		std::cout << "유도 클래스" << std::endl;
		what();
	}

	void what() {
		std::cout << s << std::endl;
	}
};

int main() {
	std::cout << "===기초 클래스 생성===" << std::endl;
	Base b;

	std::cout << "===유도 클래스 생성===" << std::endl;
	Derived d;

	return 0;
}