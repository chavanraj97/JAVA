
public class Demo8 {
	public static void main(String args[]) {
		Thread t1 = new Thread (
			()->{for(int i = 0; i < 10; i++) {
				System.out.println("Welcome "+ (i+1) + " " +Thread.currentThread().getName() );
			}}, "TName"
		);
		t1.start();
	}
}