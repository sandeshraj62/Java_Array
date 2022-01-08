package prepinsta;
import java.util.Scanner;
// Factorial of the number 
public class Factorial_number 
{
 public static void main(String args[])
 {
	 Scanner s= new Scanner(System.in);
	 System.out.println("Enter the number :");
	 int number=s.nextInt();
	 int fact=1;
	 for(int i=1;i<=number;i++)
	 {
		 fact=fact*i;	
	 }
	 System.out.println("Factorial of the "+number+"  is :"+fact);
	 s.close();
 }
}
