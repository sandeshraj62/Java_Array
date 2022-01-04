package prepinsta;
//import java.util.Scanner;
// Second smallest element present in the array 
public class Second_Smallest_element_array 
{
  public static void main(String args[])
  {
	  int arr[]= {8,4,9,1,6,7,3};
	  System.out.println("Second Smallest element of the array :"+minimum(arr,7));
  }
  
  public static int minimum(int arr[],int total)
  {
	 // Scanner s= new Scanner(System.in);
	  int temp;
	  for(int i=0;i<total;i++)
	  {
       for(int j=i+1;j<total;j++)
       {
    	   if(arr[i]>arr[j])
    	   {
    		   temp=arr[i];
    		   arr[i]=arr[j];
    		   arr[j]=temp;
    	   }
       }
	  }
        return arr[1];
	  } 
  }

