var array = [[11, 12, 13, 14, 15, 16,],
[21, 22, 23, 24, 25, 26,],
[31, 32, 33, 34, 35, 36,],
[41, 42, 43, 44, 45, 46,],
[51, 52, 53, 54, 55, 56,],
[61, 62, 63, 64, 65, 66]];

var sum = 0;
var sumAll = 0;
var values=0;
for (var row = 0; row < array.length; row ++) {
    for (var col = 0; col < array[row].length; col++) {
        values = row + col;
        if(values%2==0){
         process.stdout.write(array[row][col] + ",");
        sum += array[row][col];
        }
    }
    sumAll += sum;
    console.log("sum is: " + sum);
    sum = 0;
}
console.log("sum of elements is: " + sumAll);