//Define a class “Check” in which declare member variables using  different accessibility modifiers i.e.  <default>, private ,public and protected.   Define a function “disp”  which should be public.  Define a class “CheckDemo” in which you will write “main()” function. Create an instance of  the class “Check” and  show how many  variables can be accessed directly and how many indirectly.

class Check {
	private int a;
	int b;
	protected int c;
	public int d;
	public void disp() {
		System.out.println("inside disp");
	}
	public void setNum(int a) {
		this.a = a;
	}
	public int getNum() {
		return this.a;
	}
}

public class third {
	
	public static void main(String[] args) {
		Check c1 = new Check();
		//c1.a = 20;
		c1.setNum(30);
		
		c1.b = 10;
		c1.c = 20;
		c1.d = 30;
		
		
		
	}
}