var values = [1, 2, 3, 4, 5, 6, 7];
var x;
for (var index = 0; index < values.length; index++) {
    x = values[1];
    values[1] = values[0];
    values[0] = x;
}
for (var index = 0; index < values.length; index++) {
    values[2] = values[3] + values[2];
    values[3] = values[2] - values[3];
    values[2] = values[2] - values[3];
}
for (var index = 0; index < values.length; index++) {
    values[5] = values[4] * values[5];
    values[4] = values[5] / values[4];
    values[5] = values[5] / values[4];
}
process.stdout.write("New values is: ");
for (var index = 0; index < values.length; index++) {
    process.stdout.write(values[index] + ",");
}