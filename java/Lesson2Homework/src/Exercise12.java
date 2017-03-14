import java.util.Scanner;


public class Exercise12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int day,month,year,res,res1,res2;
		System.out.println("Enter day: ");
		day = input.nextInt();
		System.out.println("Enter mouth: ");
		month = input.nextInt();
		System.out.println("Enter year: ");
		year = input.nextInt();
		res = year %4;
		res1 = year %100;
		res2 = year %400;
		
			
		
		if(day==31 && (month==1||month==3||month==5||month==7||month==8||month==10)){
			
			day = 1;
			month ++;
			System.out.println(day + "," + month + "," + year);
			
		}
		if(day==30 && (month==1||month==3||month==5||month==7||month==8||month==10 || month==12)){
			
			day = 31;
			System.out.println(day + "," + month + "," + year);
			
		}
		if(day==31 && month==12){
			
			day = 1;
			month = 1;
			year ++;
			System.out.println(day + "," + month + "," + year);
			
		}
		if(day==30 && (month==4||month==6||month==9||month==11)){
				
			day =1;
			month ++;
			System.out.println(day + "," + month + "," + year);
		}
		if ((res==0||res2==0)&& (month==2&&day==29)){
			day=1;
			month ++;
			System.out.println(day + "," + month+ ","  + year);
			
		}	
		if ((res==0||res2==0) && (month==2 && day == 28)){
			day++;
			System.out.println(day + "," + month+ ","  + year);
		}
		if((res>0||res2>0 ||res1==0) && (month==2 && day==28)){
			day=1;
			month ++;
			System.out.println(day + "," + month + "," + year);
		}
		
		
		if(day>1 && day<=30 &&(res>=0||res2>=0||res1==0) && (month!=2 && month!=3)){
			day++;
			System.out.println(day + "," + month + "," + year);
		}
		if(day>1 && day<=27 &&(res>=0||res>=0||res==0) && (month==2) ){
			day++;
			System.out.println(day + "," + month + "," + year);
		}
		if(day>1 && day<=29 &&(res>=0||res2>=0||res1==0) && (month==3)){
			day++;
			System.out.println(day + "," + month + "," + year);
		}

		
	}

}

