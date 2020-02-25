package Day9;

class Hello
{
	public void greet()
	{
		System.out.println("Good Morning");
	}
}
public class AnonymousWithConcrete {

	public static void main(String[] args) {
		
		Hello h= new Hello()
{
		
		@Override
		public void greet()
		{
			System.out.println("Good Afternoon");
		}
};
	h.greet();

		

	}

}
