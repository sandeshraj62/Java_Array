package prepinsta;
import java.util.Scanner;
// Fibonacci Series
public class Fibonacci_Series_user_input 
{
   public static void main(String args[])
   {
	   Scanner s= new Scanner(System.in);
	   System.out.println("Enter the First number");
	   int a=s.nextInt();
	   System.out.println("Enter the Second number");
	   int b=s.nextInt();
	   //int c=a+b;
	  // int i;
	  // System.out.println("count number till :");
	   int count=10;
	   for(int i=2;i<count;++i)
	   {
		  int  c=a+b;
		   System.out.print(c+" ");
		   a=b;
		   b=c;
	   }
	  // System.out.println("Fibonacci Series is: "+i);
	   s.close();
   }
}
