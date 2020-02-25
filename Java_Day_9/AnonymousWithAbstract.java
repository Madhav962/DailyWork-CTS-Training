package Day9;


abstract class Welcome
{
	abstract public void greet();
	{
		System.out.println("Good Morning");
	}
}
public class AnonymousWithAbstract {
	
public static void main(String[] args) {
	
          Welcome h=new Welcome() {
			
			@Override
			public void greet() {
				System.out.println("Good Afternoon");
				
			}
		};
			h.greet();

	}

}
