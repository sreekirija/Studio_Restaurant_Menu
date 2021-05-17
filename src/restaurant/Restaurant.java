package restaurant;

import java.util.Scanner;

import static restaurant.MenuItem.getListOfMenuItems;

public class Restaurant {

    public static void main(String[] args) {
        int index = -1;

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to add new item to the menu? Y/N");
        String itemAddition = input.nextLine();
        while (itemAddition.equals("Y")) {

            System.out.println("Enter new Menu item name to add:");
            String itemName = input.nextLine();

            if (Menu.compareMenuItem(itemName) < 0) {
                System.out.println("Enter new Menu item category(appetizer, main course, or dessert) to add:");
                String itemCategory = input.nextLine();

                System.out.println("Enter new Menu item description to add:");
                String itemDescription = input.nextLine();

                System.out.println("Enter new Menu item price to add:");
                String itemPriceString = input.nextLine();
                double itemPrice = Double.parseDouble(itemPriceString);
                Menu.addMenu(itemName, itemPrice, itemDescription, itemCategory, "YES");

            }
                else {
                System.out.println("This item is already present in the menu");
            }
                itemAddition = "N";
                System.out.println("Do you want to add new item to the menu? Y/N");
                itemAddition = input.nextLine();
            }
            System.out.println(getListOfMenuItems());


            //To delete menu item
            System.out.println("Do you want to delete an item from the menu? Y/N");
            String itemDelition = input.nextLine();

            while (itemDelition.equals("Y")) {
                System.out.println("Enter the item to be deleted: ");
                String itemNameToDelete = input.nextLine();
                index = Menu.compareMenuItem(itemNameToDelete);
                if (index >= 0) {
                    Menu.deleteMenu(index);
                } else {
                    System.out.println("This item is not in the menu");
                }

                itemDelition = "N";
                System.out.println("Do you want to delete an item from the menu? Y/N");
                itemDelition = input.nextLine();

            }

        }

    }





