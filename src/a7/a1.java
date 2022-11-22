package a7;

public class a1 {
		String name;
		int marks;
	 a1(String name,int marks) {
		 this.name=name;
		 this.marks=marks;
		 System.out.println( name+" "+marks);
	}

	public static void main(String[] args) {
		a1 a=new a1("vaishali",99);
		a1 b=new a1("vaibhav",96);
		a1 c=new a1("shivani",100);
		a1 d=new a1("vaibhav",90);
	}

}
