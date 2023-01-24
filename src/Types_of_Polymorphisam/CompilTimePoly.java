package Types_of_Polymorphisam;
//same method name different argument list in same class
//This nothing but methoOverloading

public class CompilTimePoly 
{
	public  void isAdd(int a,int b ) 
	{
		int c=a+b;
		System.out.println("Addition of int:"+c);
	}
	public  void isAdd(double a,double b) 
	{
		double c=a+b;
		System.out.println("Addition of int:"+c);
	}
	public  void isAdd(boolean a) 
	{
		System.out.println("im boolean");
	}
	public static void main(String[] args) 
	{
		CompilTimePoly c1=new CompilTimePoly();
		c1.isAdd(false);
		c1.isAdd(10.5, 20.5);
		c1.isAdd(10, 20);

	}
}
