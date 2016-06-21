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
            switch (inventory.showMenu()) {

                case 1:
                    System.out.println("Please enter the name for your Item");
                    item.setName(scanner.nextLine());
                    System.out.println("How much will this item be?");
                    item.setPrice(scanner.nextDouble());
                    System.out.println("What is the quantity of this item?");
                    item.setQuantity(scanner.nextInt());
                    id++;
                    item.setId(id);
                    inventory.addItem(item);
                    break;
                case 2:
                    inventory.showItems();
                    inventory.sellItem();
                    break;

                case 3:
                    inventory.showItems();
                    System.out.println("Please enter the item's ID you would like to remove.");
                    inventory.removeItem();
                    break;

                case 4:
                    inventory.showItems();
                    System.out.println("Choose which item you would like to update the quantity of.");
                    inventory.updateQuantity();
                    break;
                case 5:
                    inventory.showItems();
                    System.out.println("Which item would you like to udpate the price to?");
                    inventory.updatePrice();
                    break;
                case 6:
                    option = 6;
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Command not found");
            }
        }while(option != 6);
            System.out.println("System end.");
    }
}
