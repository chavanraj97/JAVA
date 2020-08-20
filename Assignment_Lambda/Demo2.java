interface A {
	default void fun() {
		System.out.println("inside fun of A");
	}
}
interface B {
	default void fun() {
		System.out.println("inside fun of B");
	}
}
class C implements A, B {
	public void fun() {		// solution
		System.out.println("Inside fun of class C");
	}
}
public class Demo2 {
	public static void main(String args[]) {
		
	}
}