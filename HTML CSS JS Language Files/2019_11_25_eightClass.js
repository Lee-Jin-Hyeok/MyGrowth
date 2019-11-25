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

// 2교시

/*
function Person(name) {                         
    this.name = name;
}
                                                // 생성자 함수 정의
console.log(Person.prototype.constructor);      // Person.prototype 객체에는 constructor 라는 프로퍼티를 가지고 있는데 그 constructor는 생성자 함수인 Person()을 가리킨다.

var foo = new Person("foo");                    // foo 라는 객체를 생성자 함수를 이용해서 정의
console.log(foo.country);                       // foo에는 country 라는 프로퍼티가 존재하지 않고 prototype 체이닝을 통해 Object.prototype에 가서도 country 라는 프로퍼티는 존재하지 않으므로 undefined가 출력된다.

Person.prototype = {                            // 이미 존재하는 Person.prototype에다가 새로운 객체를 덮어씌우는 것이 아니라 새로운 객체를 만들어서 이 다음부터는 이 객체를 가리키도록 만든다.
    country : "korea",
};

console.log(Person.prototype.constructor);      // Person.prototype.constructor는 원래는 존재했지만 지금은 foo를 통해서 밖에 접근할 수 없다.
//foo.prototype = Person.prototype;
                                                // 하지만 Person.prototype에 constructor라는 프로퍼티가 존재하지 않으므로 Object.prototype에 접근하여 constructor가 존재하는지 확인하게 된다.
                                                // 이때 Object.prototype은 Object() 생성자 함수에 의해서 만들어졌기 때문에 Object.prototype에도 constructor 라는 프로퍼티가 존재한다.
                                                // 따라서 Person.prototype.constructor는 Object() 생성자 함수를 가리키게 된다.

//var bar = new Person("bar");                    // bar라는 객체를 생성자 함수를 통해서 정의하였다.
                                                // 이 bar라는 객체는 foo와 다르게 새로 만들어진 Person.prototype을 가리키게 된다.
console.log(foo.country);                       // foo 객체는 Person.prototype이 새로 만들어지기 전에 만들어진 객체이기 때문에 Person.prototype이 변경되기 전의 prototype을 가리키고 있으므로 undefined가 출력되게 된다.
//console.log(bar.country);                       // bar.prototype은 Person.prototype을 가리키게 되므로 bar.country는 korea를 출력하게 된다.
console.log(foo.constructor);                   // 따라서 foo.constructor는 다시 Person() 생성자 함수를 가리키게 되고
//console.log(bar.constructor);                   // bar.constructor는 Object() 생성자 함수를 가리키게 된다.
*/



/*
function Person(name) {                         // 생성자 함수 정의
    this.name = name;
}

Person.prototype.country = "Korea";             // Person.prototype에 country 프로퍼티를 동적할당하여 Korea라는 초깃값을 설정

var foo = new Person("foo");                    // Person() 이라는 생성자 함수를 이용하여 foo 라는 객체 생성
var bar = new Person("bar");                    // Person() 이라는 생성자 함수를 이용하여 bar 라는 객체 생성
console.log(foo.country);                       // foo.country와 bar.country는 당연하게도 Korea 라는 문자열을 출력
console.log(bar.country);
foo.country = "USA";                            // Person.prototype 이 아니라 foo 객체 하나의 country 라는 프로퍼티를 바꿈

console.log(foo.country);                       // foo 객체의 country 프로퍼티의 값을 USA로 바꾸었기 때문에 USA라는 문자열 출력                     // USA
console.log(bar.country);                       // 바꾼것은 foo의 객체이지 bar의 객체가 아니기 때문에 가리키는 것이 서로 다르다는 것을 알 수 있다.    // Korea
*/



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
*/



/*
function execute(param1, param2) {
    var a = 1;
    var b = 2;
    function func() {
        return a+b;
    }
    return param1 + param2 + func();
}
execute(3,4);
// 1. 활성 객체 생성
// 실행 컨텍스트가 생성되면 자바스크립트 엔진은 해당 컨텍스트에서 실행에 필요한 여러 가지
// 정보를 담을 객체를 생성이 새로 만들어진 컨텍스트로 접근 가능하게 되어 있다.

// 2. arguments객체 생성
// 앞서 만들어진 활성 객체는 arguments 프로퍼티로 이 arguments 객체를 참조한다.

// 3. 스코프 정보 생성
// 현재 컨텍스트의 유효 범위를 나타내는 스코프 정보를 생성한다.
// 이 스코프 정보는 현재 실행 중인 실행 컨텍스트 안에서 연결리스트와 유사한 형식으로 만들어진다.
// 현재 생성된 활성 객체가 스코프 체인의 제일

// 4. 변수 생성
// 현재 실행 컨텍스트 내부에서 사용되는 지역 변수의 생성이 이루어진다.(활성 객체 = 변수 객체)
// 변수 객체 안에서 호출된 함수 인자는 각각의 프로퍼티가 만들어지고 그 값이 활당된다.
// 주의할 점은 이 과정에서 변수나 내부 함수를 단지 메모리에 생성하고,
// 초기화는 각 변수나 함수에 해당하는 표현식이 실행하기 전까지는 이루어지지 않는다.

// 5. this 바인딩

// 6. 코드 실행
// 하나의 실행 컨텍스트가 생성되고 변수 객체가 만들어진 후에 코드에 잇는 여러 가지 표현식 실행이 이루어진다.
// 이렇게 실행되면서 변수의 초기화 및 연산, 또 다른 함수 실행 등이 이루어진다.
*/