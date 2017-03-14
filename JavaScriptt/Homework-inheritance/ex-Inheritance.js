function Person(name, age, isMale) {
    this.name = name;
    this.age = age;
    this.isMale = isMale;
}
Person.prototype.showPersonInfo = function () {
    console.log("name is " + this.name);
    console.log("age is " + this.age);
    console.log("isMale " + this.isMale)
}

function Student(score, name, age, isMale) {
    Person.call(this, name, age, isMale);
    this.score = score;
}

function Employee(daySalary, name, age, isMale, workinHours) {
    Person.call(this, name, age, isMale);
    this.daySalary = daySalary;
    this.workinHours = workinHours;
}

Student.prototype = Object.create(Person.prototype);
Student.prototype.showStudentInfo = function () {
    this.showPersonInfo();
    console.log("score is " + this.score);
}

Employee.prototype = Object.create(Person.prototype);

Employee.prototype.calculateOvertime = function (hours) {

    if (this.age < 18) {
        return this.daySalary = 0;
    }
    else if (this.workinHours < hours && typeof hours === 'number') {
        var overtime = hours - this.workinHours;
        var salaryForHour = this.daySalary / this.workinHours;
        return (salaryForHour * 1.5) * overtime;
    }
    else {
        return "ti ne si rabotil overtime ili ne si chislo";
    }

}

Employee.prototype.showEmployeeInfo = function () {
    this.showPersonInfo();
    console.log("daySalary is " + this.daySalary);
}

var arr = new Array(10);
var person1 = new Person('pesho', 25, true);
var person2 = new Person('peshinka', 22, false);

var emp1 = new Employee(300, 'mitko', 12, true, 9);
var emp2 = new Employee(400, 'gosho ', 19, true, 8);

var student1 = new Student(20, "Ivan ", 19, true);
var student2 = new Student(25, "Ivanka ", 29, false);

arr[0] = person1;
arr[1] = person2;
arr[2] = emp1;
arr[3] = emp2;
arr[4] = student1;
arr[5] = student2;

// arr.splice(0); 
// arr.push(person1);
// arr.push(person2);
// arr.push(emp1);
// arr.push(emp2);
// arr.push(student1);
// arr.push(student2);

for (var index = 0; index < arr.length; index++) {
    if (!(arr[index] instanceof Student) && !(arr[index] instanceof Employee) && arr[index] instanceof Person) {
        console.log("Person:")
        arr[index].showPersonInfo();
        console.log("----------")
    }
    if (arr[index] instanceof Student) {
        console.log("Student:")
        arr[index].showStudentInfo();
        console.log("----------")
    }
    if (arr[index] instanceof Employee) {
        console.log("Employee:")
        arr[index].showEmployeeInfo();
        console.log("----------")
    }
}

for (var index = 0; index < arr.length; index++) {
    if (arr[index] instanceof Employee) {
        console.log("Overtime money: ")
        console.log(arr[index].calculateOvertime(10));
    }

}


