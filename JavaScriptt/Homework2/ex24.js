var num = 17571;
var num2 = num;
var reversedNum = '';
do {
    var digit = num % 10;
    reversedNum += digit;
    num = Math.floor(num / 10);
}
while (num > 0);

reversedNum = Number(reversedNum);
if (num2 === reversedNum) {
    console.log("palindrom e");
} else {
    console.log("ne e palindrom");
}