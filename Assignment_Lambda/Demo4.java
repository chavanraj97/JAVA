class Base {
	public void disp() {
		System.out.println("inside disp of Base class");
	}
}
interface MyInterface {
	default void disp() {
		System.out.println("inside disp of MyInterface");
	}
}

class Sub2 extends Base implements MyInterface {
	
}
public class Demo4 {
	public static void main(String args[]) {
		Sub2 s = new Sub2 ();
		s.disp();
	}
}