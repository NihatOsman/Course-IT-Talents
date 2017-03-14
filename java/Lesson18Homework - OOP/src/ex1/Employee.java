package ex1;

public class Employee {
	
	private String name;
	private Task currentTask;
	private int hoursleft = 8;
	private AllWork allWork;
	
	Employee(String name){
		if(!name.isEmpty() && name!=null){
			this.name=name;
		}
		
	}

	public String getName(){
		return name;
	}
	
	public AllWork getALLWork(){
		return allWork;
	}
	
	public void setAllWork(AllWork allWork){
		if(allWork != null){
			this.allWork = allWork;
		}
	}

	public int getHourslef() {
		return hoursleft;
	}

	public void setHourslef(int hoursleft) {
		if(hoursleft>=0){
			this.hoursleft = hoursleft;
		}
	}
	
	public void startWorkingDay(){
		hoursleft=8;
	}
	
	
	
	public Task getCurrentTask() {
		return currentTask;
	}

	public void work(){
		if(allWork.getNextTask()!=null){
			this.currentTask=allWork.getNextTask();
			return;
		}else{
			return;
		}
		
		
	}
	
}
