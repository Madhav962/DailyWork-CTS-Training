package TrainingData;

interface Add
{
	int add(int a, int b);
}

interface Sub
{
	int sub(int a, int b);
}

class Impl implements Add,Sub
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

public class Interface2
{
	public static void main (String args[])
	{
		Impl i= new Impl();
		System.out.print(i.add(2, 3));
		System.out.print(i.sub(8, 10));
	}
}