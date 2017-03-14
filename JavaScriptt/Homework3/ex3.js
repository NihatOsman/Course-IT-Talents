var number = 1;
var array = new Array(10);
array[0] = array[1] = number;
for (var index = 2; index < array.length; index++) {
    array[index] = array[index - 1] + array[index - 2];

}
for (var index = 0; index < array.length; index++) {
    process.stdout.write(array[index] + ",");
}