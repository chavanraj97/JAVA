interface A {
	void disp1();
}
interface B extends A {
	void disp2();
}
class C implements B {
	
	@Override
	public void disp2() {
		// TODO Auto-generated method stub
		System.out.println("in disp2");
	}

	@Override
	public void disp1() {
		// TODO Auto-generated method stub
		System.out.println("in disp1");
		
	}
	
	void disp3() {
		System.out.println("in disp3");
	}
}

public class sixth {
	public static void main(String[] args) {
		C c1 = new C();
		c1.disp1();
		c1.disp2();
		c1.disp3();
	}
	
}