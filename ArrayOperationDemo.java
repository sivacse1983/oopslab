//EX.07.Program to find largest element in an array, 
//add the largest element to each element and print the sorted array.
class ArrayOperation
{
	int max;
	int inputArray[];
	int sortedArray[];
	ArrayOperation(int num[])
	{
		max=0;
		inputArray=new int[num.length];
		sortedArray=new int[num.length];
	}
	void arrayMax(int num[])
	{
		for(int i=0;i<num.length;i++)
		{
			inputArray[i]=num[i];
			sortedArray[i]=num[i];
			if(num[i]>max)
			{
				max=num[i];
			}
		}
	}
	void addMax()
	{
		for(int i=0;i<5;i++)
		{
			sortedArray[i]=sortedArray[i]+max;
		}
	}
	void sort()
	{
		for(int i=0;i<sortedArray.length;i++)
		{
			for(int j=i;j<sortedArray.length;j++)
			{
				if(sortedArray[i]>sortedArray[j])
				{
					int temp=sortedArray[i];
					sortedArray[i]=sortedArray[j];
					sortedArray[j]=temp;
				}
			}
		}
	}
	void display()
	{
		System.out.println("Input Array Elements:");
		for(int x:inputArray)
		{
			System.out.println(x);
		}
		System.out.println();
		System.out.println("Largest element in the array:"+max);
		System.out.println();
		System.out.println("Sorted Array Elements after adding maximum value:");
		for(int x:sortedArray)
		{
			System.out.println(x);
		}
	}
}
class ArrayOperationDemo
{
	public static void main(String args[])
	{
		int arr[]={1111,2222,6666,4444,5555};
		ArrayOperation obj=new ArrayOperation(arr);
		obj.arrayMax(arr);
		obj.addMax();
		obj.sort();
		obj.display();
	}
}