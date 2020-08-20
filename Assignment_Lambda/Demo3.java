interface Second {
	void abs();
	default void def() {
		System.out.println("inside def of Second");
	}
}
class Sub1 implements Second {
	public void abs() {
		System.out.println("inside abs of Sub1");
	}
	public void def() {
		
		Second.super.def();
		System.out.println("inside def of Sub1");
		
	}
}
public class Demo3 {
	public static void main(String args[]) {
		Sub1 s = new Sub1();
		s.abs();
		s.def();
	}
}