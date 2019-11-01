/*
	파일명 19_10_11_ConstructorAndDestructor
	내용 {
		본 코드는 SimpleClass라는 class를 정의하고 생성자[constructor]를 생성해보며 소멸자[destructor]의 형식을 알아보고
		마지막으로 멤버 이니셜라이저[member initialazer]를 사용해보았다.

		생성자 :
			C++에서 객체를 생성할 때 객체 뒤에 괄호를 통해 함수를 사용하듯이 하면
			생성자를 사용할 수 있다.
			생성자는 기본적으로 클래스의 멤버변수를 초기화하는 목적으로 사용된다.

			생성자는 아래의 코드에 표시해놓은 것처럼 생성이 가능하다.
			생성자는 반환형이 존재하지 않으며 아무것도 설정해놓지 않으면 public으로 설정되는 특징을 가지고 있다.
			또한 생성자는 오버로딩이 가능하다.

			하지만 생성자를 정의해놓지 않으면
			SimpleClass() {}
			과 같은 생성자가 자동으로 만들어진다는 것을 기억해놓자.

			+ 자바에서는 생성자를 오버라이딩 하는 것이 불가능하다. 아마 C++에서도 당연히 안 될 것으로 확인이 되나, 확인은 하지 않았다.


		소멸자 :
			C++에서 delete를 사용하여 객체를 소멸시킬 때 사용된다.
			소멸자를 사용하지 않으면 delete를 사용해서 직접 소멸시켜주어야 했지만
			소멸자를 클래스 안에서 정의해주면 굳이 직접 delete 하지 않아도
			자동으로 소멸 시켜준다.

			형식으로는 클래스 이름 앞에 ~를 붙여주는 것이다.


		멤버 이니셜라이저 : 
			생성자보다 좀 더 효율적으로 멤버변수를 초기화하는 방법이다.
			방식은
			SimpleClass(int n1, int n2) : num1(n1), num2(n2) {}
			이다.

			생성자는
			int a;
			a = 10;
			과 같은 형식으로 초기화를 한다고 하면
			멤버 이니셜라이저는
			int a = 10;
			과 같은 형식으로 초기화를 한다.

			따라서 생성자는 디버깅을 해보면 객체를 생성할 때 클래스에 들어가서 초기화를 하는 과정이 드러나지만
			멤버 이니셜라이저는 디버깅을 해보면 객체를 생성하는 동시에 초기화가 되기 때문에 클래스 안에 들어가는 과정을 삭제한다.
	}
*/

#include <iostream>
using namespace std;

class SimpleClass {
private :
	int num1;
	int num2;
public :

	/*	생성자
	SimpleClass() {
		num1 = 0;
		num2 = 0;
	}
	SimpleClass(int n) {
		num1 = n;
		num2 = 0;
	}
	SimpleClass(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}
	*/

	/*
	SimpleClass() : num1(0), num2(0) {	// Member Initializer

			생성자는
				int n;
				n = 10;
			이라면
			멤버 이니셜라이저는
				int n = 10;
			과 같이 작동한다.
		
	}
	*/

	~SimpleClass() {
		// 소멸자 - 생성자와 같이 자동 생성 가능
	}

	void ShowData() const {
		cout << num1 << " " << num2 << endl;
	}
};

int main() {
	SimpleClass sc1;
	sc1.ShowData();

	SimpleClass sc2(100);
	sc2.ShowData();

	SimpleClass sc3(100, 200);
	sc3.ShowData();
	
	return 0;
}