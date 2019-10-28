// 2019_10_21_fourClass.js 를 복습한다.

function parent() {
    var a = 100;
    var b = 200;

    function child() {
        var b = 300;
        console.log(a);
        console.log(b);
    }
    return child;
}

var func0 = parent();
func0();

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

function thisreturn() {
    var num = 100;
    return this;
}

var num = thisreturn();



// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

var abcd = 1234;
console.log(abcd);
console.log(window.abcd);                   // js의 전체는 window 라는 객체로 이루어져 있다.
                                            // 따라서 abcd 라는 변수를 출력하는 것과 window.abcd 라는 변수를 출력하는 것은 같다.

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

var test = 'This is test';
console.log(window.test);
var sayFoo = function() {
    console.log(this.test);
}
window.sayFoo();
console.log(this);              // 여기서의 this는 전역 객체 window를 말하는 것이다.