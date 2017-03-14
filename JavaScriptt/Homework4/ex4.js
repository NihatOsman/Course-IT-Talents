var array= [[1,2,3,4],
[5,6,7,8],
[9,10,11,12],
[13,14,15,16]];


for (var col = 0; col < array.length; col++ ) {
    for (row = array[col].length - 1; row >= 0; row--) {
        process.stdout.write(array[row][col].toString() + " ")
    }
    console.log();
}
