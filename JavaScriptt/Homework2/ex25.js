var number = 5;

var factorial = 1;
do {
    factorial *= number;
    number--;
} while (number != 0);
console.log("Result: " + factorial);
