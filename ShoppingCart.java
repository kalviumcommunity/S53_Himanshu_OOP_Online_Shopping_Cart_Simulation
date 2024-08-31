import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Item> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public void addItem(Item item) {
        cartItems.add(item);
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Item item : cartItems) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (Item item : cartItems) {
            item.displayItem();
        }
        System.out.println("Total Cost: " + calculateTotal());
    }
}
