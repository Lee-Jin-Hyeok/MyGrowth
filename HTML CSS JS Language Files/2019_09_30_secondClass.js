console.log("[ new Object 인스턴스 생성을 통한 객체 생성 ]");
var foo = new Object();

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