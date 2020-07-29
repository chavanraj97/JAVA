//Define a parent and a child class . Now explain function overriding with Example.
class base {
	void disp() {
		System.out.println("inside disp of base");
		// this method is overridden method  
	}
}
class sub extends base {
	void disp() {
		System.out.println("inside disp of sub");
		// this is the overriding method
	}
}

public class seventh {
	
	public static void main(String[] args) {
		base b1 = new sub();
		b1.disp();
		// when we call this function 'disp()'
		// compiler checks whether it is present in the base class
		// and since it is virtual compiler checks at runtime 
		// the content present inside the reference b1 
		// in this example the object is of sub class present inside the base class reference
		// hence sub class disp() is called
		
	}
}