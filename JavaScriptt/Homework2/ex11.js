var a = 5;


for (var row = 1; row <= a; row++) {

    for (var spaces = 1; spaces <= a - row; spaces++) {
        process.stdout.write(" ");
    }
    for (var stars = 1; stars <= (2 * row) - 1; stars++) {
        if (stars != 1 && stars != (2 * row) - 1 && row != a) {
            var b = Math.floor(Math.random() * 5) + 1;
            if (b == 1) {
                process.stdout.write("@");
            }
            else {
                process.stdout.write(" ");
            }

            continue;
        }
        process.stdout.write("*");
    }

    console.log(" ");


}
for (var row = 1; row <= a; row++) {
    for (var spaces = 1; spaces < a; spaces++) {
        process.stdout.write(" ");
    }
    process.stdout.write("*");
    console.log();



}
