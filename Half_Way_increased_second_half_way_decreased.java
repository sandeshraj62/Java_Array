package prepinsta;
import java.util.Scanner;
public class Half_Way_increased_second_half_way_decreased
{
  public static void main(String args[])
  {
	  Scanner s= new Scanner(System.in);
	  System.out.println("Enter the length of the array :");
	  int length=s.nextInt();
	  int arr[]= new int[50];
	  for(int i=0;i<length;i++)
	  {
		  arr[i]=s.nextInt();
	  }
	  int temp;
	  for(int i=0;i<length;i++)
	  {
		  for(int j=i+1;j<length;j++)
		  {
			  if(arr[i]>arr[j])
			  {
				  temp=arr[i];
				  arr[i]=arr[j];
				  arr[j]=temp;
			  }
		  }
	  }
	  
	  System.out.println("Sorted Array");
	  for(int i=0;i<length/2;i++)
	  {
		  System.out.print(arr[i]+" ");
	  }
	  for(int i=length-1;i>=length/2;i--)
	  {
		  System.out.print(arr[i]+" ");	  
	  }
	  }
	  
  }

