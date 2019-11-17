#include <iostream>
using namespace std;

class SoSimple {
public :
	static int simObjCnt;
	SoSimple() {
		simObjCnt++;
		cout << simObjCnt << "¹øÂ° SoSimple °´Ã¼" << endl;
	}
};

class SoComplex {
public :
	static int cmxObjCnt;
	SoComplex() {
		cmxObjCnt++;
		cout << cmxObjCnt << "¹øÂ° SoComplex °´Ã¼" << endl;
	}
	SoComplex(SoComplex& sc) {
		cmxObjCnt++;
		cout << cmxObjCnt << "¹øÂ° SoComplex °´Ã¼" << endl;
	}
};

int SoSimple::simObjCnt = 0;
int SoComplex::cmxObjCnt = 0;

int main(void) {
	SoSimple sim1;
	cout << SoSimple::simObjCnt << "¹øÂ° SoSimple °´Ã¼ [re]" << endl;
	SoSimple sim2;

	SoComplex cmx1;
	SoComplex cmx2 = cmx1;
	SoComplex();

	return 0;
}