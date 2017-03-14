function Task(name, workingHours) {
    this.name = name;
    this.workingHours = workingHours;
}

function Employee(name, currentTask, hoursLeft) {
    this.name = name;
    this.currentTask = currentTask;
    this.hoursLeft = hoursLeft;
}

Employee.prototype.showReport = function () {
    if (typeof this.hoursLeft === 'number' && typeof this.currentTask.workingHours === 'number'  && this.hoursLeft>=0 && this.currentTask.workingHours>=0) {
        this.work();
        console.log("Name of employee is: " + this.name);
        console.log("Task name is: " + this.currentTask.name);
        console.log("Hours left for task: " + this.currentTask.workingHours);
        console.log("Hours left for work: " + this.hoursLeft);
    }

    else {
        console.log("this is not a number or this is a negative number");
    }

}
Employee.prototype.work = function () {

    if (this.hoursLeft <= this.currentTask.workingHours ) {
        this.currentTask.workingHours = this.currentTask.workingHours - this.hoursLeft;
        this.hoursLeft = 0;
    }
    else {
        this.hoursLeft = this.hoursLeft - this.currentTask.workingHours;
        this.currentTask.workingHours = 0;
    }
}


var task1 = new Task('zadacha1', 6);
var emp = new Employee('valyo', task1, 6);
emp.showReport();