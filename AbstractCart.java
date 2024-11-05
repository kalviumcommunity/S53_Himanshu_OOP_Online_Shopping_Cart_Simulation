
import java.util.ArrayList;

public abstract class AbstractCart {
    protected ArrayList<Item> cartItems;
    public static int TotalItemCount = 0;
    public static double total = 0.0;

    public AbstractCart() {
        this.cartItems = new ArrayList<>();
    }

    // Abstract method for adding an item
    public abstract void addItem(Item item);

    // Abstract method to calculate total cost
    public abstract double calculateTotal();

    // Method to get the total item count
    public static int getTotalItemCount() {
        return TotalItemCount;
    }

    // Method to display all items in the cart
    public void displayCart() {
        System.out.println("Shopping Cart:");
        for (Item item : cartItems) {
            item.displayItem();
        }
        System.out.println("Total Cost: " + calculateTotal());
    }

    // Method to display the total count of items
    public void displayTotalCount() {
        System.out.println("Total ItemCount: " + getTotalItemCount());
    }

    // Setter for cart items
    public void setCartItems(ArrayList<Item> cartItems) {
        this.cartItems = cartItems;
        TotalItemCount = cartItems.size();
    }
}
