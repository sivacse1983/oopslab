import java.util.*;
class MyException extends Exception
{
	int age1;
	MyException(int a)
	{
		age1=a;
		System.out.println("This is user defined exception");
	}
	public String toString()
	{
		return ("Since your age is "+age1+", You are not eligble to vote");
	}
}
class UserDefinedExceptionDemo
{ 
	public static void main(String args[]) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Age:");
		int age=sc.nextInt();
		try 
		{ 
			if(age>=18)
			{
				System.out.println("Good, You are eligible to vote");
			}
			else
			{
				throw new MyException(age);
			}
		} 
		catch(MyException exp) 
		{ 
			System.out.println("Sorry") ; 
			System.out.println(exp) ; 
		} 
	} 
}
