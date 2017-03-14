package ex1;

public class Student extends Person {
	
	private double score;
	
	
	
	public double getScore() {
		return score;
	}


	public void setScore(double score) {
		if(score >=2 && score<=6){
			this.score = score;
		}
	}


	Student(String name, int age, boolean isMale, double score){
		super(name, age, isMale);
		this.score=score;
		
	}
	
	
	void showStudentInfo(){
		super.showPersonInfo();
		System.out.print("name is " + this.getName() + "score is " + this.getScore() );
	}
	
	
	
	
	
	
	

}
