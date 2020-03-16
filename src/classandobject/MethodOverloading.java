package classandobject;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
	}
	// we can not create a method inside a method 
	// duplicate methods --ie same method name with same number of arguments are not allowed 
	// we can overload main method by providing different argument
	
	
	//method overloading is when the method name is same with different arguments or input parameters within the same class
    public void sum(){// 0 input parameter
    System.out.println("zero input paramrter");	
    }
    public void sum(int i){// one parameter
    	System.out.println("one input paramrter");		
    }
    public void sum(int k,int i){
    	System.out.println("two input paramrter");		
    }
}
