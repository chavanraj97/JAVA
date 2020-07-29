//Create a class with static and non-static member variables. Define static and non-static member functions. Create instance of this class and call both static and non-static member functions.

class MyClass {
	private static int cnt;
	private int num;
	MyClass() {
		cnt++;
	}
	public static int getCnt() {
		return cnt;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}

public class second {
	
	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		m1.setNum(200);
		System.out.println(m1.getNum());
		MyClass m2 = new MyClass();
		System.out.println(MyClass.getCnt());
		
	}
}