class base1 {
	base1(int k) {
		System.out.println("inside param const of base1");
	}
}
class sub1 extends base1 {
	sub1() {
		super(10);
		System.out.println("inside def const of sub1");
	}
	sub1(int k) {
		super(20);
		System.out.println("inside one param const of sub1");
	}
	sub1(int k, int l) {
		super(30);
		System.out.println("inside two param const of sub1");
	}
}

public class eight {
	public static void main(String[] args) {
		base1 b1 = new sub1();
		base1 b2 = new sub1(10);
		base1 b3 = new sub1(30);
		System.out.println("in main");
	}
}