class base {
	base() {
		System.out.println("inside base");
	}
}

class sub1 extends base {
	sub1() {
		System.out.println("inside sub1");
	}
}
class sub2 extends sub1 {
	sub2() {
		System.out.println("inside sub2");
	}
}


public class constInvocation{
	public static void main(String[] args) {
		sub2 s2 = new sub2();
	}
}