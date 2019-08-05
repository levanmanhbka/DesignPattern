public class Main{
    
    public static void main(String[] args) {
        System.out.println("Command Pattern demo");
        Waiter waiter = new Waiter();
        Customer customer = new Customer(waiter);
        customer.request("pizza");
        customer.request("steak");
    }
}