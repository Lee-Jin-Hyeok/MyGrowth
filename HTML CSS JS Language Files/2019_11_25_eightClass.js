// 복습

/*
var myObject = {
    name : "LeeJinHyoek",
    sayName : function() {
        console.log("this.name : " + this.name);
    }
}

myObject.sayName();                                 // myObject 라는 객체에는 sayName이라는 프로퍼티가 존재하고 sayName에서의 this는 이 sayName()이라는 함수를 호출한 myObject를 가리킨다.
console.log(myObject.hasOwnProperty("name"));       // hasOwnProperty() 함수는 매개변수로 전달된 문자열의 이름을 가진 프로퍼티가 존재하는지 검사하고 있으면 true, 없으면 false를 반환한다.
console.log(myObject.hasOwnProperty("nickNae"));    // 따라서 hasOwnProperty("name");은 true가 반환되고, 아래는 false가 반환된다.
myObject.sayNickName();                             // myObject에는 sayNickName() 이라는 함수가 존재하지 않으므로 타입에러가 발생한다.
*/


// 1교시

/*
String.prototype.testMethod = function() {
    console.log("This is the String.prototype.testMethod()");
}

var str = "this is test";       // str 이라는 변수를 String으로 변환

str.testMethod();               // str.testMethod(); 를 통해 str이라는 String.prototype에 testMethod() 라는 함수를 동적으로 할당할 수 있다.

console.dir(String.prototype);
*/