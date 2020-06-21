class Course {
	void start() {
		System.out.println("inside start of course");
	}
	void end() {
		System.out.println("inside end of course");
	}
};
class MsCit extends Course{
	void start() {
		System.out.println("inside start of mscit");
	}
	void end() {
		System.out.println("inside end of mscit");
	}
};
class Basic extends Course{
	void start () {
		System.out.println("inside start of basic");
	}
	void end() {
		System.out.println("inside end of basic");
	}
	
};
class Dbda extends Course {
	void start() {
		System.out.println("inside start of Dbda");
	}
	void end() {
		System.out.println("inside end of Dbda");
	}
	void orientation() {
		System.out.println("Dbda Orientation");
	}
};
public class CourseDemo {
	static void perform(Course ref) {
		ref.start();
		if(ref instanceof Dbda) {
			Dbda ref1 = (Dbda) ref;
			ref1.orientation();
		}
		ref.end();
	}
	public static void main(String[] args) {
		perform(new Dbda());
	}
};