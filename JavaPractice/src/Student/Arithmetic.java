package Student;

public class Arithmetic {

	public int sum(int a, int b) {
		int c;
		c=a+b;
		System.out.println("Value of sum is: "+ c);
		return c;
	}
	public int sub(int x, int y) {
		int z;
		z=x-y;
		System.out.println("Value of subtraction is: "+z);
		return z;
	}
	public int mul(int a1, int b1) {
		int c1;
		c1=a1*b1;
		System.out.println("result of multiplication is: "+c1);
		return c1;
	}
	public void div(int x1, int y1) {
		int z1;
		z1=x1/y1;
		System.out.println("result of division is:"+z1);
	}
	public static void main(String[] args) {
//		System.out.println("welcome");
		Arithmetic ob=new Arithmetic();
		int sumresult=ob.sum(10, 2);
		int sumresult1=ob.sum(sumresult, 2);
		int subresult=ob.sub(sumresult1, 2);
		int mulresult=ob.mul(subresult, 2);
		ob.div(mulresult, 2);
	}
}
