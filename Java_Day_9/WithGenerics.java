package Day9;

class Test1<T>
{
	private T obj;
	public T get()
	{
		return obj;
	}
	public void set(T obj)
	{
		this.obj=obj;
	}
}
public class WithGenerics {

	public static void main(String[] args) {
		Test1 <Integer> t=new Test1<>();
		t.set(5);
		int i=(int)t.get();
		System.out.println(i);

	}

}
