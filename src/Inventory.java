import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
import com.sun.tools.javac.jvm.Items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by EddyJ on 6/16/16.
 */
public class Inventory {
    private int id;
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Item> items = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void setInventoryList(ArrayList<Item> inventoryList) {
        this.items = inventoryList;
    }

    public void showItems() {
        System.out.println("Hello, this is your inventory.");
        for (Item name : this.items) {
            System.out.println(name + System.lineSeparator());
        }
    }

    public int showMenu() {
        int option = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Options: " + System.lineSeparator() + "[1] Create a new Item." + System.lineSeparator() +
                "[2] Choose item(s) to be sold." + System.lineSeparator() + "[3} Remove an Item" + System.lineSeparator() +
                "[4] Update an Item's quantity." + System.lineSeparator() + "[5] Update price of an Item." + System.lineSeparator() +
                "[6] Quit the program.");
        option = scanner.nextInt();
        return option;
    }

    public void addItem() {
        ArrayList<Item> item = new ArrayList<>();
        item.add(new Item());
    }

    public ArrayList<Item> findItem(String name) {
        ArrayList<Item> rval = null;

        for (Item item : this.items) {
            if (item.getName().equalsIgnoreCase(name)) {
            }
            else{
                System.out.println("Sorry, your item was not found.");
            }
        }
        return rval;
    }



}