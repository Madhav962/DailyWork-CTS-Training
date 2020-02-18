/*Consider the string str="Global Warming"
    Write statements in Java to implement the following
    a) To display the last four characters.
    b) To display the substring starting from index 4 and ending at index 8.
    c) To check whether string has alphanumeric characters or not.
    d) To trim the last four characters from the string.
    e) To trim the first four characters from the string.
    f) To display the starting index for the substring "Wa".
    g) To change the case of the given string.
    h) To check if the string is in title case.
    i) To replace all the occurrences of letter "a" in the string with "*"*/

package TrainingData;

public class StringQuestion
{
    
public static void main(String args[])
{
	
	String str="Global Warming";
	
	
//	To display the last four characters.
	
	System.out.println(str.substring(10));

//	 To display the substring starting from index 4 and ending at index 8.
	
	System.out.println(str.substring(4,8));

//	 To check whether string has alphanumeric characters or not.
	
	System.out.println(str != null && str.matches("^[a-zA-Z0-9]*$"));
	
//	To trim the last four characters from the string.
	
	System.out.println(str.substring(0, str.length() - 4));
	
//	 To trim the first four characters from the string.
	
	System.out.println(str.substring(4, str.length() ));
	
//	To display the starting index for the substring "Wa".
	
	System.out.println(str.indexOf("Wa"));
	
//	To change the case of the given string
	
	StringBuffer newStr=new StringBuffer(str);  
    
    for(int i = 0; i < str.length(); i++) {  
          
        if(Character.isLowerCase(str.charAt(i))) {  
            
            newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));  
        }  
      
        else if(Character.isUpperCase(str.charAt(i))) {  
        newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));  
        }  
    }  
    System.out.println("String after case conversion : " + newStr);  

    
//    To check if the string is in title case
    boolean result1=false;
    
	//String str=" Global Warming";
    
	String [] words=str.split("\\s+");
for(int i=0;i<words.length;i++)
{
	char ch=words[i].charAt(0);
	if(ch>=65 && ch<=90)
	{
		result1=true;
	}
	else
	{
		result1= false;
		break;
	}
	System.out.println(result1);
}
		
    
//    To replace all the occurrences of letter "a" in the string with "*"
    
System.out.println( str.replace('a', '*'));
    		
}}  
    
