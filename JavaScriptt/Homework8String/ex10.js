var text = "Hello";
var Text2 = ""
var s = "";
for (var index = 0; index < text.length; index++) {
    Text2 = text.charCodeAt(index) + 5;
    process.stdout.write(String.fromCharCode(Text2));
}