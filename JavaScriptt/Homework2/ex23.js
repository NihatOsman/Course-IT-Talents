var x = 1;
var y = 1;
while (x <= 9) {
    while (y <= 9) {
        process.stdout.write(x + "*" + y + " ; " + " ");
        y++;
    }
    console.log();
    y = x + 1;
    x++;
}