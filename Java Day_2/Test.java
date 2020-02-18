package TrainingData;

class All
{
	int x=10;
	
	public void display()
	{
		System.out.println("class A");
	}
}

class Ball extends All
{
	@Override
	public void display()
	{
		System.out.println("class B");
	}
}

public class Test
{
	public static void main(String args[])
	
	{
		All a1 = new Ball();
		a1.display();
	}
}