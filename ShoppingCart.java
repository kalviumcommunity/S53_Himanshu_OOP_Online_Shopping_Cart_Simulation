import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Item> cartItems;
    public static int TotalItemCount= 0;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public void addItem(Item item) {
        cartItems.add(item);
        TotalItemCount++;
    }
    public static int getTotalItemCount(){
        return TotalItemCount;
    }

    public static double total = 0.0;
    public double calculateTotal() {
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
    public void displayTotalCount(){
    System.out.println("Total ItemCount: " + getTotalItemCount());
    }
    public void setCartItems(ArrayList<Item> cartItems) {
        this.cartItems = cartItems;
        TotalItemCount = cartItems.size(); 
    }
}
