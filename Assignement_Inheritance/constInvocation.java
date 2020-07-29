class base {
	base() {
		System.out.println("inside base");
	}
	base(int k ) {
		System.out.println("inside parameterized const");
	}
}
class sub1 extends base {
	sub1() {
		super(10);
		System.out.println("inside sub1");
	}
}
class sub2 extends sub1 {
	sub2() {
		super();
		System.out.println("inside sub2");
	}
}


public class constInvocation{
	public static void main(String[] args) {
		sub2 s2 = new sub2();
	}
}