//concrete command 2
public class Steak implements Order{
    public SteakChef chef;

    public Steak(){
        this.chef = new SteakChef();
    }

    @Override
    public void excute() {
        this.chef.makeSteak();
    }

    @Override
    public String toString() {
        return "Steak";
    }
}