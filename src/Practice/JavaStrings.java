package Practice;

public class JavaStrings {

	public static void main(String[] args) {
		
		//Problem 1
		
		String name= "Harry Potter";
		
		name = name.toLowerCase();
		
		System.out.println(name);
		
		//Problem 2;
		
		String spacename= "I am Harry Potter";
		
		spacename=spacename.replace(" ","_");
		
		System.out.println(spacename);
		
		//problem 3;
		
		String MyString = "i am doublespace  i am triple space  .";
		
		System.out.println(MyString.indexOf("  "));
		System.out.println(MyString.indexOf("   "));
	}

}
