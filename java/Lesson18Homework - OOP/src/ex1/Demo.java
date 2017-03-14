package ex1;

public class Demo {

	public static void main(String[] args) {
		
		Task task = new Task("boqdisvane", 8);
		Task task2 = new Task("kopane", 8);

		Task task3 = new Task("uchene", 8);
		Task task4 = new Task("razhojdane", 8);

		
		
		AllWork neshto = new AllWork();
		neshto.addTask(task);
		neshto.addTask(task2);
		neshto.addTask(task3);
		neshto.addTask(task4);
		
		
		Employee ivan = new Employee("Ivan");
		ivan.setAllWork(neshto);
	
		ivan.work();
		System.out.println(ivan.getCurrentTask());	
		
		Employee pesho = new Employee("pesho");
		pesho.setAllWork(neshto);
		pesho.work();
		System.out.println(pesho.getCurrentTask());
	}
}