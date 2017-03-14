var arrayList = [15, -55, 17, 75, 56, 105, 134];
var count = 0;
var temp = ""
for (var index = 0; index <= arrayList.length - 1; index++) {
    if (arrayList[index] > 5) {
        if (arrayList[index] % 5 === 0) {
            count++;
            temp += arrayList[index] + " ";
            
        }
    }
}
console.log(temp)