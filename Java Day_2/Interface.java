package TrainingData;

interface Hello
{
	int add(int a, int b);
}

class Imp implements Hello
{
	public int add(int a, int b)
	{
		return a+b;
	}
}

public class Interface
{
	public static void main (String args[])
	{
		Imp i= new Imp();
		System.out.print(i.add(2, 3));
	}
}