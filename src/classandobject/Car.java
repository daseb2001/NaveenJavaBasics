package classandobject;

public class Car {
  // class vars:
	int mod;
	int wheel;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Car a = new Car();
    Car b = new Car();
    Car  c= new Car();
    a.mod = 2013;
    a.wheel=4;
    b.mod = 2013;
    b.wheel= 5;
    c.mod = 2017;
    c.wheel= 3;
    System.out.println("before assingning the reference");
    System.out.println(a.mod);
    System.out.println(a.wheel);
    System.out.println(b.mod);
    System.out.println(b.wheel);
    System.out.println(c.mod);
    System.out.println(c.wheel);
    
    System.out.println("After assingning the reference");
    a=b;
    b=c;
    c=a;
    a.mod=10;
    System.out.println(a.mod);
	}

}
