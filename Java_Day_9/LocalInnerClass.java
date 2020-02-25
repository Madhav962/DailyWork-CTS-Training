package Day9;

public class LocalInnerClass {
	
	int x=10;
	private int y=10;
	public void show()
	{
	class Local{
	public void display()
	{
		System.out.println("Local Inner class Implementation is Successful and the value of  y is:"+y);
		
	}
	}
	Local l= new Local();
	l.display();
	}
	public static void main(String[] args) {
		
LocalInnerClass LIC =new LocalInnerClass();
LIC.show();
	}
}
