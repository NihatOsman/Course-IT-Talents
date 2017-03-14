var firstStr = "mashina";
var secondStr = "klipce";
var tempInd = -1;
var tempInd2 = -1;

for (var index = 0; index < firstStr.length; index++) {
    for (var index2 = 0; index2 <= secondStr.length - 1; index2++) {
        if (firstStr[index] === secondStr[index2]) {
            tempInd = index;
            tempInd2 = index2;
        }
    }
}
if (tempInd !== -1 || tempPos !== -1) {
    for (var index = 0; index < firstStr.length; index++) {
        if (index === tempInd) {
            for (var index2 = 0; index2 < secondStr.length; index2++) {
                process.stdout.write(secondStr[index2]);
            }
            console.log();
        }
        if (index !== tempInd) {

            for (var index2 = 0; index2 < tempInd2; index2++) {
                process.stdout.write(" ");
            }
            console.log(firstStr[index]);
        }
    }
}
else {
    console.log("nqma povtarqshti se bukvi");
}