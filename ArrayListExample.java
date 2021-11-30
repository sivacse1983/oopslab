import java.util.*;
class ArrayListExample
{
	public static void main(String args[])
	{
		ArrayList stu=new ArrayList();
		stu.add("Ram");                   
		stu.add("Thilak");
		stu.add(5);
		Iterator itr=stu.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}