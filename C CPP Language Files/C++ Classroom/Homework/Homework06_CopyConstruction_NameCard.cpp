#include <iostream>
#include <cstring>
using namespace std;

namespace COMP_POS {
	enum { CLERK, SENIOR, ASSIST, MANAGER };

	void ShowPositionInfo(int pos) {
		switch (pos) {
		case CLERK:
			cout << "���� : ���" << endl;
			break;

		case SENIOR:
			cout << "���� : ����" << endl;
			break;

		case ASSIST:
			cout << "���� : �븮" << endl;
			break;

		case MANAGER:
			cout << "���� : ����" << endl;
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
	NameCard(const char* name, const char* company, const char* phone, int position) : position(position){
		this->name = new char[strlen(name) + 1];
		this->company = new char[strlen(company) + 1];
		this->phone = new char[strlen(phone) + 1];

		strcpy(this->name, name);
		strcpy(this->company, company);
		strcpy(this->phone, phone);
	}
	NameCard(NameCard& nc) : position(nc.position) {
		this->name = new char[strlen(nc.name) + 1];
		this->company = new char[strlen(nc.company) + 1];
		this->phone = new char[strlen(nc.phone) + 1];

		strcpy(this->name, nc.name);
		strcpy(this->company, nc.company);
		strcpy(this->phone, nc.phone);
	}
	void ShowNameCardInfo() const {
		cout << "�̸� : " << name << endl;
		cout << "ȸ�� : " << company << endl;
		cout << "��ȭ��ȣ : " << phone << endl;
		COMP_POS::ShowPositionInfo(position);
		cout << endl;
	}
	~NameCard() {
		delete[] name;
		delete[] company;
		delete[] phone;
	}
};

int main() {
	NameCard manClerk("Lee", "ABCEng", "��ȭ��ȣ", COMP_POS::CLERK);
	NameCard copy1 = manClerk;
	NameCard manAssist("Kim", "SoGoodComp", "��ȭ��ȣ", COMP_POS::ASSIST);
	NameCard copy2 = manAssist;

	copy1.ShowNameCardInfo();
	copy2.ShowNameCardInfo();

	return 0;

}