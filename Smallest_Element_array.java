package prepinsta;

public class Smallest_Element_array 
{
  public static void main(String args[])
  {
	  int arr[]= {7,5,4,1,3,9,8,2};
	  int min=arr[0];
	  for(int i=0;i<arr.length;i++)
	  {
		  if(arr[i]<min)
		  {
			  min=arr[i];
		  }
	  }
	  System.out.println("Smallest Element of the array :"+min);
  }
}
