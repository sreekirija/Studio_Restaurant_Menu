package restaurant;


import java.util.ArrayList;
import java.util.Arrays;

public class MenuItem<listOfMenuItems> {
//Fields
    private String itemName;
    private double price;
    private String description;
    private String category;
    private String newlyAddedOrNot;
    //static ArrayList<MenuItem> listOfMenuItems = new ArrayList<>();
    static MenuItem a[] = new MenuItem[] {
            new MenuItem("kiri",3.0,"sadasd","asdasd","YES"),
            new MenuItem("sree",4.0,"sdfsdfdadzdd","dsdsdsdsdasds","YES"),
            new MenuItem("prisha",5.0,"sdfsdfdadzdd","dsdsdsdsdasds","YES")
    };

    static ArrayList<MenuItem> listOfMenuItems = new ArrayList<>(Arrays.asList(a));



//Constructor
    public MenuItem(String itemName, double price, String description, String category, String newlyAddedOrNot){
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newlyAddedOrNot = newlyAddedOrNot;
    }

//Getters and Setters
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getNewlyAddedOrNot() {
        return newlyAddedOrNot;
    }
    public void setNewlyAddedOrNot(String newlyAddedOrNot) {
        this.newlyAddedOrNot = newlyAddedOrNot;
    }

    public static ArrayList<MenuItem> getListOfMenuItems() {
        return listOfMenuItems;
    }
    public static void setListOfMenuItems(ArrayList<MenuItem> listOfMenuItems) {
        MenuItem.listOfMenuItems = listOfMenuItems;
    }

@Override
    public String toString() {
        return "Item Name: " + itemName + "| Price: " + price +"| Description: " + description +
                "| category: " + category + "| Newly Added: " + newlyAddedOrNot + "\n";
    }


}
