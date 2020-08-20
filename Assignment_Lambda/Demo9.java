interface MyInterface {
	void fun(char a, int b);
}
class SomeClass {
	void disp(char a , int b) {
		System.out.println(a +" "+ b);
	}
}
public class Demo9 {
	public static void main(String args[]) {
		SomeClass s1 = new SomeClass();
		MyInterface m1 = (a, b)-> {s1.disp(a,b);};
		m1.fun('x', 20);
		
		MyInterface m2 = s1::disp;
		m2.fun('y', 30);
		
	}
}