var array = [1, 5, 2, 4, 3, 7, 8];

zigZag = true;
for (var index = 1; index < array.length - 1; index++) {
    if (!(((array[index] > array[index - 1]) && ([index] > array[index + 1])) || ((array[index] < array[index - 1]) && (array[index] < array[index + 1])))) {
        zigZag = false;
        break;

    }

}
process.stdout.write(zigZag ? "ZigZag " : "Ne e zig zag ");
