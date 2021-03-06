// 2019 10 07 첫 교시~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

var arr = ['one', 'two', 'three', 'four'];
console.log(arr);
console.log(arr.length);

arr.splice(1, 2, 'five', 'six');
// splice는 delete와 다르게 직접 삭제하는 것이라서 인덱스가 바뀐다.
// splice(시작 인덱스, 삭제할 갯수, 삭제한 프로퍼티에 들어갈 요소(생략가능));
// 과 같이 사용할 수 있다.
console.log(arr);
console.log(arr.length);

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

var foo = new Array(3);         // Array의 인자값에 수 하나만 들어가게 되면 배열의 길이를 정해주는 것이다.
console.log(foo);
console.log(foo.length);

var bar = new Array(1,2,3);     // 하지만 Array의 인자값에 1,2,3과 같이 인자값을 주면 인자를 준 갯수의 배열의 길이를 설정하고 초깃값을 설정해준다.
console.log(bar);
console.log(bar.length);

let d = new Array(1);           // 뭔짓을 해도 수 하나의 값을 이용해서 초기화된 배열을 만들 순 없다.
console.log(d);
console.log(d.length);

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

var arr = ['bar'];              // 유사 배열 객체 : length 프로퍼티를 가지고 있는 객체
var obj = {
    name : 'foo',
    leength : 1
};

arr.push('baz');
console.log(arr);
// obj.push('baz');

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

var add1 = 1 + 2;               // 3            number
var add2 = 'my' + ' string';    // my string    string
var add3 = 1 - 'string';        // NaN          number
var add4 = 'string' + 1;        // string1      string

console.log(add1); 
console.log(add2);
console.log(add3);
console.log(add4);

var arr1 = ['a', 'b', 'c', 'd'];
var arr2 = ['e', 'string'];

var add5 = arr1 + arr2;
console.log(add5);              // a,b,c,de,string      배열의 끝부분끼리는 붙는 것을 알 수 있다.

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

console.log(1=='1');        // == 동등 연산자 ( 값만 비교한다. )
console.log(1==='1');       // == 일치 연산자 ( 값뿐만 아니라 type까지 확인한다. )

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

console.log("!!0 = " + !!0);        // !! 연산자는 부정을 또 부정함으로써 다시 원래 type으로 되돌아온다. 하지만 ! 연산자의 반환값은 boolean 형이므로 자동으로 boolean 형으로 바꿔주는 역할을 한다.
console.log("!!1 = " + !!1);
console.log("!!'string' = " + !!'string');
console.log("!!'' = " + !!'');
console.log("!!true = " + !!true);
console.log("!!false = " + !!false);
console.log("!!null = " + !!null);
console.log("!!undefined = " + !!undefined);
console.log("!!{} = " + !!{});
console.log("!![1,2,3] = " + !![1,2,3]);

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 2019 10 07 두 번째 교시

function add(x, y) {            // 함수 선언식
    return x + y;               // 함수를 선언만 하는 것이다.
}
console.log(add(3, 4));

var add = function(x, y) {      // 함수 표현식
    return x + y;               // 함수를 변수에 담는 것이므로, add 함수를 plus 변수에 담을 수 있다.
}                               // 변수에 담는 함수는 굳이 이름을 설정할 필요가 없다.
var plus = add;
console.log(add(3, 4));
console.log(plus(3,4));

var add = function sum(x, y) {      // add 변수에 sum 함수를 넣는다고 해도 sum은 따로 호출할 수 없다.
    return x + y;
}

console.log(add(3,4));
// console.log(sum(3,4));

var factorialVar = function factorial(n) {      // 위와 같이 factorialVar 변수에 들어간 함수는 호출할 수 있지만 factorial 함수를 직접 호출할 수는 없다.
    if(n <= 1 ) return 1;                       // 하지만 factorialVar 변수 안에 존재하는 factorial 함수를 재귀적으로 호출하는 것은 가능하다.
    else return n*factorial(n-1);
}

console.log(factorialVar(3));
// console.log(factorial(3));

var add = new Function('x' , 'y' , 'return x+y');       // 생성자 함수를 이용한 함수 생성법 - 잘 쓰이지 않는다.
console.log(add(3,4));

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

function add2(x, y) {           // 함수의 선언문 방식에서는 함수가 선언되기 전에 함수를 사용하게 되면 함수 선언문을 위로 올린다.
    return x + y;
}


// console.log(add3(50, 50));
var add3 = function(x, y) {           // 함수 표현식 방식에서는 함수가 선언되기 전에 함수를 사용하면 오류가 발생한다.
    return x + y;
};
console.log(add3(60, 60));

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// 2019 10 07 세 번째 교시

function add(x, y) {
    return x + y;
}

add.result = add(3,2);          // 함수도 객체이다.
add.status = 'OK';              // 객체이므로 프로퍼티를 추가할 수 있다.

console.log(add.result);
console.log(add.status);
console.log(add.code);

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

var bar = function() {
    return 100;
};
console.log(bar());

var obj = {};                   // 빈 객체 안에 함수를 담아서 호출할 수 있다.
obj.baz = function() {
    return 200;
}
console.log(obj.baz());

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

var foo = function(fun) {
    fun();
}

foo(function() {            // 함수의 매개변수로 함수를 줄 수 있다.
    console.log('Function can be used as the argument');
})

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

var foo = function() {      // 함수의 리턴 값으로 함수를 줄 수 있다.
    return function() {
        console.log('this function is the return value');
    }
}

var bar = foo();
bar();

// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

function func0() {}

function func1(x) {
    return x;
}

function func2(x, y) {
    return x + y;
}

function func3(x, y, z) {
    return x + y + z;
}

console.log("func0.length : " + func0.length);
console.log("func1.length : " + func1.length);
console.log("func2.length : " + func2.length);
console.log("func3.length : " + func3.length);