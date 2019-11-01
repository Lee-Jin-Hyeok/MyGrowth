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
	//������ ����
	NameCard(const char* name, const char* company, const char* phone, int position) {
		this->name = new char[strlen(name) + 1];
		this->company = new char[strlen(company) + 1];
		this->phone = new char[strlen(phone) + 1];

		strcpy(this->name, name);
		strcpy(this->company, company);
		strcpy(this->phone, phone);
		this->position = position;
	}
	//ShowNameCardInfo() ����Լ� ����
	void ShowNameCardInfo() const {
		cout << "�̸� : " << name << endl;
		cout << "ȸ�� : " << company << endl;
		cout << "��ȭ��ȣ : " << phone << endl;
		COMP_POS::ShowPositionInfo(position);
		cout << endl;
	}
	//�Ҹ��� ����
	~NameCard() {
		delete[] name;
		delete[] company;
		delete[] phone;
	}
};

int main() {
	NameCard manClerk("Lee", "ABCEng", "��ȭ��ȣ", COMP_POS::CLERK);
	NameCard manSenior("Hong", "OrangeEng", "��ȭ��ȣ", COMP_POS::SENIOR);
	NameCard manAssist("Kim", "SoGoodComp", "��ȭ��ȣ", COMP_POS::ASSIST);

	manClerk.ShowNameCardInfo();
	manSenior.ShowNameCardInfo();
	manAssist.ShowNameCardInfo();

	return 0;

}