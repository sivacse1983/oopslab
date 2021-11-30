/*Program to split the string based on blank-space and store it in string array and print based on the following conditions:
print even position strings + odd position strings.
(eg. Input: This is java program  Output: isprogramThisjava)*/
class AddString
{
	public static void main(String args[])
	{
		String ip="This is java program";
		String op[]=ip.split(" ");
		String odd="";
		String even="";
		for(int i=0;i<op.length;i++)
		{
			if(i%2==0)
			{
				odd+=op[i];	
			}
			else
			{
				even+=op[i];
			}
		}
		String res=even+odd;
		System.out.println("Result:"+res);
	}
}

