//Client

public class Customer{
    private Waiter waiter;

    public Customer(Waiter waiter){
        this.waiter = waiter;
    }

    public void request(String request){
        System.out.println("Customer request: " + request);
        Order order = null;
        if(request.toLowerCase().equals("pizza")){
            order = new Pizza();
        }
        else{
            order = new Steak();
        }
        waiter.takeOder(order);
    }
}