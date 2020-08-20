interface Alpha {
	void perform();
}
class MyClass implements Alpha {
	static Alpha getAlpha() {
		return new MyClass();
	}
	public void perform() {
		System.out.println("inside perform");
	}
}
public class Demo6 {
	public static void main(String args[]) {
		Alpha a = MyClass.getAlpha();
		a.perform();
	}
}