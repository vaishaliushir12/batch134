package tasks;

public class b1 {

	public static void main(String[] args) {
	int column=5;
	for(int i=1;i<=column;++i) {
	for (int space=1;space<=column-i;++space)	{
		System.out.print(" ");
		
	}
	for(int j=i;j<=2*i-1;++j) {
		System.out.print("* ");
		
	} 
	
		System.out.println();
	}

}
}
