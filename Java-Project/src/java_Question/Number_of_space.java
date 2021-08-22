package java_Question;

public class Number_of_space {

	public static void main(String[] args) {
		
		String s="I am writing Java Program";
		int word =1;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ')
				word++;
		}
		
		System.out.println("The number of words is: "+word);
		System.out.println("The number of words is: "+(word-1));
		}

	}


