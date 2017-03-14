var x = 5;
for (var i = 1; i <= x; i++) {
    for (var j = 1; j <= x; j++) {
        if (i == 1 || j == 1 || i == x || j == x) {
            process.stdout.write("*");
        }
        else {
            process.stdout.write("+");
        }
    }
    console.log();

}