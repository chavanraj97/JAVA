interface Base {
	int product (int a , int b);
}
public class Demo7 {
	public static void main(String args[]) {
		Base ref = (int a, int b) -> {return a*b;};
		System.out.println(ref.product(10, 30));
	}
}