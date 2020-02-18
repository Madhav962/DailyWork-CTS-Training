package TrainingData;

interface Addition
{
	int add(int a, int b);
}

interface Subtract extends Addition
{
	int sub(int a, int b);
}

class Div
{
	public int div(int a,int b)
	{
		return a/b;
	}
}

class Implee extends Div implements Subtract 
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



public class InterfaceDivision
{
	public static void main (String args[])
	{
		Implee i= new Implee();
		Div d= new Div();
		System.out.println(d.div(12,6));
		System.out.print(i.add(2, 3));
		System.out.println(i.sub(8, 10));
		
	}
}