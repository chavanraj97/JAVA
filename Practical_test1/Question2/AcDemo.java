package lesson1;
abstract class Account {
	abstract void calcInt();
	
}

class Saving extends Account {
	
	void calcInt() {
		System.out.println("inside Saving");
	}
}
class Current extends Account {
	void calcInt() {
		System.out.println("inside Current");
	}
}
class RD extends Account {
	void calcInt() {
		System.out.println("inside RD");
	}
}

public class MyClass {
	
	static void perform(Account ref) {
		if(ref instanceof Saving) {
			ref.calcInt();
		}
		
	}
	public static void main(String[] args) {
		perform(new Saving());
		perform(new Current());
		perform(new RD());
	}

}
