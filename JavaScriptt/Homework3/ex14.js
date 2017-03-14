var array = [7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2];
var array2 = new Array(array.length);
var max = 0;
for (var index = 0; index < array.length; index++) {
    if (array[index] > -2.99 && array[index] < 2.99) {
        max = array[index];

    }
    array2[index] = max;
    max = 0;

}
for (var index = 0; index < array.length; index++) {
    if (array2[index] == 0) {
        continue;

    }
    process.stdout.write(array2[index] + ", ");

}