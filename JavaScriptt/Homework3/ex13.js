var number = 99;
var bitNum = [];

while (number >= 1) {
    bitNum.unshift(Math.floor(number % 2))
    number = number / 2
}
console.log(bitNum);