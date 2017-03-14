function Computer(year, price, isNotebook, hardDiskMemory, freeMemory, operationSystem) {
    this.year = year;
    this.price = price;
    this.isNotebook = isNotebook;
    this.hardDiskMemory = hardDiskMemory;
    this.freeMemory = freeMemory;
    this.operationSystem = operationSystem;

}

Computer.prototype.comparePrice = function (computer) {
 
        if (this.price > computer.price) {
            return -1;
        } else if (computer.price > this.price) {
            return 1;
        } else {
            return 0;
        }
   
}

var comp = new Computer(1994, 500 , true , 250 , 100, 'windows');
var laptop = new Computer(1994, 700 , true , 250 , 100, 'windows');
var comp2 = new Computer(1994, 200 , true , 250 , 100, 'windows');
console.log(comp.comparePrice(laptop));

