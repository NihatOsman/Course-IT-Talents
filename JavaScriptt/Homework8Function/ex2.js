function sum(a, b) {
    if (b < 2) {
        return a;
    } else {
        return sum(a, b - 1) + a;
    }
}
var s = sum(4, 5);
console.log("izhod: " + s);