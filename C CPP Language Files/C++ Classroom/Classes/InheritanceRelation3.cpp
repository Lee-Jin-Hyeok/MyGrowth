#include <iostream>

class Person {
public :
	void Sleep() {
		std::cout << "sleep" << std::endl;
	}
	virtual void ShowInfo() {
		std::cout << "Person info" << std::endl;
	}
};

class Student : public Person {
public :
	void Study() {
		std::cout << "study" << std::endl;
	}
	void ShowInfo() {
		std::cout << "Student info" << std::endl;
	}
};

class PartTimeStudent : public Student {
public :
	void Work() {
		std::cout << "work" << std::endl;
	}
	void ShowInfo() {
		std::cout << "PartTimeStudent info" << std::endl;
	}
};

int main() {
	Person* ptr1 = new Student();
	Person* ptr2 = new PartTimeStudent();
	Student* ptr3 = new PartTimeStudent();

	ptr1->Sleep();
	ptr2->Sleep();
	ptr3->Sleep();

	ptr1->ShowInfo();
	ptr2->ShowInfo();
	ptr3->ShowInfo();

	delete ptr1;
	delete ptr2;
	delete ptr3;

	return 0;
}