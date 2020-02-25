package Day9;

public class LambdaExpression {
	

	public static void main(String[] args) {
		
//	Runnable r=()-> System.out.println("Hello Runnable");
//	Thread t= new Thread(r);
//	t.start();
		//..........implementing interface using Lambda............
		Welcome1 h=()->"Good morning";
		System.out.println(h.greetings());
	}
}
// implementing Lambda Above to avoid tis much code..................................
//	public static void main(String[] args) {
//		
//		MyThread t=new MyThread();
//		Thread thread=new Thread(t);
//		thread.start();
//
//	}
//
//}
//class MyThread implements Runnable
//{
//
//@Override
//public void run()
//{
//	System.out.println("Hello Runnable");
//}
//}

@FunctionalInterface
interface Welcome1
{
	String greetings();
	//public void display();
}

