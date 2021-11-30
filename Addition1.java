//4. Programs using constructors and this keyword
import java.util.*;
class Addition
{
	int a,b;
	int result;
	Addition(int a,int b) //parameterized constructor
	{
		this.a= a;
		this.b= b;
		result=0;
	}
	void add()
	{
		result=a+b;
	}
	void display()
	{
		System.out.println("Result="+result);
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value:");
		int a=sc.nextInt();
		System.out.println("Enter second value:");
		int b=sc.nextInt();
		Addition obj=new Addition(a,b);
		obj.add();
		obj.display();
	}

}