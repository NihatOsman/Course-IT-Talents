
var text = "super qkata zadacha";
var uppCase = "";
uppCase += text[0].toUpperCase();
for (var index = 1; index < text.length; index++) {
    if (text[index] === " ") {
        uppCase += " " + text[index + 1].toUpperCase();
    } else {
        if (uppCase[index] !== text[index].toUpperCase()) {
            uppCase += text[index];
        }
    }

}
console.log(uppCase);

