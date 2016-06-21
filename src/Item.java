import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by EddyJ on 6/16/16.
 */
public class Item {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private Scanner scanner = new Scanner(System.in);

    public Item() {
        this.id = id++;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}

