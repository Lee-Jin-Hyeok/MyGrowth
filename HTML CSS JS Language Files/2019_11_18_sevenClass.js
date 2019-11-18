/*
function Person(name, age, gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
}

var temp1 = {};

Person.apply(temp1, ['lee', 17, 'man']);
console.log(temp1.name + " " + temp1.age + " " + temp1.gender);
        // lee 17 man
var temp2 = new Person('lee', 17, 'man');
console.log(temp2.name + " " + temp2.age + " " + temp2.gender);
        // lee 17 man

// 두 문장이 같은 문장이다.
// 왜 사용하는 지 잘 모르겠다.
// 일단 apply는 첫 번째 인자로 Person의 this가 가리키는 객체를 지정하고
// 두 번째 인자가 본 생성자 함수의 매개변수로 넘겨주는 것을 말한다.
*/



/*
function Person(name) {
    this.name = name;
}

var foo = new Person('foo');

console.dir(Person);
console.dir(foo);

console.dir(Person.prototype);
console.dir(Person.prototype.prototype);

// 생성자 함수가 호출되면 그 생성자 함수의 프로토타입을 만든다.
// 그 생성자 함수의 프로토타입은 constructor 라는 프로퍼티를 가진다.
// 이 constructor 프로퍼티는 그 생성자 함수를 가리키고
// 생성자 함수의 프로토타입도 하나의 객체이므로 생성자 함수의 프로토타입의 프로토타입은 모든 객체의 조상인 Object.prototype이다.
// 또한 생성자 함수가 호출되면 생성자 함수는 빈객체를 하나 만들어서 빈 객체를 가리키게 된다.
// 그 가리킨 빈 객체도 객체이므로 원래는 생성자 함수를 가리켜야 할 것 같지만
// 빈객체는 생성자 함수의 프로토타입을 가리키게 된다.
// 이렇게 만들어진 생성자 함수의 호출이 끝나게 되면 return 값으로 빈객체를 리턴한다.


// 따라서 new Person('foo') 를 통해 생성자 함수가 호출된다.
// 이렇게 Person 생성자 함수가 호출되었으므로 Person.prototype 이 만들어지고
// 빈 객체가 만들어져서 Person 생성자 함수가 빈 객체를 가리키게 된다.
// Person 생성자 함수의 인자값인 'foo'를 넘겨주었기 때문에
// 빈 객체에는 name 이라는 프로퍼티를 갖게 되고 name 이라는 프로퍼티에는 'foo' 라는 값이 대입되게 된다.
// 또한 Person.prototype 객체에는 constructor 라는 프로퍼티가 있는데 이 constructor 라는 프로퍼티는 Person 생성자 함수를 가리키게 된다.
// 그리고 빈 객체 ( foo 라는 생성자 값이 들어간 객체 ) 의 프로토타입은 Person 생성자 함수가 아닌 Person.prototype 이 된다.
// 그리고 이 빈 객체를 리턴함으로써 foo 라는 객체에 대입된다.
*/


/*
var myObject = {
    name : 'foo',
    sayName : function() {
        console.log('My Name is ' + this.name);
    }
};

myObject.sayName();                                 // My Name is foo
console.log(myObject.hasOwnProperty('name'));       // true
console.log(myObject.hasOwnProperty('nickName'));   // false
// myObject.sayNickName();                          // 오류 발생

// myObject에는 hasOwnProperty 라는 프로퍼티가 존재하지 않는다.
// 하지만 오류가 발생하지 않고 68행이 실행 된다.
// 이는 프로토타입 체이닝이라는 문법 덕분이다.
// myObject의 prototype으로는 Object.prototype이 있다.
// 따라서 myObject 에 존재하지 않는 프로퍼티를 사용하려고 할 때
// 프로토타입을 통해서 Object.prototype까지 프로퍼티가 존재하는지 확인한다.
// 그리고 Object() 라는 생성자 함수가 있기 때문에 Object.prototype이라는 곳에
// 모든 객체가 상속받고 있는 내부 함수들이 존재한다.
*/


/*
String.prototype.testMethod = function() {
    console.log("This is the String.prototype.testMethod()");
};

var str = "this is test";
str.testMethod();
console.log(String.prototype);

// String.prototype은 Object.prototype이다.
// 하지만 testMethod라는 메소드를 String.prototype에 추가하려고 한다.
// 그러면 Object.prototype에 testMethod라는 메소드가 추가되어 사용할 수 있다.
// 이렇게 동적으로 프로퍼티를 추가하는 것이 가능하다.
*/
/*
function Person(name) {
    this.name = name;
}

var foo = new Person('foo');

Person.prototype.sayHello = function() {
    console.log('Hello');
}

foo.sayHello();
console.dir(Person.prototype);
console.dir(foo.prototype);
*/



/*
function Person(name) {
    this.name = name;
}

Person.prototype.getName = function() {
    return this.name;
}

var foo = new Person('foo');

console.log(foo.getName());

Person.prototype.name = 'person';

console.log(Person.prototype.getName());
*/



/*
function Person(name) {
    this.name = name;
}

console.log(Person.prototype.constructor);

var foo = new Person('foo');
console.log(foo.country);

Person.prototype = {
    country : 'korea',
};

console.log(Person.prototype.constructor);
foo.prototype = Person.prototype;

var bar = new Person('bar');
console.log(foo.country);
console.log(bar.country);
console.log(foo.constructor);
console.log(bar.constructor);
*/