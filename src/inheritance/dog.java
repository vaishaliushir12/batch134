package inheritance;
class animal{
	void m1() {
		System.out.println("m1");
	}
}

public class dog extends animal {
	void m2() {
		this.m1();
		System.out.println("m2");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       dog dog=new dog();
       dog.m2();
	}

}
