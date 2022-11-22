package abstract1;
abstract class a2{
	abstract void m1();
	 public void m2() {
		System.out.println("hello");
	}
}
public class a1 extends a2 {
	public void m1() {
		System.out.println(10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        a1 a=new a1();
        a.m1();
        a.m2();
	}

}
