package prepinsta;
import java.util.Scanner;
// Print the prime number in range - method used is FOR LOOP
public class Prime_number_in_range 
{
  public static void main(String args[])
  {
	  Scanner s= new Scanner(System.in);
	  System.out.println("Starting index of the prime number is :");
	  int start=s.nextInt();
	  System.out.println("Ending point of the prime number is :");
	  int end=s.nextInt();
	  System.out.println(" Prime number in the range is :");
	  int count;
	  for(int i=start;i<=end;i++)
	  {
		   count=0;
		  for(int j=1;j<=i;j++)
		  {
			  if(i%j==0)
				  count=count+1;
		  }
		  if(count==2)
			  System.out.println(i);
		  
	  }
	  s.close();
	  
  }
}
