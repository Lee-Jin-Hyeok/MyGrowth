#include <iostream>
using namespace std;

class SoSimple {
public :
	static int simObjCnt;
	SoSimple() {
		simObjCnt++;
		cout << simObjCnt << "��° SoSimple ��ü" << endl;
	}
};

class SoComplex {
public :
	static int cmxObjCnt;
	SoComplex() {
		cmxObjCnt++;
		cout << cmxObjCnt << "��° SoComplex ��ü" << endl;
	}
	SoComplex(SoComplex& sc) {
		cmxObjCnt++;
		cout << cmxObjCnt << "��° SoComplex ��ü" << endl;
	}
};

int SoSimple::simObjCnt = 0;
int SoComplex::cmxObjCnt = 0;

int main(void) {
	SoSimple sim1;
	cout << SoSimple::simObjCnt << "��° SoSimple ��ü [re]" << endl;
	SoSimple sim2;

	SoComplex cmx1;
	SoComplex cmx2 = cmx1;
	SoComplex();

	return 0;
}