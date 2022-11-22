package tasks1;

public class armstrong {

	public static void main(String[] args) {
		int no=371;
		int arm=no;
		int rev=0;
		while(arm!=0) {
			int value=arm%10;
			rev=rev+value*value*value;
			arm=arm/10;
		}
		if(no==rev) {
			System.out.println("this no.is armstrong");
		}
		else {
			System.out.println("this no. is not armstrong");
		}

	}

}
