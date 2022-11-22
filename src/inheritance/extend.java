package inheritance;
class a1 {
void m1() {
	System.out.println("i am m1");
}
  }
class a2 extends a1{
	void m2() {
		System.out.println("i am m2");
	}
}
class a3 extends a2{
	void m3() {
		System.out.println("i am m3");
	}
	public static void main(String[] args) {
	a2 a=new a2();
	a.m2();
	a.m1();
     a3 b=new a3();
     b.m2();
     b.m3();
	}
}
