package mocktask;

public class a12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="123456";
		int b=a.length();
		String rev="";
		for(int i=b-1;i>=0;i--) {
			rev=rev+a.charAt(i);
			
		}
System.out.println("Reverse of "+a+" is "+rev);

	}

}
