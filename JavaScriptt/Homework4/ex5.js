var array = [[1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 10, 11, 12],
    [13, 14, 15, 16]];
var sumCol = 0;
var sumRow = 0;
var sumRowMax = -Infinity;
var sumColMax = -Infinity;
for (var row = 0; row < array.length; row++) {
    for (var col = 0; col < array[row].length; col++) {
        sumRow += array[row][col];
    }
    if (sumRow > sumRowMax)
        sumRowMax = sumRow;
    sumRow = 0;
}
for (var row = 0; row < array.length; row++) {
    for (var col = 0; col < array[row].length; col++) {
        sumRow += array[row][col];
    }
    if (sumRow > sumRowMax)
        sumRowMax = sumRow;
    sumRow = 0;
}
for (var col = 0; col < array.length; col++) {
    for (row = array[col].length - 1; row >= 0; row--) {
        sumCol += array[row][col];
    }
    if (sumCol > sumColMax)
        sumColMax = sumCol;
    sumCol = 0;
}
console.log(sumRowMax);
console.log(sumColMax);
if(sumRowMax>sumColMax)
{
    console.log("sumRowMax>sumColMax");
}
else{
     console.log("sumRowMax<sumColMax");
}