package restaurant;

public class MenuItem {

    private double price;
    private String description;
    private String category;
    private String newlyAddedOrNot;

    public MenuItem(double price, String description, String category, String newlyAddedOrNot){

        this.price = price;
        this.description = description;
        this.category = category;
        this.newlyAddedOrNot = newlyAddedOrNot;

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
}
