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

function parent() {
    var a = 100;
    var b = 200;

    function child() {      // 내부 함수 - 함수 안에 함수가 존재할 수 있다.
        var b = 300;
        console.log(a);     // 부모함수의 변수에 접근이 가능하다.
        console.log(b);     // 내부함수에서 외부함수로의 접근은 자동으로 가까운 상대를 찾는다.
    }
    child();
}
parent();
//child();                  // 외부에서 내부로의 접근은 불가능하다. 64행을 지워도 불가능한 것으로보아, 그냥 안 되는 것 같다.


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


function parent2() {
    var a = 100;
    var child = function() {
        console.log(a);
    }
    return child;
}

var inner = parent2();          // inner 라는 함수가 child 라는 함수를 가리키게 한다.
inner();                        // 위의 코드에서 외부에서 내부로의 접근이 불가능하기 때문에 이러한 형식으로 내부를 참조할 수 있는 함수를 클로저라고 한다.


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


var self = function() {
    console.log('a');
    return function() {
        console.log('b');
    }
}

self = self();                  // 자기 자신을 재정의할 수 있다. - 함수가 값으로 쓰인다.
self();                         // self 함수의 return 값으로 전달 된 console.log('b'); 를 하는 함수를 받아서 self가 받고 self 가 다시 호출하면 b를 출력하게 된다.
/*
    출력값
    a
    b
*/

function ex(n1,n2) {
    this.n1=n1;
    this.n2=n2;
}
ex.prototype.sum = function() {
    return this.n1+this.n2;
}
var a = new ex(1,1);
// a.sum = function() {
//     return this.n1-this.n2;
// }
var b = new ex(2,2);
var c = new ex(3,3);





// 2019 10 21 세 번째 교시

function func(arg1, arg2) {
    console.log(arg1, arg2);
}

// 없는 인자는 undefined로 대체한다.
func();             // undefined undefined
func(1);            // 1 undefined
func(1, 2);         // 1 2
func(1, 2, 3);      // 1 2          // 최대 갯수를 넘어간 매개변수는 무시한다.


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


function add(a, b) {
    console.dir(arguments);
    return a + b;
}

console.log(add(1));
console.log(add(1, 2));
console.log(add(1, 2, 3));


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


function sum() {
    var result = 0;
    for(var i = 0 ; i < arguments.length ; i++) {
        result += arguments[i];
    }
    return result;
}

console.log(sum(1,2,3));
console.log(sum(1,2,3,4,5,6,7,8,9,10));



var myobject = {
    name : 'foo',
    sayName : function() {
        console.log(this.name);
    }
};

var otherObject = {
    name : 'bar'
};

otherObject.sayName = myObject.sayName;

myObject.sayName();
otherObject.sayName();