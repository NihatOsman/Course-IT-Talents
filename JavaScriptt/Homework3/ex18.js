var arr = [18, 19, 32, 1, 3, 4, 5, 6, 7, 8];
var arr2 = [1, 2, 3, 4, 5, 16, 17, 18, 27, 11];
var copyArr = new Array(arr.length);
for (var index = 0, index2 = 0; index < arr.length; index++ , index2++) {
    if (index == index2) {

        if (arr[index] > arr2[index2]) {
            copyArr[index] = arr[index];
        }
        else {
            copyArr[index] = arr2[index2];
        }
    }
}
for (var index = 0; index < arr.length; index++) {
    process.stdout.write(arr[index] + ",");
}
console.log();
for (var index = 0; index < arr.length; index++) {
    process.stdout.write(arr2[index] + ",");
}
console.log();
process.stdout.write("result: ");
for (var index = 0; index < arr.length; index++) {
    process.stdout.write(copyArr[index] + ",");
}

