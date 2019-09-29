let intNum = 10;
let doubleNum = 10.1;
let charNum = 'a';
let stringNum = "abcdefg";
let boolNum = true;
let nullNum = null;
let undefinedNum;

console.log(
    typeof intNum,
    typeof doubleNum,
    typeof charNum,
    typeof stringNum,
    typeof boolNum,
    typeof nullNum,
    typeof undefinedNum
);

function Ex() {
    let a = 3;
    for(let a=1;a<10;a++) {
        console.log(a);
    }
    console.log(a);
}

Ex();

console.log('---------------------');

var TestNumber = 5/2;

console.log(TestNumber);
console.log(Math.floor(TestNumber));
console.log(Math.ceil(TestNumber));
console.log(Math.round(TestNumber));

console.log('---------------------');

var TestString = 'Test';

console.log(
    TestString,
    TestString[0],
    TestString[1],
    TestString[2],
    TestString[3]
)