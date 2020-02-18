package TrainingData;

public class Strings1
{
	public static void main (String args[])
	{

		String msg="I am an engineer";
		String year="of 2020";
		String s1="java";  
		String s2="java"; 
		String s3="";
		
		msg.concat(year);
		System.out.println(msg);  
		msg=msg.concat(year);  
		System.out.println(msg);
		
		char ch=msg.charAt(4);
		System.out.println(ch);


		System.out.println(msg.length());
		
		String sf1=String.format("name is %s",msg); 
		System.out.println(sf1); 
		
		System.out.println(msg.substring(2,4));
		
		System.out.println(msg.substring(2));
		
		System.out.println(msg.contains("an"));
		System.out.println(msg.contains("about"));
		
		
		String joinString1=String.join("-","welcome","to","java");  
		System.out.println(joinString1); 
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(msg));
		
		System.out.println(s3.isEmpty());  

		String replaceString=msg.replace('a','e');
		System.out.println(replaceString); 
		
		
			
		}
}