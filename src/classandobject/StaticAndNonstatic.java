package classandobject;

public class StaticAndNonstatic {
    String name = "Thom";// non static global variable
    static int age =25; // Static variable
	public static void main(String[] args) {
		// how to call static methods and vars 
		// 1. direct calling :
		sum();
		//2 calling by class name 
		StaticAndNonstatic.sum();
		//To call non static methods and var we need to creat obj
		//can we call static method using object reference ? yes but we can acssese it directly 
		StaticAndNonstatic obj = new StaticAndNonstatic();
		obj.sum();
	}
  public void sendMail(){ // non static method
	  System.out.println("Send mail methode");
  }
  public static void sum(){// static method
	System.out.println("Sum methode");  
  }
	
}
