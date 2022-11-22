package a1_method;

public class a5 {
	//no argument
	public  void m1(){
		
    	System.out.println(10);
    	
	}
	//argument method
	public  void m2(String c,int b){
		 
		System.out.println("hi i am vaishali");
		
	}
   
	public void m3(int a,int b) {
		int c;
		int d;
		int e;
		c=a+b;
		d=a-b;
		e=a*b;
    	System.out.println(c);
    	System.out.println(d);
    	System.out.println(e);



	}
	public static void main(String[] args) {
		
		a5 xyz=new a5();
		xyz.m1();
		xyz.m2("yash",50);
		xyz.m3(50,90);
		xyz.m3(36,28);
	}

}
