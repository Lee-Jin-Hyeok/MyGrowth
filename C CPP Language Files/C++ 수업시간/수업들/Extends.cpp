#include <iostream>
using namespace std;

class Calculator {
private:
	int num1;
	int num2;
public:
	Calculator(int num1, int num2) : num1(num1), num2(num2) {}
	void add() { printf("%d + %d = %d\n", this->num1, this->num2, this->num1 + this->num2); }
	void sub() { printf("%d - %d = %d\n", this->num1, this->num2, this->num1 - this->num2); }
	void mul() { printf("%d * %d = %d\n", this->num1, this->num2, this->num1 * this->num2); }
	void div() { printf("%d / %d = %d\n", this->num1, this->num2, this->num1 / this->num2); }
};

class ReinforcedCalculator : public Calculator {
private :
	int num1;
	int num2;
public :
	ReinforcedCalculator(int num1, int num2) : num1(num1), num2(num2) {}
	void add() { printf("[add]\n%d + %d = %d\n", this->num1, this->num2, this->num1 + this->num2); }
};

int main() {
	Calculator cc1(1, 2);
	cc1.add();

	ReinforcedCalculator cc2(1, 2);
	cc2.add();

	return 0;
}