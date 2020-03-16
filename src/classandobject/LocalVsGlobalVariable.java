package classandobject;

public class LocalVsGlobalVariable {
   // Global variable -- class variable
	String name = "Thom";
    int age = 25;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i = 10; //local variable
    System.out.println(i);
    LocalVsGlobalVariable obj = new LocalVsGlobalVariable();// we need to creat obj to accses global variable
	System.out.println(obj.name);	
		
		
		
	}
    public void sum(){
    	int i= 15;
    	int j=20;
    	int age = 25;
    	
    }
	
	
}
