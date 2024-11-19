public class DisplayAddedItem extends ItemWithTotalPrice {
    public DisplayAddedItem(String itemName, double itemPrice, int itemQuantity){
        super(itemName,itemPrice,itemQuantity);
    }

    public void displayItem() {
        System.out.println("Item: " + getName() + ", Price: " + getPrice() + ", Quantity: " + getQuantity());
    }
}
