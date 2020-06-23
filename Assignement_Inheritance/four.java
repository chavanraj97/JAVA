class Top1 {
	void disp() {
		System.out.println("inside top1");
	}
}
class Bottom1 extends Top1 {
	void disp() {
		System.out.println("inside bottom1");
	}
}
class Bottom2 extends Top1 {
	void disp() {
		System.out.println("inside bottom2");
	}
}
class Bottom3 extends Top1 {
	void disp() {
		System.out.println("inside bottom3");
	}
}


public class four {
	static void perform(Top1 ref) {
		ref.disp();
	}
	public static void main(String[] args) {
		perform(new Bottom1());
		perform(new Bottom2());
		perform(new Bottom3());
	}
}