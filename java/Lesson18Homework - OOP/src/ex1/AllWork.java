package ex1;

public class AllWork {
	
	private Task[] tasks;
	private	int freePlacesForTasks;
	private int currentUnassignedTask;
	
	
	public int getCurrentUnassignedTask() {
		return currentUnassignedTask;
	}
	public AllWork(){
		freePlacesForTasks=10;
		tasks=new Task[10];
		currentUnassignedTask=0;
		
	}
	public void addTask(Task task){
		for (int i = 0; i < tasks.length; i++) {
			if(tasks[i]==null){
				tasks[i]=task;
				freePlacesForTasks--;
				break;
			}
		}
	}
	
	public Task getNextTask(){
		if(currentUnassignedTask>=0 && currentUnassignedTask<=9){
			return tasks[currentUnassignedTask++];
			
		}
	
		else{
			return null;
		}
	
	}
		public boolean isAllWorkDone(){
			for (int i = 0; i < tasks.length; i++) {
				if(tasks[i].getWorkingHours()!=0){
					return false;
				}
				
			}
			return true;
		}
	
	
	

}
