package Student;

import java.util.Scanner;

public class ScannerClass {

	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("value of sum is: "+c);
		return c;
	}
	public int sub(int x, int y)
	{
		int z=x-y;
		System.out.println("value of subtraction is:"+z);
		return z;
	}
	public int mul(int d,int e)
	{
		int f=d*e;
		System.out.println("Result of multiplication is:"+ f);
		return f;
		
	}
	public void div(int j, int k)
	{
		int l=j/k;
		System.out.println("Result of divison is:"+l);
	}
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the value of x1");
		int x1=ob.nextInt();
		System.out.println("Enter the value of x2");
		int x2=ob.nextInt();
		System.out.println("Enter the value of x3");
		int x3=ob.nextInt();
		System.out.println("Enter the value of x4");
		int x4=ob.nextInt();
		System.out.println("Enter the value of x5");
		int x5=ob.nextInt();
		System.out.println("Enter the value of x6");
		int x6=ob.nextInt();
		ScannerClass ob1=new ScannerClass();
		int sumresult=ob1.sum(x1, x2);
		int sumresult1=ob1.sum(sumresult, x3);
		int subresult=ob1.sub(sumresult1, x4);
		int mulresult=ob1.mul(subresult, x5);
		ob1.div(mulresult, x6);
	}
}
