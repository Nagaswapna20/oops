abstract class Payment1
{
    abstract void pay(double amount);
}
class Upi extends Payment1
{
    public void pay(double amount)
    {
        System.out.println("Paidfor"+amount+"usingUPI");
    }
}
class Cash extends Payment1
{
    public void pay(double amount)
    {
        System.out.println("Paidfor"+amount+"usingCash");
    }
}
class Payment
{
    public static void main(String args[])
    {
        Upi u1=new Upi();
        Cash c1=new Cash();
        u1.pay(100);
        c1.pay(500);
    }
}
//abstract
abstract class Foodorder
{
	String customerName;
	int quantity;
	double price;
	Foodorder(String name,int quantity,double price)
	{
		this.customerName=name;
		this.quantity=quantity;
		this.price=price;
	}
	abstract void orderFood();
	void generateBill()
	{
		double total=quantity*price;
		double d=total*0.07;
		total-=d;
		System.out.println("CustomerName:"+customerName);
		System.out.println("Quantity:"+quantity);
		System.out.println("PricePerItem:"+price);
		System.out.println("TotalDis:"+d);
		System.out.println("TotalBill:"+total);
	}
}
class Pizzaorder extends Foodorder
{
	String pizzaType;
	Pizzaorder(String name,int quantity,double price,String pizzaType)
	{
		super(name,quantity,price);
		this.pizzaType=pizzaType;
	}
	void orderFood()
	{
		System.out.println("WelcometoZomato");
		System.out.println("PizzaType:"+pizzaType);
		System.out.println("Pizzaorderedsuccessfully");
	}
}
class Main
{
	public static void main(String args[])
	{
		Pizzaorder p=new Pizzaorder("Mounika",2,199,"chezee");
		p.orderFood();
		p.generateBill();
	}
}