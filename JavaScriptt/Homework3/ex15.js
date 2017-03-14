var arr = [4, 9, 5, 8, 6, 9, -3, -11, 14, 3, 5, 7, 3, 9, 8, 9, 8, 5];

var maxSum = 0;
var x1 = 0;
var x2 = 0;
var x3 = 0;

for (var index = 0; index < arr.length; index++) {
    for (var index2 = index + 1; index2 < arr.length; index2++) {
        for (var index3 = index2 + 1; index3 < arr.length; index3++) {

            if (arr[index] == arr[index2] || arr[index] == arr[index3] || arr[index2] == arr[index3]) {
                continue;
            }
            var abs1 = (arr[index] < 0) ? 0 - arr[index] : arr[index];
            var abs2 = (arr[index2] < 0) ? 0 - arr[index2] : arr[index2];
            var abs3 = (arr[index3] < 0) ? 0 - arr[index3] : arr[index3];
            var sum = abs1 + abs2 + abs3;
            if (sum > maxSum) {
                maxSum = sum;
                x1 = arr[index];
                x2 = arr[index2];
                x3 = arr[index3];
            }
        }
    }
}
process.stdout.write("The values are: " + x1 + ", " + x2 + " and " + x3);