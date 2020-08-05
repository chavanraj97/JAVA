/*
define a class called as "Item" (Item.java)
with members
String itemid;
String name;
int cost;

parameterized constructor which will accept above details at the time
of creating object.
	member function
void display()
which will display all the details of product
create instances of this class and call the method display.
 */
class Item {
	String itemid;
	String name;
	int cost;
	
	Item(String itemid, String name, int cost) {
		this.itemid = itemid;
		this.name = name;
		this.cost = cost;
	}
	
	void display() {
		System.out.println("The product with itemId " + this.itemid + " name "+ this.name + " is Rs " + this.cost);
	}
}

public class ItemDemo
{
	public static void main(String args[])
	{
		Item i = new Item("e1" , "Soap", 30);
		i.display();
	}
}




















