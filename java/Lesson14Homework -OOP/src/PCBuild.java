
public class PCBuild {

	public static void main(String[] args) {
		
		Computer pc = new Computer();
		pc.operationSystem = "windows 95";
		pc.changeOperationSystem("Windows x");
		pc.year =1992;
		pc.price = 55;
		pc.hardDiskMemory =50000;
		pc.freeMemory = 10000;
		System.out.println(pc.operationSystem);
		
		Computer laptop = new Computer();
		laptop.year = 2000;
		laptop.price = 100;
		laptop.hardDiskMemory = 70000;
		laptop.freeMemory =3467;
		laptop.operationSystem ="windows 2000";
		laptop.useMemory(1000);
		System.out.println(laptop.freeMemory);
		
		
		
	}
}
