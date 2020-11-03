
public class Thread_2 implements Runnable
{
	public void run() {
		for(char ch='a';ch<='j';ch++) {
			System.out.println(" "+ch);
		}
	}
	
	
			
		
	public static void main(String...args) {
		Thread_1 t1=new Thread_1();
		Thread_1 t2=new Thread_1();
		t1.run();
		t2.run();
	}
	}
	
