/*
	int n = 1;		���� �ʱ�ȭ ( copy initialization )		C �ʱ�ȭ ���
	int n(1);		���� �ʱ�ȭ ( direct initialization )	C++ �ʱ�ȭ ���
			c++���� ���� �ʱ�ȭ�� ���� ��� ������ �ʱ�ȭ�ϸ� �ڵ����� ���� �ʱ�ȭ�� �ٲ۴�.
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
	SoSimple(const SoSimple& copy) : num1(copy.num1), num2(copy.num2) {}	// ���� �����ڴ� default�� �����ȴ�.
};

int main() {
	SoSimple ss1(1, 2);
	SoSimple ss2(ss1);		

	return 0;
}