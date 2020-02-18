package TrainingData;

interface Addition1
{
	
	int add(int a, int b);
	
	default int mult(int a,int b)
	{
		return a*b;
	}
	static int mod(int a,int b)
	{
		return a%b;
	}
}

interface Subtract1 extends Addition1
{
	int sub(int a, int b);
}

class Divide
{
	public int div(int a,int b)
	{
		return a/b;
	}
}

class Implem extends Divide implements Addition1
{
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int sub(int a, int b)
	{
		if(a>b)
		{
		return a-b;
	    }
		else
		{
			return b-a;
		}
	}
	 
	}

public class InterfaceMethods
{
	public static void main (String args[])
	{
		Implem i= new Implem();
		Divide d= new Divide();
		System.out.println(i.add(2, 3));
		System.out.println(i.sub(8, 10));
		System.out.println(i.mult(8, 5));
		System.out.print(Addition1.mod(8, 4));
		System.out.print(d.div(3,2));
	}
}