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

function myFunction() {
    return true;
}

console.dir(myFunction.prototype);
console.dir(myFunction.prototype.constructor);
// prototype property는 함수가 생성될 때 만들어지며
// 단지 constructor 프로퍼티 하나만 있는 객체를 가리킨다.
// constructor 프로퍼티는 자신과 연결된 함수를 가리킨다.


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


window.onload = function() {
    this.alert("This is the callback function");
};
// 이벤트 핸들러 - 어떤 현상이 일어났을 때 출력되는 함수
// window - 전역 객체
// onload - 창이 업로드 되었을 때, 외부에서 다운로드된 모든 이미지 등등...


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


function Tree(name) {
    this.name = name;
}

var theTree = new Tree('Redwood');
console.log('theTree.constructor is ' + theTree.constructor);



// 2019 10 21 두 번째 교시



function parrent() {
    var a = 100;
    var b = 200;

    function child() {      // 내부 함수 - 함수 안에 함수가 존재할 수 있다.
        var b = 300;
        console.log(a);     // 부모함수의 변수에 접근이 가능하다.
        //console.log(b);     // 부모함수의 변수에 접근해야할지 자기 자신의 변수에 접근해야할지 모호함이 생긴다.
    }
    child();
}
parent();
child();