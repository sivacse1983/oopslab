/*Define Constructor. Create a java program to find area of square 
and rectangle using default constructor and parametrized constructor.*/
class Area
{
	int area;
	Area()
	{
		int a=10;
		area=a*a;
	}
	Area(int l,int b)
	{
		area=l*b;
	}
	int getArea()
	{
		return area;
	}
}
class AreaDemo
{
	public static void main(String args[])
	{
		Area squa=new Area();
		System.out.println("Area of square:"+squa.getArea());
		Area rect=new Area(2,3);
		System.out.println("Area of rectangle:"+rect.getArea());
	}
}