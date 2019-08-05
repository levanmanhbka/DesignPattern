//concrete command 1

public class Pizza implements Order{
    public PizzaChef chef;

    public Pizza(){
        this.chef = new PizzaChef();
    }

    @Override
    public void excute() {
        this.chef.makePizza();    
    }

    @Override
    public String toString() {
        return "Pizza";
    }
}