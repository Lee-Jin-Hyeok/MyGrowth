/*
console.log("This is global context");
function ExContext1() {
    console.log("This is ExContext1");
}
function ExContext2() {
    ExContext1();
    console.log("This is ExContext2");
}
ExContext2();

// 자바스크립트는 컨텍스트 단위로 실행된다.
// 자바스크립트는 실행되게 되면 window 라는 전역 컨텍스트를 스택에 올린다.
// 그리고 자바스크립트가 끝날 때 까지 내려오지 않는다.
// 이 전역 컨텍스트에서 ExContext1, ExContext2 컨텍스트를 스택에 올리게 되면 전역 컨텍스트 위에 스택처럼 쌓이게 된다.

// 본 코드에서는 전역 컨텍스트가 먼저 쌓이고 그 다음에 실행된 ExContext2 컨텍스트가 쌓이고 다음엔 ExContext1 컨텍스트가 쌓이게 되며 실행이 끝나게 되면
// ExContext1 -> ExContext2 -> 전역 Context 순으로 스택에서 pop 되게 된다.
*/




/*
var var1 = 1;
var var2 = 2;
console.log(var1);
console.log(var2);
// 코드를 실행하면 먼저 전역 실행 컨텍스트가 생성되고 변수 객체가 만들어진다.
// 현재 전역 실행 컨텍스트 단 하나만 실행되고 있어 참조할 상위 컨텍스트가 없다.
// 자신이 최상위에 위치하는 변수 객체이다.
// 이 변수 객체의 스코프 체인은 자기 자신만을 가진다.

// 각각의 함수는 [[scope]] 프로퍼ㅓ티로 자신이 생성된 실행 컨텍스의 스코프 체인을 참조한다.
// 함수가 실행되는 순간 실행 컨텍스트가 만들어지고,
// 이 실행 컨텍스트는 실행된 함수의 [[scope]] 프로퍼티를 기반으로 새로운 스코프 체인을 만든다.
*/


/*
var var1 = 1;
var var2 = 2;
function func() {
    var var1 = 10;
    var var2 = 20;
    console.log(var1);
    console.log(var2);
}

func();
console.log(var1);
console.log(var2);

// 함수 객체가 생성될 때, 그 함수 객체의 [[scope]]는 현재 실행되는
//  텍스트의 변수 객체에 있는 [[scope]]를 그래도 가진다.
//  수 객체가 실행되면서 생성된 실행 컨텍스트는 자신이 사용할 스코프 체인에
//  재 실행되는 함수 객체의 [[scope]] 프로퍼티를 복사하고,
//  롭게 생성된 변수 객체를 해당 체인의 제일 앞에 복사한다.
//  코프 체인 = 현재 실행중인 컨텍스트 변수 객체 + 상위 컨텍스트 스코프 체인
*/



/*
var value = "value1";
function printValue() {
    return value;
}

function printFunc(func) {
    var value = "value2";
    console.log(func());
}
printFunc(printValue);

// 본 코드에서는 결과적으로 value1 라는 값이 출력되게 된다.
// 일반적으로 봤을 때는 value2 라는 값이 출력되는 것이 옳다라고 생각할 수 있다.

// 처음에는 전역 컨텍스트가 실행되고 그 위에 printFunc라는 함수가 실행되었으므로 printFunc라는 컨텍스트가 쌓여서 실행되게 된다.
// 이 상태에서 console.log() 의 매개변수에 func()를 실행함으로써 printValue() 라는 함수를 실행시키게 된다.
// 변수를 사용할 때에는 스코프 체이닝에 따라서 그 실행을 한 컨텍스트에 존재하는 value를 먼저 찾게 된다.
// 하지만 func라는 함수를 실행한 곳은 printFunc 라는 컨텍스트 위에서 실행되지만 func 즉, printValue()는
// printFunc 라는 함수 안에 정의된 것이 아니라 전역 컨텍스트 위에 정의되어 있기 때문에 value1 이라는 값이 출력되게 된다.
*/


/*
function outerFunc() {
    var x = 10;
    var innerFunc = function() {
        console.log(x);
    }
    return innerFunc;
}

var inner = outerFunc();
inner();

// 여기서의 innerFunc을 클로저라고 부르며 이는 outerFunc의 지역변수 x에 엮여 있다.
// 클러저에 의해 참조되는 외부 변수 x를 자유 변수라고 한다.
*/