package java_Question;

public class Large_and_small_number {

	public static void main(String[] args) {
		
		int[] number= {10,11,12,13,0,15,16};
		
		int largenum= number[0];
		int smallnum= number[0];
	
		
		for(int i=1;i<number.length;i++) {
			
			if(number[i]>largenum) 
				largenum=number[i];
			else if(number[i]<smallnum) 
				smallnum=number[i];
			
		}
		System.out.println("The large number is:"+largenum);
		System.out.println("The small number is:"+smallnum);
		
}
}
