var sum = 26; 
if (sum < 1 || sum > 27)
    console.log("Invalid input!!!");

for (var index = 101; index < 1000; index++) {
    var sing = index % 10;
    var dec = Math.floor(index / 10) % 10;
    var hund = Math.floor(index / 100) % 10;
    if ((sing + dec + hund) === sum)
        console.log(index);
}