package ex1;

public class Employee extends Person{
	
	private double daySalary;
	
	Employee(String name, int age, boolean isMale, double daySalary){
		super(name, age, isMale);
		this.daySalary=daySalary;
	}
	
	
	double calculateOvertime(double hours){
		if(getAge()<=18){
			return 0;
		}
	
		if(getAge()>18){
			
			double moneyPerHouse = 	getDaySalary()/8;
			return hours*(moneyPerHouse*1.5);
			
		}
		
		return -1;
		
	}
	
	public double getDaySalary() {
		return daySalary;
	}


	public void setDaySalary(double daySalary) {
		if(this.daySalary>0){
			this.daySalary = daySalary;
		}
	}


	void showEmployeeInfo(){
		super.showPersonInfo();
		System.out.println(getName() +"for 1 day work get a" + daySalary);
		
	}

}
