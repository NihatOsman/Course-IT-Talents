var str = "asd-12sdf45-56asdf100";
var sum = 0;
var numberAdds = "";
for (var index = 1; index <= str.length - 1; index++) {
    while (!isNaN(str[index])) {
        if (str[index - 1] === "-")
            numberAdds += str[index - 1];
        numberAdds += str[index];
        index++;
    }
    if (!isNaN(str[index - 1])) {
        numberAdds += ",";
    }
}
numberAdds = numberAdds.slice(0, -1);
var numbers = numberAdds.split(",");
for (var index = 0; index <= numbers.length - 1; index++) {
    sum += parseInt(numbers[index]);
}
console.log(sum);