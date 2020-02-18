package TrainingData;

public class StringBuffr
{
	public static void main(String args[])
	{
		
	
	StringBuffer sb= new StringBuffer();
	
	System.out.println(sb.capacity()); 
	
	sb.append("Hello to Java Version 8");
	
	System.out.println(sb.capacity());
	
	sb.append("This is my Version for Development");
	
	System.out.println(sb.capacity());
	
	sb.insert(9, "Dear");
	
	System.out.println(sb);
	
	sb.replace(19, 26, "");
	
	System.out.println(sb);
	
	sb.delete(19, 26);
	
	System.out.println(sb);
	
	sb.reverse();
	
	System.out.println(sb);
	
	}
	
}