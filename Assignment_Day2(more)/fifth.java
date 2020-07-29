//	Show the example of multi-level inheritance with constructor invocation.
class base {
	base() {
		System.out.println("inside const of base");
	}
}
class sub1 extends base {
	sub1() {
		System.out.println("inside const of sub1");
	}
}
class sub2 extends sub1 {
	sub2() {
		System.out.println("inside const of sub2");
	}
}

public class fifth {
	
	public static void main(String[] args) {
		base b1 = new sub2();
		System.out.println("-------------");
		base b2 = new sub1();
		System.out.println("-------------");
		
	}
}