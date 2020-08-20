interface First {
	void one();
	default void two() {
		System.out.println("inside default  method \"two\" ");
	}
}

class Sub implements First {
	public void one() {
		System.out.println("inside one");
	}
}

public class Demo1 {
	public static void main(String args[]) {
		Sub s1 = new Sub();
		s1.one();
		s1.two();
	}
}