package Student;

public class ABC {

	public ABC() {
		this(7,5,3);
		System.out.println("Default constructor");
	}
	public ABC(int a)
	{
		this();
		System.out.println("One parameterized consturctor");
	}
	public ABC(int a,int b)
	{
		this(5);
		System.out.println("Two parameterized consturctor");
	}
	public ABC(int a, int b, int c)
	{
		System.out.println("Three parameterized consturctor");
	}
	public ABC(int a, int b, int c, int d)
	{
		this(3,4);
		System.out.println("Four parameterized consturctor");
	}
	public static void main(String[] args) {
		ABC ob=new ABC(12,2,3,5);
	}
	
}
