var a = 1;
var b = 107;
var c =0;
var sum = 0;
var x =0;
if (a > b) {
    c = a; a = b; b = c;
}
for (var i= a; i <= b; i++){
    x = i * i;
    if (x % 3 == 0) {
        process.stdout.write("skip,");

    }
    if (x % 3 != 0) {

        sum += x;

        process.stdout.write(x + ",");
        if ((sum += x) >= 200) {
            break;

        }
    }
}