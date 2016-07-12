package reminder.listvie.com.listviewreminder;

/**
 * Created by jbt on 7/12/2016.
 */
public class Fruit {

    public Fruit(String color, double price, String name) {
        this.color = color;
        this.price = price;
        this.name = name;
    }

    String color;
    double price;
    String name;


    @Override
    public String toString() {
        return  name;
    }
}
