import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;
import com.sun.tools.javac.jvm.Items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by EddyJ on 6/16/16.
 */
public class Inventory {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Item> items = new ArrayList<>();

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
        for (Item item : items) {
            System.out.println(item.getId() + " " + item.getName() + " " + item.getQuantity());
        }
    }

    public int showMenu() {
        int option = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Options: " + System.lineSeparator() + "[1] Create a new Item." + System.lineSeparator() +
                "[2] Choose item(s) to be sold." + System.lineSeparator() + "[3} Remove an Item" + System.lineSeparator() +
                "[4] Update an Item's quantity." + System.lineSeparator() + "[5] Update price of an Item." + System.lineSeparator() +
                "[6] Quit the program.");
        option = Integer.parseInt(scanner.nextLine());
        return option;
    }

    public void addItem() {
        ArrayList<Item> item = new ArrayList<>();
        item.add(new Item());
    }

    public Item findItem(String name) {
        Item rval = null;

        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
            }
            else{
                System.out.println("Sorry, your item was not found.");
            }
        }
        return rval;
    }

    public String findName(String name){
        for(Item item : this.items){
            if (item.getName().equalsIgnoreCase(name))
                name = item.getName();
        }
        return name;
    }

    public Item findId(int id){
        Item item = null;
        for(Item foundItem : this.items){
            item.getId();
            item = foundItem;
        }
        return item;
    }

    public void updatePrice(){
        String itemName = scanner.nextLine();
        if(itemName.equalsIgnoreCase(findName(itemName))){
            System.out.println("What is the new price you would like to update it to?");
            double newPrice = scanner.nextDouble();
            Item item = findItem(itemName);
            item.setPrice(newPrice);
        }
    }

    public void updateQuantity(){
        String itemName = scanner.nextLine();
        if(itemName.equalsIgnoreCase(findName(itemName))){
            System.out.println("What is the new quantity of the item?");
            int newQuantity = scanner.nextInt();
            Item item = findItem(itemName);
            item.setQuantity(newQuantity);
        }
    }

    public void removeItem(){
        int idRemove = Integer.parseInt(scanner.nextLine());
        items.remove(findId(idRemove));
    }

    public void sellItem(){
        int sellAmount = 0;
        Item sellingItem;
        String sellingName;

        System.out.println("Please name which item you would like to sell?");
        sellingName = scanner.nextLine();
        sellingItem = findItem(sellingName);
        System.out.println("What is the quantity you would like to sell?");
        sellAmount = Integer.parseInt(scanner.nextLine());
        if(sellingItem.getQuantity() >= sellAmount){
            sellItem();
        }
        else{
            System.out.println("Error, you do not have that amount to sell.");
        }
    }



}