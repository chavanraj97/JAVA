
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int empid;
	private String name,desig;
	private double salary;
	public Employee(int empid, String name, String desig, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.desig = desig;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", desig=" + desig + ", salary=" + salary + "]";
	}
	
	
}
public class first
{
	
	public static void main(String[] args)
	{
		Employee e1 = new Employee(1,"Raj","Developer",20000.0);
		Employee e2 = new Employee(2, "Nikhil","Tester",25000.50);
		Employee e3 = new Employee(3, "Hemal", "CEO", 100000);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		try(FileOutputStream fos = new FileOutputStream("new.txt")) {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
		} catch(IOException e) {
			e.printStackTrace();
		} 
		
		try(FileInputStream fis = new FileInputStream("new.txt")) {
			ObjectInputStream ois = new ObjectInputStream(fis);
			list = (ArrayList<Employee>)ois.readObject();
			System.out.println(list);
		} catch(IOException e) {
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
