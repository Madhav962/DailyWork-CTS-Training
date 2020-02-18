package TrainingData;

public class StringBuildr
{
	public static void main(String args[])
	{
		
	
	StringBuilder sb= new StringBuilder();
//	capacity check
	
	System.out.println(sb.capacity()); 
	
	sb.append("Hello to Java Version 8");
	
	System.out.println(sb.capacity());
	
	sb.append("This is my Version for Development");
	
	System.out.println(sb.capacity());
	
//	insertion
	
	sb.insert(9, "Dear");
	
	System.out.println(sb);
	
//	replace string

	
	sb.replace(19, 26, "");
	
	System.out.println(sb);
	
//	deletion
	
	sb.delete(19, 26);
	
	System.out.println(sb);
	
//	reverse string
	
	sb.reverse();
	
	System.out.println(sb);
	
	}
	
}