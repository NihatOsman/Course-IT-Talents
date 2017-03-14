var array = [4, 6, 10];
var array2 = [4, 6, 10];
var length = true;
var equals = true;

for (var index = 0; index < array.length; index++) {
    if (array.length - 1 != array2.length - 1) {
        length = false;
        break;
    }
}
for (var index = 0; index < array.length; index++) {
    if (array[index] != array2[index]) {
        equals = false;
        break;
    }
}

if (length == true) {
    console.log("maivite imat ednakiv razmer");
}
else {
    console.log("masivite nqmat ednakiv razmer")
}

if (length == true) {
    console.log("maivite sa ednakvi");
}
else {
    console.log("masivite sa razlicni")
}
