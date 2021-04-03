package Constructors;

public class Hello {
	
	String Name;

	public Hello(int i) {
		
		System.out.println("i is the integer: "+i);
		
		this.Name="I am constructor";
	}
	
	public void hello()
	{
		System.out.println("I am hello method");
	}


	public static void main(String[] args) {
		
		Hello obj = new Hello(15);
		
		System.out.println(obj.Name);
		
		obj.hello();
		
		
		
	//System.out.println(obj);

	}
	
	
	

}
