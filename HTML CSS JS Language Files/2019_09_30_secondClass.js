// 2019_09_30   첫 교시 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

console.log("[ new Object 인스턴스 생성을 통한 객체 생성 ]");
var foo = new Object();     // 이처럼 new 연산자를 통해 객체를 생성할 수 있다.

foo.name = "LeeJinHyeok";
foo.age = 17;
foo.gender = "man";

console.log(typeof foo);
console.log(foo.name);
console.log(foo.age);
console.log(foo.gender);



console.log("[ 객체 리터럴 방식을 이용한 객체 생성 ] ");
var foo = {
    name : "BaeGilJoon",
    age : 17,
    gender : "man"
};

console.log(typeof foo);
console.log(foo.name);
console.log(foo.age);
console.log(foo.gender);



var foo = {
    name : "KimDaeUng",
    major : "Wep Backend"
};

console.log("읽기");
console.log(foo.name);
console.log(foo['name']);
console.log(foo.nickname);

console.log("갱신");
foo.major = "electronics engineering";
console.log(foo.major);
console.log(foo['major']);

console.log("동적으로 프로퍼티 생성가능");
foo.age = 17;
console.log(foo.age);

foo['full-name'] = 'foo bar';
console.log(foo.full-name);     // 하이픈(-)을 마이너스 연산자로 생각하여 NaN을 결과로 얻는다.
console.log(foo['full-name']);  // NaN은 Not a Number라는 뜻으로 Number가 아니라는 뜻이다.



var foo = {
    name : "SonJungWoo",
    age : 17,
    major : [1, 2, 3, 4]
};

for(var prop in foo) {
    console.log(prop, foo[prop]);
}

var foo = {
    name : 'SonWanSeo',
    nickname : 'byeongsin'
};

console.log("삭제하기");
console.log(foo.nickname);
delete foo.nickname;            // foo 객체의 nickname이라는 프로퍼티를 삭제
console.log(foo.nickname);

delete foo;
console.log(foo.name);          // 객체 자체를 삭제를 할 순 없다.


// 2019_09_30   두 번째 교시 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


var a = 100;
var b = 100;

var objA = {value : 100};
var objB = {value : 100};
var objC = objB;

console.log(a==b);          // true         // 기본 자료끼리의 비교는 값만을 비교한다.
console.log(objA==objB);    // false        // 참조 자료는 그 자체가 값이 아니기 때문에
console.log(objB==objC);    // true         // 참조하고 있는 자료의 주소를 갖고 있기에 false가 뜬다.



// var objA = {
//     val = 40
// };
// var objB = objA;

// console.log(objA.val);
// console.log(objB.val);

// objB.cal = 50;
// console.log(objA.val);
// console.log(objB.val);



var a = 100;
var objA = {value : 100};

function changeArg(num, obj) {
    num = 200;
    obj.value = 200;

    console.log(num);
    console.log(obj.value);
}

changeArg(a, objA);
console.log(a);             // call by value
console.log(objA.value);    // call by reference



var foo = {
    name : 'YooSiOn',
    age : 30
}

console.log(foo.toString());
console.dir(foo);

console.log(NaN - NaN);


// 2019_09_30   세 번째 교시 ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

var colorArr = ['orange', 'yellow', 'blue', 'green', 'red'];        // javascript에서도 배열의 index는 0부터 시작한다.
console.log(colorArr[0]);
console.log(colorArr[1]);
console.log(colorArr[4]);


var emptyArr = [];              // 또한 배열은 동적으로 할당이 가능하다.
console.log(emptyArr[0]);

emptyArr[0] = 100;
emptyArr[3] = 'eight';
emptyArr[7] = true;
console.log(emptyArr);
console.log(emptyArr.length);

emptyArr[10] = "1";
console.log(emptyArr.length);

emptyArr.length = 100;
console.log(emptyArr.length);
console.log(emptyArr);

emptyArr.length = 1;
console.log(emptyArr.length);
console.log(emptyArr);



var arr = ['zero', 'one', 'two'];

arr.push("three");
console.log(arr);

arr.length = 5;
arr.push("four");

console.log(arr.length);
console.log(arr);



var arr1 = ['orange', 'yellow', 'green'];
console.log(arr1[0]);
console.log(arr1[1]);
console.log(arr1[2]);

var arr2 = {
    '0' : 'orange',
    '1' : 'yellow',
    '2' : 'green'
};
console.log(arr2[0]);
console.log(arr2[1]);
console.log(arr2[2]);

console.log(typeof arr1);
console.log(typeof arr2);

console.log(arr1.length);
console.log(arr2.length);