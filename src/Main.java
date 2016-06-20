import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by EddyJ on 6/16/16.
 */
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Item item = new Item();
        Scanner scanner = new Scanner(System.in);
        int id = 0;
        int option = 0;

        do {
            inventory.showItems();

            switch (inventory.showMenu()) {

                case 1:
                    System.out.println("Please enter the name for your Item");
                    item.setName(scanner.nextLine());
                    System.out.println("How much will this item be?");
                    item.setPrice(scanner.nextDouble());
                    System.out.println("What is the quantity of this item?");
                    item.setQuantity(scanner.nextInt());
                    item.setId(id);
                    inventory.addItem();
                    break;
                case 2:
                    System.out.println("Choose which item(s) you would like to sell.");
                    inventory.findItem(scanner.nextLine());
                    System.out.println("What is the quantity you would like to sell?");
                    break;

                case 3:
                    System.out.println("Please enter the item's ID you would like to remove.");
                    break;

                case 4:
                    System.out.println("Choose which item you would like to update the quantity of.");
                    inventory.findItem(scanner.nextLine());
                    item.updateQuantity(scanner.nextInt());
                    break;
                case 5:
                    System.out.println("Which item would you like to udpate the price to?");
                    inventory.findItem(scanner.nextLine());
                    item.updatePrice(scanner.nextDouble());
                    break;
                case 6:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Command not found");
            }
        }while(inventory.showMenu() != 6);
            System.out.println("Thank you! System end.");
    }
}
