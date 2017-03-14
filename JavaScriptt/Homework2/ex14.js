var x = 130;
if (x > 10 && x <= 200) {

    for (var i = 1; i <= x; x--) {

        if (x % 7 == 0) {

            process.stdout.write(x + ",");
        }
    }
}
else {
    process.stdout.write("try again");
}


