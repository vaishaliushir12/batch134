package inheritance;
class prt2{
	void m1() {
		System.out.println("m1");
	}
}

public class prt1 extends prt2{
void m2() {
	System.out.println("m2");
}
	public static void main(String[] args) {
		prt1 a=new prt1();
		a.m1();
		a.m2();

	}

}
