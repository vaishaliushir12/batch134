package tasks1;

public class palindramno {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
            int n=i;
            int rem;
			int rev=0;
			while(n!=0) {
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			
					
			}
			if(i==rev) {
				System.out.println(i+"");
			}
	
		}
	}
}
