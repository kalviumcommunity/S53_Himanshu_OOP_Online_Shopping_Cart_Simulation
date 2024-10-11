public class ShoppingCartSimulation {
    public static void main(String[] args) {
        Item item1 = new Item("Laptop", 89999, 1);
        Item item2 = new Item("Smartphone", 49999, 2);

    
        ShoppingCart cart = new ShoppingCart();


        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayCart();
        ShoppingCart.TotalItemCount = 0;
        cart.displayTotalCount();
        
    }
}
