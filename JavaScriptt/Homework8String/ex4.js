var names = "Cristiano Ronaldo, Lionel Messi";
var splitNames = names.split(",");
var sumFirstName = 0;
var sumSecondName = 0;
var firstName = splitNames[0];
var secondName = splitNames[1];
for (var index = 0; index < firstName.length; index++) {
    sumFirstName += firstName.charCodeAt(index);
}
for (var index = 0; index < secondName.length; index++) {
    sumSecondName += secondName.charCodeAt(index);
}
console.log(sumFirstName>sumSecondName ? firstName : secondName);