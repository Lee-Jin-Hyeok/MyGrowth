#include <iostream>

class Book {
private :
	char* title;
	char* isbn;
	int price;
public :
	Book(const char* title, const char* isbn, int price) : price(price) {
		this->title = new char[sizeof(title) / sizeof(char) + 1];
		this->isbn = new char[sizeof(isbn) / sizeof(char) + 1];
		strcpy(this->title, title);
		strcpy(this->isbn, isbn);
	}
	void ShowBookInfo() {
		std::cout << "���� : " << this->title << std::endl;
		std::cout << "ISBN : " << this->isbn << std::endl;
		std::cout << "���� : " << this->price << std::endl;
	}
};

class EBook : public Book {
private :
	char* DRMKey;
public :
	EBook(const char* title, const char* isbn, int price, const char* DRMKey) : Book(title, isbn, price) {
		this->DRMKey = new char[sizeof(DRMKey) / sizeof(char) + 1];
		strcpy(this->DRMKey, DRMKey);
	}
	void ShowEBookInfo() {
		Book::ShowBookInfo();
		std::cout << "����Ű : " << DRMKey << std::endl;
	}
};

int main() {
	Book book("���� C++", "555-12345-890-0", 20000);
	book.ShowBookInfo();
	std::cout << std::endl;
	EBook ebook("���� C++ ebook", "555--12345-890-1", 10000, "fdx9w0i8kiw");
	ebook.ShowEBookInfo();
	return 0;
}