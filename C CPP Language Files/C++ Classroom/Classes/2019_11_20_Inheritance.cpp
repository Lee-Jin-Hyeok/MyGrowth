#include <iostream>
#include <string>

class Base {
	std::string s;
public:
	Base() : s("����") {
		std::cout << "���� Ŭ����" << std::endl;
	}

	void what() {
		std::cout << s << std::endl;
	}
};

class Derived : public Base {
	std::string s;
public:
	Derived() : Base(), s("����") {
		std::cout << "���� Ŭ����" << std::endl;
		what();
	}

	void what() {
		std::cout << s << std::endl;
	}
};

int main() {
	std::cout << "===���� Ŭ���� ����===" << std::endl;
	Base b;

	std::cout << "===���� Ŭ���� ����===" << std::endl;
	Derived d;

	return 0;
}