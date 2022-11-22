package mocktask;

import java.util.Scanner;

public class a10 {
	
	public static void main(String[] args) {
		//user provide input
		Scanner xyz=new Scanner(System.in);
		System.out.println("enter user input :");
		int a=xyz.nextInt();
		System.out.println("enter user input :");
		int b=xyz.nextInt();
		int Celsius  = ((a*9)/5)+32;
		System.out.println(Celsius);
		int c= ((b*9)/5)+32;
		System.out.println(c);

	}

}
