package Student;

public class Maruti {

	public Maruti()
	{
		this(8,6,5);
		System.out.println("Parent Default constructor.");
	}
	public Maruti(int a)
	{
		this(6,7);
		System.out.println("Parent one parameterized constructor.");
	}
	public Maruti(int a,int b)
	{
		this(2,5,7,9);
		System.out.println("Parent two parameterized constructor.");
	}
	public Maruti(int a,int b,int c)
	{
		System.out.println("Parent three parameterized constructor.");
	}
	public Maruti(int a,int b,int c,int d)
	{
		this();
		System.out.println("Parent four parameterized constructor.");
	}
	public void m1()
	{
		System.out.println("This is maruti class");
	}
}
