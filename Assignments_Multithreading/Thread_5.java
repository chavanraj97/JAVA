
class Thread_11 implements Runnable{
public void run()

{
	for(int i=0;i<=50;i++)
	{
		System.out.println(i);
	}
}
}
class Thread_12 implements Runnable{
public void run()
{
	for(int j=50;j>=0;j--)
	{
		System.out.println(j);
	}
}
}

public class Thread_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		// TODO Auto-generated method stub
		Thread_11 t1=new Thread_11();
		Thread_12 t2=new Thread_12();
		Thread th1=new Thread(t1);
		Thread th2=new Thread(t2);
		th1.start();
		th2.start();
	}

}