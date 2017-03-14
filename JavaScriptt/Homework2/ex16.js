var a = 25;
var b = 249;
var c;

if (a > b) {
    c = a; a = b; b = c;
}
if (a >= 10 && b <= 5555) {
    for (var i = a; i <= b; b--) {
        if (b % 50 == 0) {

            process.stdout.write(b + ",");
        }
    }
}
else {
    process.stdout.write("try again");

}
