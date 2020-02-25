package Day9;

public class StaticInnerClass {
	int x=10;
	static int y=20;
	
	static class Inner
	{
		public void display()
		{
			System.out.println("Static Inner Implementation Succesful and the value of Y is: "+y);
		}
	}
	public static void main(String[] args) {
		StaticInnerClass.Inner sic= new StaticInnerClass.Inner();
		sic.display();

	}

}
