package TrainingData;

interface Sum
{
	int add(int a, int b);
}

interface Subt extends Sum
{
	int sub(int a, int b);
}

class Imple implements Subt
{
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int sub(int a, int b)
	{
		return a-b;
	}
}

public class ExtendedInterface
{
	public static void main (String args[])
	{
		Imple i= new Imple();
		System.out.println(i.add(2, 3));
		System.out.println(i.sub(8, 10));
	}
}