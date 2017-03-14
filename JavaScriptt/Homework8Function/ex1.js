function fibonachi(endNumber) {

    if (endNumber <= 2) {
        return 1;
    } else {
        return fibonachi(endNumber - 1) + fibonachi(endNumber - 2);
    }

}
var index = fibonachi(8);
console.log("izhod: " + index);