package tasks1;

public class pallidramno {

	public static void main(String[] args) {
		int no=121;
		int arm=no;
		int rev=0;
		while(arm!=0) {
			int rem=arm%10;
			rev=rev*10+rem;
			arm=arm/10;
		}
		if(no==rev) {
			System.out.println("this is pallindramno.");
		}
		else {
			System.out.println("this is not pallindramno.");

		}
	}

}
