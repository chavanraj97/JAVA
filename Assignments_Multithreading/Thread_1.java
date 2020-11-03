
public class Thread_1 extends Thread
{
	public void run() {
		for(char ch='a';ch<='j';ch++) {
			System.out.println(" "+ch);
		}
	}
	
	
			
		
	public static void main(String...args) {
		Thread_1 t1=new Thread_1();
		Thread_1 t2=new Thread_1();
		t1.start();
		t2.start();
	}
	}
	
