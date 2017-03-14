var array = new Array(10);

for (var index = 0; index < array.length; index++) {
    array[index] = index * 3;
}
for (var index = 0; index < array.length; index++) {
    process.stdout.write(array[index] + ",");
}
