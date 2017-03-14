var max = 10;
for (var i = 1; i < max; i++) {
    for (var j = i; j < max; j++) {
        process.stdout.write(j + "");
    }
    for (var x = 0; x < i; x++) {
        process.stdout.write(x + "");
    }
    console.log();
}
for (var a = 0; a < 10; a++) {
    process.stdout.write(a + "");
}