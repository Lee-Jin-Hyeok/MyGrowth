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