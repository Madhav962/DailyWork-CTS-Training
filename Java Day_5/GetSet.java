package TrainingData;

public class GetSet
{
private int age;
private double salary;

public int getAge()
{
	return age;
}

public void setAge( int age)
{
	this.age=age;
}


	public static void main(String args[])
	{
		GetSet g= new GetSet();
		g.getAge();
		g.setAge(25);
		int age= g.getAge();
		System.out.println(age);
	}
}
