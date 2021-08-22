package java_Question;

public class Second_larger_number {

	public static void main(String[] args) {
		
		int[] number= {10,11,12,13,0,15,16};
		
		int largenum= number[0];
		int smallnum= number[0];
		int secondlargnum=number[0];
		for(int j=0;j<number.length;j++) {
			
			if(number[j]>largenum) {
				secondlargnum=largenum;
				largenum=number[j]; }
				else if(number[j]>secondlargnum) { 
				secondlargnum=number[j];
				}
			
		}
		System.out.println("The second larger number is:"+secondlargnum);

	}

	}


