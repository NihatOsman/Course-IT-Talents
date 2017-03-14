package ex1;

public class Person {
	
	private String name;
	private int age;
	private boolean isMale;
	
	
	public Person(String name, int age, boolean isMale) {
		this.name=name;
		this.age=age;
		this.isMale=isMale;
	}
	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public boolean isMale() {
		return isMale;
	}

	void showPersonInfo(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(isMale);
	}
	
	

}
