package java_Question;

public class Reverse_String {

	public static void main(String[] args) {
		
		String s="MyJava";
		String afterreverse="";
		
		char[] arraychar = s.toCharArray();
		
		for(int i=arraychar.length-1;i>=0;i--) {
			
			System.out.println("The reverse of String is: "+arraychar[i]);
			afterreverse+=arraychar[i];
		
		}
		System.out.println(afterreverse);
	}

}
