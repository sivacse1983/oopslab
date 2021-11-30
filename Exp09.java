/*Create a java program to generate key based on input.
(eg. Input1=63752 (A 5 digit number)
Input2= Program (A String)
Input3= 4 (An integer)
Output : input3 + odd position characters in a string + 
input 3’s digit in input1= 4Porm5.
*/
import java.util.*;
class Exp09
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a 5 digit number:");
		int ip1=sc.nextInt();
		System.out.print("Enter a String:");
		String ip2=sc.next();
		System.out.print("Enter an integer:");
		int ip3=sc.nextInt();
		
		String op2="";
		char[] cArray = ip2.toCharArray();
		for(int i=0;i<cArray.length;)
		{
			op2+=cArray[i];
			i+=2;
		}
		String op=ip3+op2;
		int rem=0;
		for(int i=5;i>0;i--)
		{
			rem=ip1%10;
			if(i==ip3)
			{
				op=op+rem;
				break;
			}
			ip1=ip1/10;
		}
		System.out.print("Output:"+op);
	}
}