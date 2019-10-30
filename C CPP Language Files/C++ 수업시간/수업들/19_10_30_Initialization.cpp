/*
	int n = 1;		복사 초기화 ( copy initialization )		C 초기화 방법
	int n(1);		직접 초기화 ( direct initialization )	C++ 초기화 방법
			c++에서 복사 초기화를 통해 멤버 변수를 초기화하면 자동으로 직접 초기화로 바꾼다.
	int n{1};
*/ 

#include <iostream>
using namespace std;

class SoSimple {
private:
	int num1;
	int num2;
public:
	SoSimple(int n1, int n2) : num1(n1), num2(n2) {}
	SoSimple(const SoSimple& copy) : num1(copy.num1), num2(copy.num2) {}	// 복사 생성자는 default로 생성된다.
};

int main() {
	SoSimple ss1(1, 2);
	SoSimple ss2(ss1);		

	return 0;
}