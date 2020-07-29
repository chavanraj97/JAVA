//Define 2 classes “First” and “Second” with member variables , member functions and constructors of  your choice. Now define a class “Two” in which define main function . In main function create various instances of First and Second  and call their individual member functions.

class First {
	private int num;
	First() {
		System.out.println("inside def const of first");
	}
	
	First(int num) {
		this.num = num;
		System.out.println("inside param const of first");
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
class Second extends First {
	private int num;
	Second() {
		System.out.println("inside def const of second");
	}
	Second(int num) {
		this.num = num;
		System.out.println("inside param const of second");
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}

public class first {
	
	public static void main(String[] args) {
		First f1 = new First();
		First f2 = new First(10);
		Second s1 = new Second();
		Second s2 = new Second(20);
		
		f1.setNum(15);
		s1.setNum(25);
		
		System.out.println(f2.getNum());
		System.out.println(s2.getNum());
	}
}