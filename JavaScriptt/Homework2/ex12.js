var number = 102;
var divisor = 10;
var ten = 10;
var flag = true;
var numberOfDigits = 0;
checkDigitNumber = number;
while ((checkDigitNumber / ten) > 0) {
    numberOfDigits++;
    checkDigitNumber = Math.floor(checkDigitNumber / ten);
}

while ((number / ten) > 1) {
    for (var index = numberOfDigits; index > 1; index--) {
        if (number % ten === (Math.floor(number / divisor) % ten)) {
            flag = false;
        }
        divisor *= ten;
    }
    divisor = 10;
    numberOfDigits--;
    number = Math.floor(number / divisor);

}
console.log(flag ? "unique number" : "number with repeated digits");
		
	
