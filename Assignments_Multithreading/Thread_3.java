public class Thread_3 extends Thread {
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException ee)
			{
				ee.printStackTrace();
			}
			System.out.println("Exec"+i);
		}
	}

	public static void main(String[] args) {
		
		Thread_3 s1 = new Thread_3();
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s1);
		Thread t3 = new Thread(s1);
		
		t1.start();
		t2.start();
		t3.start();
	}

}