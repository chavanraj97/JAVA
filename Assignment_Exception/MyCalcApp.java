/*
define your exception class by name "MyArithException"
(MyArithException.java)
define class "Calculator"   (Calculator.java)
In this class define a function,which will accept an int and return double of it.
e.g int caldouble(int)
This function will check an int which is passed to it
It will throw exception if 0 is passed or negative passed
in case of 0 caller of this method should get error message
"Zero not allowed" 
in case of negative caller of this method should get error message
"negative not allowed"
In case of positive value it should simply return the double value.

Now define class "MyCalcApp" (MyCalcApp.java)
In this class you accept a number from user and pass that no. to
caldouble() method which is mentioned above.
 */
class MyArithException extends Exception {
	MyArithException(String s) {
		super(s);
	}
}
class Calculator {
	static int calDouble(int k) throws MyArithException {
		if(k < 0 ) {
			throw new MyArithException("Negative not allowed");
		}
		else if(k == 0) {
			throw new MyArithException("Zero not allowed");
		}
		return k*2;
	}
}

public class MyCalcApp
{
	public static void main(String args[])
	{
		
		try {
			int a = Calculator.calDouble(10);
			// int a = Calculator.calDouble(-2); // throws exception
			System.out.println(a);
		} 
		catch(MyArithException e) {
			e.printStackTrace();
		}
	}
}




















