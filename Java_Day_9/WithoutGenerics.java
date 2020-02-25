package Day9;
class Test
{
	private Object obj;
	public Object get()
	{
		return obj;
	}
	public void set(Object obj)
	{
		this.obj=obj;
	}
}
public class WithoutGenerics {


	public static void main(String[] args) {
		Test t=new Test();
		t.set(5);
		int i=(int)t.get();
		System.out.println(i);

	}

}
