class Parent1 {
	void disp() {
		System.out.println("inside parent1 class ");
	}
}

interface Parent2 {
	void disp2();
}

class Child extends Parent1 implements Parent2 {
	public void disp2() {
		System.out.println("inside disp2 of child class");
	}
	void n() {
		System.out.println("inside n");
	}
}

public class Seven {
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.disp2();
		c1.disp();
	}
}