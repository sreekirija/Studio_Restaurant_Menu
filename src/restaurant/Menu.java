package restaurant;

import java.time.LocalDate;
import java.util.HashMap;

import static restaurant.MenuItem.getListOfMenuItems;


public class Menu {

    public Menu(){

    }

    public static int compareMenuItem(String name){
        int numberOfItemsInMenu = getListOfMenuItems().size();
        int result = -1;
        for (int i = 0; i < numberOfItemsInMenu; i++) {
            int index2 = MenuItem.getListOfMenuItems().get(i).getItemName().indexOf(name);
            if(index2 >= 0){
                result  = i;
            }
        }
        return result;
    }

    public static void addMenu(String itemName, double price, String description, String category, String newlyAddedOrNot){
        MenuItem menuItem = new MenuItem(itemName,price,description,category,"YES");
        boolean add;
        add = menuItem.listOfMenuItems.add(menuItem);
        System.out.println(new StringBuilder().append("New Menu Item added and its details are as follows:\n").append(menuItem).toString());
        System.out.println("Menu lastly updated on " + java.time.LocalDate.now());
    }

    public static void deleteMenu(int indexToDelete){
        getListOfMenuItems().remove(indexToDelete);
        System.out.println("The updated Menu after removing the item is as follows:\n"+getListOfMenuItems());
    }



}
