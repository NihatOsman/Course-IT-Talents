function Student(name, subject, grade, yearInCollege, age, hasDegree, money) {
    this.name = name;
    this.subject = subject;
    this.grade = grade;
    this.yearInCollege = yearInCollege;
    this.age = age;
    this.hasDegree = hasDegree;
    this.money = money;
}

Student.prototype.upYear = function () {
    if (this.yearInCollege >= 1 && this.yearInCollege < 4) {
        this.yearInCollege++;
        if (this.yearInCollege === 4) {
            this.hasDegree = true;
        }
    }
    else {
        console.log("choveche ti si zavrishal veche ili si vavel greshni danni");
    }

}

Student.prototype.receiveScholarship = function (min, amount) {
    if (this.grade >= 4 && this.age < 30 && this.age > 18) {
        return this.money += amount;
    }

}

function StudentGroup(groupSubject) {
    this.groupSubject = groupSubject;
    this.students = new Array(5);
    this.freePlaces = 5;
}



StudentGroup.prototype.addStudent = function (student) {
    if (student instanceof Student && this.groupSubject === student.subject && this.freePlaces > 0 && this.freePlaces <= 5) {
        this.students.unshift(student);
        this.students.pop();
        this.freePlaces--;

    }

}

StudentGroup.prototype.emptyGroup = function () {
    console.log(this.students);
    this.students = new Array(5);
    this.freePlaces = 5;
}

StudentGroup.prototype.theBestStudentName = function () {
    var maxGrade = -Infinity;
    var studentIndex = [0];
    console.log(this.students);
    for (var index = 0; index < this.students.length - this.freeSpaces  ; index++) {
        if (maxGrade < this.students[index].grade) {
            maxGrade = this.students[index].grade;
            studentIndex = index;
        }
    }

    return this.students[studentIndex].name;
}


StudentGroup.prototype.printStudentsInGroup = function () {
    for (var index = 0; index < this.students.length - this.freeSpaces; index++) {
        console.log(" student name " + this.students[index].name + " great " + this.students[index].grade + " subject " + this.students[index].subject
            + " year in college " + this.students[index].yearInCollege + " hasDegree " + this.students[index].hasDegree);
    }
}

var student1 = new Student('mitko', 'Matematika', 3, 2, 21, true, 100);
var student2 = new Student('gosho', 'Matematika', 5.60, 4, 31, false, 200);
var student3 = new Student('valyo', 'Matematika', 3, 4, 5, true, 300);
var student4 = new Student('galq', 'Matematika', 4.50, 2, 31, false, 400);
var student5 = new Student('iliqna', 'Matematika', 3, 5, 25, true, 500);

student1.receiveScholarship(3.50, 300);
student2.upYear();

var group1 = new StudentGroup('Matematika');
group1.addStudent(student1);
group1.addStudent(student2);
group1.addStudent(student3);
group1.addStudent(student4);
group1.addStudent(student5);

console.log(group1.theBestStudentName());
group1.printStudentsInGroup();
