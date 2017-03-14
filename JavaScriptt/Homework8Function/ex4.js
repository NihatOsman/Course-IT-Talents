function triangle(start, end) {
    if (end < start) {
        return "";
    }
    var str = triangle(start, end - 1);
    str = str + end.toString();
    console.log(str);
    return str;

}
var draw = triangle(1, 9);