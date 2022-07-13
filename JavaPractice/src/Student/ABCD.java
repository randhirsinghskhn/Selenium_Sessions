package Student;

public class ABCD {

	public void m1() {
		System.out.println("Default method");
		this.m2(5);
	}
	public void m2(int a) {
		System.out.println("one parameterized method");
		this.m3(5, 6);
	}
	public void m3(int a,int b) {
		System.out.println("Two parameterized method");
		this.m5(6,5,4,8);
	}
	public void m4(int a, int b, int c) {
		System.out.println("Three parameterized method");
		this.m1();
	}
	public void m5(int a, int b, int c ,int d) {
		System.out.println("Four parameterized method");
	}
	public static void main(String[] args) {
		ABCD ob=new ABCD();
		ob.m4(3,5,6);
	}
	
}
