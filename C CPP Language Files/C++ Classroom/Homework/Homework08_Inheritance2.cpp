#include <iostream>
#include <string>

class MyFriendInfo {
private :
	char* name;
	int age;
public :
	MyFriendInfo(const char* name, int age) : age(age) {
		this->name = new char[sizeof(name) / sizeof(char) + 1];
		strcpy(this->name, name);
	}
	void ShowMyFriendInfo() const {
		std::cout << "�̸� : " << this->name << std::endl;
		std::cout << "���� : " << this->age << std::endl;
	}
	~MyFriendInfo() {
		delete[] name;
	}
};

class MyFriendDetailInfo : public MyFriendInfo {
private :
	char* addr;
	char* phone;
public :
	MyFriendDetailInfo(const char* name, int age, const char* addr, const char* phone) : MyFriendInfo::MyFriendInfo(name, age) {
		this->addr = new char[sizeof(addr) / sizeof(char) + 1];
		this->phone = new char[sizeof(phone) / sizeof(char) + 1];
		strcpy(this->addr, addr);
		strcpy(this->phone, phone);
	}
	void ShowMyFriendDetailInfo() const {
		MyFriendInfo::ShowMyFriendInfo();
		std::cout << "�ּ� : " << this->addr << std::endl;
		std::cout << "��ȣ : " << this->phone << std::endl;
	}
	~MyFriendDetailInfo() {
		delete[] addr;
		delete[] phone;
	}
};

int main() {
	MyFriendDetailInfo fren1("�����", 17, "����", "010-111-1111");
	MyFriendDetailInfo fren2("ȫ�ڿ�", 19, "�λ�", "010-222-2222");
	fren1.ShowMyFriendDetailInfo();
	fren2.ShowMyFriendDetailInfo();
	return 0;
}