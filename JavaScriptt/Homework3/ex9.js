var array = [1, 5, 9, 13];

for (var index = 0; index <= array.length - 1; index++) {
    array.push(array[array.length - (index + 1)]);
    array.splice(array.length - (index + 2), 1);

}
console.log(array);
