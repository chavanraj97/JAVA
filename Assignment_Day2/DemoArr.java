public class DemoArr {
	private int i = 9;
	
	public void set(int i) {
		this.i = i;
	}
	public void get1() {
		System.out.println(this.i);
	}
	
	
	
	public static void main(String[] args) {
		DemoArr[] m1 = new DemoArr[4];
		for(int i = 0; i < m1.length; i++) {
			m1[i] = new DemoArr();
		}
		int j = 10;
		for(int i = 0; i < m1.length; i++) {
			m1[i].set(j++);
		}
		for(int i = 0; i < m1.length; i++) {
			m1[i].get1();
		}
		
		
	}
}