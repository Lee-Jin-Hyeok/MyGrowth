// 수업 시간 전 연습

var func0 = function() {            // 저번 시간에 했던 것처럼 함수의 리턴값으로 함수를 넣는다.
    return function() {             // 따라서 func0 이라는 함수는 "function" 이라는 함수를 출력하도록하는 함수를 리턴하는 것이다.
        console.log("function");
    }
}

var func1 = func0;                  // func1 이라는 변수에 func0 이라는 함수 자체를 대입함으로써 func1과 func0이 같게 되었다. 12행때, 출력값은 함수이므로 아무 일도 일어나지 않는다.
var func2 = func0();                // func2 라는 변수에 func0 이라는 함수를 실행하여 리턴한 값 즉, console.log("function") 을 리턴하기 때문에 이를 13행 처럼 실행시키면 "function" 이라는 출력을 가진다.

func1();
func2();
// 예상대로 잘 된다는 것을 알게 되었다.


// 2019 10 21 첫 교시~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

