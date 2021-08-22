package java_Question;

public class String_total_nos_occurance {

	public static void main(String[] args) {
		
		String s="I am using Eclipse for java training course";
		
		//char c = 'a';
		
		int count = s.length() - s.replace("a", "").length();
		
		System.out.println("The total occurace of a is: "+count);
	}

}
