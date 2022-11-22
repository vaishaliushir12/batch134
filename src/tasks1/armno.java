package tasks1;

public class armno {

	public static void main(String[] args) {
		for(int i=100;i<=1000;i++) {
			int arm=i;
			int rev=0;
			while(arm!=0) {
				int value=arm%10;
				rev=rev+value*value*value;
				arm=arm/10;
		}
			if(i==rev) {
				System.out.println(i+"");}
			}

	}

}
