package Types_of_Polymorphisam;

//same method signature we can change the body
//it is nothing but methodOverloading
public class RunTimePoly1
{

	public void name(int a,int b) 
	{
		int c=a+b;
		System.out.println("The addition of :"+c);
	}
}
 class RunTimePoly2 extends RunTimePoly1
{
	public void name(int a,int b) 
	{
		int c=a-b;
		System.out.println("The subtraction of :"+c);
	}
}
class MainClass
{	
	 public static void main(String[] args) 
	   {
	    	RunTimePoly1 r1=new RunTimePoly1();
	    	r1.name(10,10);
	    	RunTimePoly2 r2=new RunTimePoly2();
	    	r2.name(20, 10);
	   }	
}
