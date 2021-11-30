import java.io.*;
import java.util.Scanner;
class Compare
{
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) 
	{ 
		T max = x;
		if(y.compareTo(max) > 0) 
		{ 
			max = y;
		} 
		if(z.compareTo(max) > 0) 
		{ 
			max = z;
		} 
		return max;
	} 
}
class Exp13
{
	public static void main(String args[]) 
	{ 
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter three integer values for a,b and c:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("Enter three decimal values for p,q and r:");
		double p=sc.nextDouble();
		double q=sc.nextDouble();
		double r=sc.nextDouble();
		System.out.println("Enter three strings values for x, y and z:");
		String x=sc.next();
		String y=sc.next();
		String z=sc.next();
		System.out.println("Max of a,b and c:"+Compare.maximum(a,b,c));
	    System.out.println("Max of p,q and r:"+Compare.maximum(p,q,r)); 
	    System.out.printf("Max of x,y and z:"+Compare.maximum(x,y,z)); 
	} 
}