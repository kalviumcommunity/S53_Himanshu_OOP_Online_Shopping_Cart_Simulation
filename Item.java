public class Item {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;

    public Item(String name, double price, int quantity) {
        this.itemName = name;
        this.itemPrice = price;
        this.itemQuantity = quantity;
    }

    public double getTotalPrice() {
        return itemPrice * itemQuantity;
    }

    public void displayItem() {
        System.out.println("Item: " + itemName + ", Price: " + itemPrice + ", Quantity: " + itemQuantity);
    }
}
