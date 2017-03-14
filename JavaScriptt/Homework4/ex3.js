var array = [[48, 72, 13, 14, 15],
[21, 22, 53, 24, 75],
[31, 57, 33, 34, 35],
[41, 95, 43, 44, 45],
[59, 52, 53, 54, 55],
[61, 69, 63, 64, 65]];

var sum = 0;
var average = 0;
var counter = 0;

for (var row = 0; row < array.length; row++) {
    for (var col = 0; col < array[row].length; col++) {

        sum += array[row][col];
        counter++;

    }
}
average = sum / counter;
console.log("sum is: " + sum);
console.log("average is: " + average);