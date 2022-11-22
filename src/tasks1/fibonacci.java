package tasks1;

public class fibonacci {

	public static void main(String[] args) {
	int a=1;int b=1;
	System.out.print(a+" "+b);
	for(int i=1;i<=20;i++) {
		int c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
		
	}
	}

}
