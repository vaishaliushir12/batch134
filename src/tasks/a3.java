package tasks;

public class a3 {
	public static void main(String[] args) {
		int row=5;
		for(int i=row;i>=1;--i) {
		for (int space=1;space<=row-i;++space)	{
			System.out.print(" ");
			
		}
		for(int j=i;j<=2*i-1;++j) {
			System.out.print("* ");
			
		} 
		
			System.out.println();
		}


}
}