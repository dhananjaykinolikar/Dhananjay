package Practice;

import java.util.Random;

public class randomnumber {

	public static void main(String[] args) {
		
	
		System.out.println(" random 2: "+randomnumber());

	}
	
	public static long randomnumber() {
	    Random random = new Random();
	    StringBuilder sb = new StringBuilder();

	    // first not 0 digit
	    sb.append(random.nextInt(9) + 1);

	    // rest of 11 digits
	    for (int i = 0; i < 11; i++) {
	        sb.append(random.nextInt(10));
	    }

	    return Long.valueOf(sb.toString()).longValue();
	}
	
	

}
