package tasks1;


public class a1 {

	public static void main(String[] args) {
	String a="vaishali";
	int lenght=a.length();
	String rev="";
	for(int i=lenght-1;i>=0;i--) {
		rev=rev+a.charAt(i);	
	}
	System.out.println("reverse of " +a+ " is " +rev);
	}

}
