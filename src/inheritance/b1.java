package inheritance;
class b2{
	void m1() {
		System.out.println("m1");
	}
}
class b3 extends b2{
	void m3() {
		super.m1();
		System.out.println("m3");

}
	
}
public class b1 extends b2 {
	void m2() {
super.m1();
		System.out.println("m2");

}
	
	public static void main(String[] args) {
		
      b1 a=new b1();
      a.m2();
     b3 b=new b3();
     b.m3();
   
      
	}

}
