
public class Exercise1 {

	public static void main(String[] args) {
		
		int [][] masiv = {
				{48,72,13,14,15},
				{21,22,53,24,75},
				{31,57,33,34,35},
				{41,95,43,44,45},
				{59,52,53,54,55},
				{61,69,63,64,65}
		};
		int min = masiv[0][0];
		int max =0;
		for(int i=0; i<masiv.length; i++){
			for(int j =0; j<masiv[i].length; j++){
				
				
	            if(masiv[i][j] < min)
	            {
	                min = masiv[i][j];
	            }
	            if(masiv[i][j] > max)
	            {
	                max = masiv[i][j];
	            }
			}	
			
		}
		System.out.println("The smallest number is: " +min);
		System.out.println("The bigger number is: " +max);
	}

}
