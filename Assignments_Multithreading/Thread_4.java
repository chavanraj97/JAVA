
public class Thread_4 implements Runnable{
	static Class sy;
	static void disp() {
	synchronized (sy)
	
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException ie)
			{
				
			}
			
		}
		
		}
	}
	public void run() {
		disp();
	}

	public static void main(String[] args) throws ClassNotFoundException {
		sy=Class.forName("Thread_4");
		// TODO Auto-generated method stub
		Thread_4 m1=new Thread_4();
		Thread_4 m2=new Thread_4();
		Thread th1=new Thread(m1);
		Thread th2=new Thread(m2);
		th1.start();
		th2.start();

	}

}

