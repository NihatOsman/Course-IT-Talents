var number = 1;

var counter = 0;
var i = number;
while (counter != 10) {
    if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i > Number) {
        counter++;
        process.stdout.write(counter + ":" + i + "; ");
    }
    i++;
}