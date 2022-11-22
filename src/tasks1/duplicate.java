package tasks1;

import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		Scanner str=new Scanner(System.in);
		System.out.println("Enter String ");
		String ab=str.nextLine();
		String[] Char=ab.split("");
		int count;
		for (int i=0;i<Char.length;i++) {
			count =1;
			for(int j=i+1;j<Char.length;j++) {
				if(Char[i].equals(Char[j])) {
					count =count+1;
					Char[j]="0";
				}
			}
			if (Char[i]!="0") {
				System.out.println(Char[i]+" "+count);
			}
		}

	}

}
