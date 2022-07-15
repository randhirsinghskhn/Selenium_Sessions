package Student;

public class Swift extends Maruti {

	public Swift()
	{
		this(5,7);
		System.out.println("Child default constructor");
	}
	public Swift(int a)
	{
		this(3,4,5,6);
		System.out.println("Child one parametrized constructor");
	}
	public Swift(int a, int b)
	{
		super(5);
		System.out.println("Child two parametrized constructor");
		
	}
	public Swift(int a, int b, int c)
	{
		this();
		System.out.println("Child three parametrized constructor");
	}
	public Swift(int a, int b, int c, int d)
	{
		this(5,6,7);
		System.out.println("Child four parametrized constructor");
	}
	public void m2()
	{
		System.out.println("This is swift class");
	}
	public static void main(String[] args) {
		Swift ob=new Swift(3);
		ob.m1();
		ob.m2();
	}
}
