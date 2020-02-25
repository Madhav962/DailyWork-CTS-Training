package Day9;


public class AnonnymousWithInterface {
	
	interface ThankYou
	{
		public void greet();
	}

	public static void main(String[] args) {
	
		ThankYou h= new ThankYou()
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
