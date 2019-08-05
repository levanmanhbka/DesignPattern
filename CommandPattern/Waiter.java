//Invoker
public class Waiter{
    public void takeOder(Order order){
        System.out.println("Waiter take oder: " + order.toString());
        order.excute();
    }
}