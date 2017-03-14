var array = [[48, 72, 13, 14, 15],
[21, 22, 53, 24, 75],
[31, 57, 33, 34, 35],
[41, 95, 43, 44, 45],
[59, 52, 53, 54, 55],
[61, 69, 63, 64, 65]];

var min = array[0][0];
var max = array[0][0];
for (var row = 0; row < array.length; row++) {
    for (var col = 0; col < array[row].length; col++) {
        if (array[row][col] < min) {
            min = array[row][col];
        }
        if (array[row][col] > max) {
            max = array[row][col];
        }
    }

}
console.log("nai-malko " + min);
console.log("nai-golqmo " + max);