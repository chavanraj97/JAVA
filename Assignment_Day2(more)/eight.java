//Define a parent class with one function. Define child class with the function having same name as of parent class function, but having different argument.
//Create an instance of child class and call the functions. Make sure u have followed the concept of “function overloading “ in inheritance.

class base {
	void disp() {
		System.out.println("inside disp of base(no args)");
	}
}
class sub extends base {
	void disp(int k) {
		System.out.println("inside disp of sub(with args)");
		// overloading 
	}
}

public class eight {
	
	public static void main(String[] args) {
		sub s1 = new sub();
		s1.disp();
		s1.disp(10);
		
		
		
	}
}