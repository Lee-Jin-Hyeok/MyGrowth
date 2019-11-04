// // 2019_11_04_sixClass.js

// var test = 'This is test';
// console.log(window.test);
// var sayFoo = function() {
//     console.log(this.test);
// };
// sayFoo();



// var value = 100;
// var myObject = {
//     value : 1,
//     func1 : function() {
//         this.value += 1;
//         console.log("func() called. this.value : " + this.value);

//         func2 = function() {
//             this.value += 1;
//             console.log("func2() called. this.value : " + this.value);

//             func3 = function() {
//                 this.value += 1;
//                 console.log("func3() called. this.value : " + this.value);
//             }

//             func3();
//         }

//         func2();
//     }
// };
// myObject.func1();

// // 내부 함수에서 쓰인 this는 자신을 호출한 객체를 가리키는 것이 아니라 전역 객체 즉, window를 가리킨다.
// // 따라서 내부함수인 func2 와 func3 의 this는 window를 가리킨다.



// var value2 = 100;
// var myObject2 = {
//     value2 : 1,
//     func1 : function() {
//         var that = this;
//         this.value2 += 1;
//         console.log("func1() called. this.value2 : " + this.value2);

//         func2 = function() {
//             that.value += 1;
//             console.log("func2() called. this.value2 : " + that.value2);

//             func3 = function() {
//                 that.value2 += 1;
//                 console.log("func3() called. this.value2 : " + that.value2);
//             }
//             func3();
//         }
//         func2();
//     }
// };
// myObject2.func1();

// // 위에서 얘기했듯이 내부 함수에서의 this는 window를 가리킨다.
// // 하지만 본 코드에서는 내부 함수에서 this 대신 myObject2를 가리키는 this를 that에 담아 사용하였다.
// // 따라서 첫 번째 코드와는 다르게 window.value2를 가리키지 않고
// // func1.value2만을 가리키게 되어 2, 3, 4 라는 값이 출력되었다.



// var Person = function(name) {
//     this.name = name;
// };

// var foo = new Person("foo");
// console.log(foo.name);

// // new 키워드를 통해 Person 함수를 호출하는 것이 생성자 함수를 호출하는 것이다.
// // 이렇게 생성자 함수를 호출하게 되면 빈 객체를 만들어 Person 함수가 동작하는데로
// // 빈 객체에 들어갈 프로퍼티를 만든다.
// // 그 다음 그렇게 만들어진 빈 객체 (속성들이 들어간)를 리턴한다.



// var foo = {         // 객체 리터럴 방식으로 객체를 정의
//     name : "foo",
//     age : 35,
//     gender : "man"
// };
// console.dir(foo);

// function Person(name, age, gender, position) {      // 생성자 형식으로 객체를 정의
//     this.name = name;
//     this.age = age;
//     this.gender = gender;
// }

// var bar = new Person("bar", 33, "woman");    // 꼭 new 키워드를 붙여야 한다.
// console.dir(bar);

// var baz = new Person("baz", 25, "man");
// console.dir(baz);

// // 객체 리터럴 방식은 객체 하나를 정의 하지만
// // 생성자 방식은 만들어 놓은 표본을 이용해서 비슷한 객체를 여러 개 만들 수 있다.



// function Person(name, age, gender, position) {
//     this.name = name;
//     this.age = age;
//     this.gender = gender;
// }

// var qux = Person("qux", 20, "man");     // 이렇게 new 키워드를 붙여주지 않으면
// console.log(qux);                       // 일반 함수처럼 만들어버리면 return 값을 지정해주지 않았으므로
//                                         // undefined 가 리턴된다.
// console.log(window.name);
// console.log(window.age);
// console.log(window.gender);
// // 원래 생성자 함수 형식을 사용하면 this가 우리가 만든 빈 객체에 바인딩된다.
// // 하지만 이렇게 일반 함수를 하면 undefined를 리턴하는 것 뿐더러
// // this는 window에 바인딩 된다.



// function Person(name, age, gender) {
//     this.name = name;
//     this.age = age;
//     this.gender = gender;
// }

// var foo = {}

// Person.apply(foo, ["foo", 30, "man"]);      // apply 메소드는 모든 함수의 프로퍼티이다.
// console.dir(foo);                           // 오른쪽에 있는 매개변수를 왼쪽에 있는 객체에 넣는다.



// function myFunction() {
//     console.dir(arguments); // arguments는 유사 배열 객체
//     var args = Array.prototype.slice.apply(arguments);
//     console.dir(args);
// }
// myFunction(1,2,3);
// // apply는 (foo, ["foo", 12, "man"]) 과 같이 해야 하지만
// // call은 (foo, "foo", 12, "man") 과 같이 해서 foo에 프로퍼티를 복사할 수 있다.



// var arrA = [1,2,3];
// var arrB = arrA.slice(0);
// var arrC = arrA.slice();
// var arrD = arrA.slice(1);
// var arrE = arrA.slice(1,2);

// console.log(arrA);
// console.log(arrB);
// console.log(arrC);
// console.log(arrD);
// console.log(arrE);
// // array.slice(a, b) 처럼 함수를 사용하면 array를 index a에서부터 b-1까지를 모두 복사하여 리턴한다.



