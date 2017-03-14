var array = [10, 3, 5, 8, 6, -3, 7];
var min = array[0];
for (var index = 0; index < array.length; index++) {
    if (array[index] % 3 == 0 && array[index] < min) {
        min = array[index];
    }

}
console.log("The smallest number in array is: " + min);