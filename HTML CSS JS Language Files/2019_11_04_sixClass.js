// 2019_11_04_sixClass.js

var test = 'This is test';
console.log(window.test);
var sayFoo = function() {
    console.log(this.test);
};
sayFoo();



var value = 100;
var myObject = {
    value : 1,
    func1 : function() {
        this.value += 1;
        console.log("func() called. this.value : " + this.value);

        func2 = function() {
            this.value += 1;
            console.log("func2() called. this.value : " + this.value);

            func3 = function() {
                this.value += 1;
                console.log("func3() called. this.value : " + this.value);
            }

            func3();
        }

        func2();
    }
};
myObject.func1();

// 내부 함수에서 쓰인 this는 자신을 호출한 객체를 가리키는 것이 아니라 전역 객체 즉, window를 가리킨다.
// 따라서 내부함수인 func2 와 func3 의 this는 window를 가리킨다.



var value2 = 100;
var myObject2 = {
    value2 : 1,
    func1 : function() {
        var that = this;
        this.value2 += 1;
        console.log("func1() called. this.value2 : " + this.value2);

        func2 = function() {
            that.value += 1;
            console.log("func2() called. this.value2 : " + that.value2);

            func3 = function() {
                that.value2 += 1;
                console.log("func3() called. this.value2 : " + that.value2);
            }
            func3();
        }
        func2();
    }
};
myObject2.func1();

// 위에서 얘기했듯이 내부 함수에서의 this는 window를 가리킨다.
// 하지만 본 코드에서는 내부 함수에서 this 대신 myObject2를 가리키는 this를 that에 담아 사용하였다.
// 따라서 첫 번째 코드와는 다르게 window.value2를 가리키지 않고
// func1.value2만을 가리키게 되어 2, 3, 4 라는 값이 출력되었다.



var Person = function(name) {
    this.name = name;
};

var foo = new Person("foo");
console.log(foo.name);

// new 키워드를 통해 Person 함수를 호출하는 것이 생성자 함수를 호출하는 것이다.
// 이렇게 생성자 함수를 호출하게 되면 빈 객체를 만들어 Person 함수가 동작하는데로
// 빈 객체에 들어갈 프로퍼티를 만든다.
// 그 다음 그렇게 만들어진 빈 객체 (속성들이 들어간)를 리턴한다.