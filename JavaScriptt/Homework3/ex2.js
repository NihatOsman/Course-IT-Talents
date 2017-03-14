var array = [5, 2, 5, 8, 3];

var array2 = array.slice(0);
for (var index = array.length - 1; index >= 0; index--) {
    array2.push(array[index]);
}

for (var index = 0; index < array2.length; index++) {
    process.stdout.write(array2[index] + ",");
}
