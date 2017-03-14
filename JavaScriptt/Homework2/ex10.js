var x=13;
var primeNumber = true;
for (var i= 2; i < x; i++){
    if (x % i == 0) {
        primeNumber = false;
        break;
    }

}
if (primeNumber == true) {
    process.stdout.write("the number is prime");
}
else {
    process.stdout.write("the number is composite");
}
		

	