package prepinsta;
import java.util.Scanner;
// Automorphic number : if any number upon squaring , can same number at the end of that number is called automorphic 
// 25=(25*25)=625  last  number is 25 , so this is automorphic number
public class Automorphic_number
{
  public static void main(String args[])
  {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter any number :");
	  int num=s.nextInt();
	  String str=Integer.toString(num);
	  int len=str.length();
	  int square=num*num;
	  String str1=Integer.toString(square);
	  int len1=str1.length();
	  String str2=str1.substring(len1-len);
	  if(str.equals(str2))
	  {
		  System.out.println("Automorphic number");
	  }else
	  {
		  System.out.println("Not a Automorphic number");
	  }
	  s.close();
	  
  }
}
