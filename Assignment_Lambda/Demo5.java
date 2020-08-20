interface MyAlgo {
	static int sqr(int k) {
		return k*k;
	}
	static int add (int a, int b) {
		return a+b;
	}
	static int product (int a , int b) {
		return a*b;
	}
}
public class Demo5 {
	public static void main(String args[]) {
		System.out.println(MyAlgo.sqr(11));
		System.out.println(MyAlgo.add(20, 32));
		System.out.println(MyAlgo.product(14, 3));
	}
}