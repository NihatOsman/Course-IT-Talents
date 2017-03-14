var x = 11;
while (x > 0) {


    if (x % 2 == 0) {
        x *= 0.5;
        process.stdout.write(x + ",");
        if (x == 1) {
            break;
        }
    }
    if (x % 2 == 1) {
        x *= 3;
        x++;
        process.stdout.write(x + ",");

    }

}