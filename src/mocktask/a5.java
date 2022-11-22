package mocktask;

public class a5 {

	void m1() {
		System.out.println("m1");
	}
	void m1(int a) {
		System.out.println("m1-2");
	}
	public static void main(String[] args) {
	a5 a=new a5();
	a.m1();
	a.m1(10);
	}

}
