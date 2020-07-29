//Define a class “Check” in which declare member variables using  different accessibility modifiers i.e.  <default>, private ,public and protected.   Define a function “disp”  which should be public.  Define a class “CheckDemo” in which you will write “main()” function. Create an instance of  the class “Check” and  show how many  variables can be accessed directly and how many indirectly.

class base {
	base() {
		System.out.println("inside const of base");
	}
}
class sub extends base {
	sub() {
		System.out.println("insie const of sub");
	}
}

public class fourth {
	
	public static void main(String[] args) {
		base b1 = new sub();// base class contructor is invoked first
	}
}