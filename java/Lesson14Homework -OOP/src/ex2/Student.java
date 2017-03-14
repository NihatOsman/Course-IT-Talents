package ex2;

public class Student {
	
	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;
	
	

	

	Student(){
		this.grade=4.0;
		this.yearInCollege=1;
		this.isDegree=false;
		this.money=0;
	}
	
	Student(String name, String subject, int age){
		this();
		this.name=name;
		this.subject=subject;
		this.age=age;
	}
	
	void upYear(){
		if(this.yearInCollege<4){
			this.yearInCollege++;
			if(this.yearInCollege==4){
				this.isDegree=true;
			}
		}
		else{
		System.out.println("sorry ti si zavirshil");
		}
	}

	public boolean isDegree() {
		return isDegree;
	}

	
	double receiveScholarShip(double min, double amount){
		
		if(this.grade>=min && this.age<30){
			this.money+=amount;
		}
		
		return money;
		
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		if (!subject.isEmpty()) {
			this.subject = subject;
		}
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		if (grade >= 2 && grade <= 6) {
			this.grade = grade;
		}
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (!name.isEmpty()) {
			this.name = name;
		}

	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		}
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		if (money > 0) {
			this.money = money;
		}
	}
	
	public int getYearInCollege() {
		return yearInCollege;
	}

	public void setYearInCollege(int yearInCollege) {
		if (yearInCollege > 1 && yearInCollege <= 4) {
			this.yearInCollege = yearInCollege;
		}
	}

	


	
	

}
