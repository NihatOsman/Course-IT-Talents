package ex1;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Main {
	
	public static void main(String[] args) {
		
		Person[] personArr = new Person[10];
		
		Person pr = new Person("nihat", 19, true);
		Person pr2 = new Person("ivo" , 17, false);
		
		Student st = new Student("joni", 22, true, 5);
		Student st2 = new Student("vladi", 15, false, 8);
		
		Employee emp = new Employee("gosho", 13, true, 40);
		Employee emp2 = new Employee("VALYO", 23, false, 80);
		
		for(int i=0; i<personArr.length; i++){
			personArr[0]=pr;
			personArr[1]=pr2;
			personArr[2]=st;
			personArr[3]=st2;
			personArr[4]=emp;
			personArr[5]=emp2;
			
			if(personArr[i]!=null){
				if(personArr[i] instanceof Person && !(personArr[i] instanceof Employee)){
					personArr[i].showPersonInfo();
				}
				
				if (personArr[i] instanceof Student) {
					((Student) personArr[i]).showStudentInfo();

				}
				if (personArr[i] instanceof Employee) {
					((Employee) personArr[i]).showEmployeeInfo();
				}


			}
		}
		
		
		for (int j = 0; j < personArr.length; j++) {
			if (personArr[j] != null) {
				if (personArr[j] instanceof Employee) {
					System.out.print(personArr[j].getName() + " have extra "
							+ +((Employee) personArr[j]).calculateOvertime(2) + " lv.");

				}

			}

		}
		
		
		
		
		
		
		
	}

}
