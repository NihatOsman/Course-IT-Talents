var array = [5, 10, 12, 15, 17];
var array2 = new Array(array.length);

for (var index = 0; index < array.length; index++) {
    array2[index] = array[index] + array[index + 1];
}
array2[array2.length - 1] = array[array.length - 1]

for (var index = 0; index < array2.length; index++) {
    process.stdout.write(array2[index] + ",");

}