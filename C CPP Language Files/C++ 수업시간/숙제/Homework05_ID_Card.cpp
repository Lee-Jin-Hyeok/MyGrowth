#include <iostream>
#include <cstring>
using namespace std;

namespace COMP_POS {
	enum { CLERK, SENIOR, ASSIST, MANAGER };

	void ShowPositionInfo(int pos) {
		switch (pos) {
		case CLERK:
			cout << "직급 : 사원" << endl;
			break;

		case SENIOR:
			cout << "직급 : 주임" << endl;
			break;

		case ASSIST:
			cout << "직급 : 대리" << endl;
			break;

		case MANAGER:
			cout << "직급 : 과장" << endl;
			break;

		}
	}
}

class NameCard {
private:
	char* name;
	char* company;
	char* phone;
	int position;
public:
	//생성자 정의
	NameCard(const char* name, const char* company, const char* phone, int position) {
		this->name = new char[strlen(name) + 1];
		this->company = new char[strlen(company) + 1];
		this->phone = new char[strlen(phone) + 1];

		strcpy(this->name, name);
		strcpy(this->company, company);
		strcpy(this->phone, phone);
		this->position = position;
	}
	//ShowNameCardInfo() 멤버함수 정의
	void ShowNameCardInfo() const {
		cout << "이름 : " << name << endl;
		cout << "회사 : " << company << endl;
		cout << "전화번호 : " << phone << endl;
		COMP_POS::ShowPositionInfo(position);
		cout << endl;
	}
	//소멸자 정의
	~NameCard() {
		delete[] name;
		delete[] company;
		delete[] phone;
	}
};

int main() {
	NameCard manClerk("Lee", "ABCEng", "전화번호", COMP_POS::CLERK);
	NameCard manSenior("Hong", "OrangeEng", "전화번호", COMP_POS::SENIOR);
	NameCard manAssist("Kim", "SoGoodComp", "전화번호", COMP_POS::ASSIST);

	manClerk.ShowNameCardInfo();
	manSenior.ShowNameCardInfo();
	manAssist.ShowNameCardInfo();

	return 0;

}