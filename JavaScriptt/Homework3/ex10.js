var array = [1, 2, 3, 4, 5, 6, 7];
var avg = 0;
var sum = 0
for (var index = 0; index <= array.length - 1; index++) {
    sum += array[index];
}
avg = sum / array.length;
var min = avg
var maxMin = -Infinity;
var max = avg;
var minMax = Infinity;
for (var index = 0; index < array.length; index++) {
    if (array[index] <= avg) {
        min = array[index];
        if (min > maxMin)
            maxMin = min;
    }
    if (array[index] >= avg) {
        max = array[index];
        if (max < minMax)
            minMax = max;
    }
}

if (minMax - avg >= avg - maxMin) {
    console.log("The avarage is: " + avg + " The closest digit is " + maxMin);
} else {
    console.log("The avarage is: " + avg + " The closest digit is " + minMax);
}