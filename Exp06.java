/*
Exp.No.	:06
Date	:06-10-2021
Program using array concept
 i)to find the number of increasing sequence in an array. 
 ii)Finding the frequent number series in an array
*/
import java.util.*;
class Exp06
{
	void increaSeq(int arr[])
	{
		int count=1;
		int j=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i-1]<arr[i])
			{
				count++;
			}
			else
			{
				if(count>1)
				{
					j++;
					count=1;	
				}
			}
		}
		if(count>1)
			j++;
		System.out.println("Number of increasing sequence:"+j);	
	}
	void freqNumber(int arr[])
	{
		int [] fr = new int [arr.length];  
        int visited = -1;  
        for(int i = 0; i < arr.length; i++)
		{  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++)
			{  
                if(arr[i] == arr[j])
				{  
                    count++;  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        } 
		int max=fr[0];int maxpos=0;
		for(int i=1;i<fr.length;i++)
		{
			if(fr[i]>max)
			{
				max=fr[i];
				maxpos=i;
			}
		}
		System.out.println("Frequent Number series is:"+arr[maxpos]);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" values of an array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();	
		}
		Exp06 obj=new Exp06();
		obj.increaSeq(arr);
		obj.freqNumber(arr);
	}
}