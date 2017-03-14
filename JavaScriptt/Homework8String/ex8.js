var text = "kapak";
var flag = true;
for (var index = 0; index <= text.length - 1; index++) {
    if (text[index] !== text[text.length - index - 1]) {
        flag = false;
        break;
    }
}
console.log(flag ? "Palindrom" : "ne e palindrom ");