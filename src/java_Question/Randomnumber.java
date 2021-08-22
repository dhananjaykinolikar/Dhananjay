package java_Question;

import java.util.Random;

public class Randomnumber {

	public static void main(String[] args) {

		Random ram= new Random();
		for(int i=0;i<10;i++) {
			
			System.out.println("The random number is: "+ram.nextInt(1000));
		}

	}

}
