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

class sub2 extends base {
	sub2() {
		System.out.println("inside sub2");
	}
}


public class three {
	public static void main(String[] args) {
	base b1 = new sub1();
	base b2 = new sub2();
	}
}