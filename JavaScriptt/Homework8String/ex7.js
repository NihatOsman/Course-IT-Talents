var text = "trqbva da sedna da ucha";
var count = 1;
var longestWordlength = 0;
var wordLength = 0;
var Ind = 0;
for (var index = 0; index < text.length - 1; index++) {
    if (text[index] === " ") {
        count++;
        wordLength = 0;
    } else {
        wordLength++;
    }
    if (wordLength > longestWordlength) {
        longestWordlength = wordLength;
        Ind = index - longestWordlength + 1;
    }
}

console.log("izhod: "+ count + " dumi");
var longestWord = text.slice(Ind, (Ind + longestWordlength + 1));
console.log("nai-dalgata duma e: " + longestWord);