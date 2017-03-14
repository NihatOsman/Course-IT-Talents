var array = [[1, 4, 6, 3],
[5, 9, 7, 2],
[4, 8, 1, 9],
[2, 3, 4, 5]];

for (var row = 0; row < array.length; row++) {
    for (var col = row; col < row + 1; col++) {
        process.stdout.write(array[row][col] + ",");
    }
}
console.log();
for (var row = 0; row < array.length; row++) {
    for (var col = 0; col < array.length; col++) {
        if (row + col == array.length - 1) {
            process.stdout.write(array[row][col] + ",");
        }
    }
}
