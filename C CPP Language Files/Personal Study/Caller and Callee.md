## Caller and Callee

보통의 C언어에서 main() 함수가 여러 가지 함수들을 호출한다.
이 때 호출한 main() 함수를 caller, 불려진 함수를 callee 라고 한다.



만약 main() 함수가 printf() 라는 함수를 호출하게 되면
main() 함수가 caller, printf() 라는 함수가 callee가 된다.
또한 main() 함수를 호출자 함수, printf() 함수를 피호출자 함수라고도 한다.



printf() 함수를 쉽게 pritnf("Hello, world!"); 와 같이 사용하게 되는데
printf() 함수의 괄호 안에 존재하는 것들을 실인수,
printf() 함수의 원형인
int printf(const char * format, ...); 에서
format 과 같은 것들을 형식 인자라고 한다.



여기서 실인수를 줄여서 인수, 아규먼트( argument ), 아규먼츠( arguments )라고도 하고
형식 인자를 파라미터( parameter ) 라고도 한다.
하지만 모두 매개변수라고 하는 것이 보통이다.



그리고 피호출자 함수(callee)는 호출자 함수(caller)에게 값을 반환(return) 한다.
