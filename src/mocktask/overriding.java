package mocktask;
class a6{
	void m1() {
		System.out.println("from, overriding");
	}
}
public class overriding extends a6 {
	void m1() {
		System.out.println("from overriding");
	}

	public static void main(String[] args) {
		overriding a=new overriding();
		a.m1();

	}

}
