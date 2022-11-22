package tasks1;

public class constructoroverloading {
int a;String b;
	constructoroverloading(){
		System.out.println(" a");
	}
	
	constructoroverloading(int x){
      System.out.println("x");	
}
	constructoroverloading(String y){
      System.out.println("amol");	
}

		public static void main(String[] args) {
		constructoroverloading r=new constructoroverloading();
		constructoroverloading c=new constructoroverloading(10);
		constructoroverloading d=new constructoroverloading("vaishali");
		
		
		

	}

}
