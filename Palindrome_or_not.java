package prepinsta;
import java.util.Scanner;
// Check whether the number or string is Palindrome or not
public class Palindrome_or_not
{
	public static void main(String args[])
	{
      Scanner s= new Scanner (System.in);
      System.out.println("Enter the String");
      String str =s.next();
      int length=str.length();
      String str1="";
      for(int i=0;i<length;i++)
      {
    	  char ch=str.charAt(i);
    	  str1= ch+str1;
      }
      if(str.equals(str1))
      {
    	 System.out.println("Palindrome"); 
      }else
      {
    	System.out.println("Not a palindrome");  
      }
      s.close();
      
      
      
	}
}
