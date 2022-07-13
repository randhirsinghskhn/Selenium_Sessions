package Student;

public class Assignment2 {

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
	public void mul(int a1, int b1) {
		int c1;
		c1=a1*b1;
		System.out.println("result of multiplication is: "+c1);
		
	}
	public int div(int x1, int y1) {
		int z1;
		z1=x1/y1;
		System.out.println("result of division is:"+z1);
		return z1;
	}
	public static void main(String[] args) {
//		System.out.println("welcome");
		Assignment2 obb=new Assignment2();
		int divres=obb.div(10, 2);
		int subres=obb.sub(divres, 2);
		int subres1=obb.sub(subres, 2);
		int sumres=obb.sum(subres1, 2);
		obb.mul(sumres, 2);
	}
}
