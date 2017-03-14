	
public class Computer {
	
	int year;
	double price;
	boolean isNotebook =true;	
	double hardDiskMemory;
	double freeMemory =500;
	String operationSystem;
	
	void changeOperationSystem(String changeOperationSystem){
			
		 operationSystem=changeOperationSystem;
	}
	
	void useMemory(double useMemory){
		
		if(useMemory>freeMemory){
			System.out.println("not enough memory");
		}
		else{
		
		freeMemory-=useMemory;
		}
		
	}
	
	Computer(){
		this.isNotebook=false;
		this.operationSystem="win xp";
	}
	Computer(int year, double price, double hardDiskMemory, double freeMemory){
		this();
		this.year=year;
		this.price=price;
		this.hardDiskMemory=hardDiskMemory;
		this.freeMemory=freeMemory;
		
	}
	
	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory, String operationSystem){
		this(year,price,hardDiskMemory,freeMemory);
		this.isNotebook=isNotebook;
		this.operationSystem=operationSystem;
		
	}
	
	int comparePrice(Computer c){
		if(this.price>c.price){
			
			return -1;
		}
		
		if(this.price<c.price){
			return 1;
		}
		return 0;
	
		
	}
	
	
	
	

	

}
