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