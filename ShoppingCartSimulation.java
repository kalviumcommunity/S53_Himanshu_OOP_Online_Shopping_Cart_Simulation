public class ShoppingCartSimulation {
    public static void main(String[] args) {
        // Item item1 = new Item("Laptop", 89999, 1);
        // Item item2 = new Item("Smartphone", 49999, 2);

        Item item1 = new Item();
        // item1.setName("Laptop");
        // item1.setPrice(89999);
        // item1.setQuantity(1);

        item1.getName();
        item1.getPrice();
        item1.getQuantity();

        Item item2 = new Item();
        // item2.setName("smartPhone");
        // item2.setPrice(49999);
        // item2.setQuantity(2);

        item2.getName();
        item2.getPrice();
        item2.getQuantity();

    
        ShoppingCart cart = new ShoppingCart();


        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayCart();
        // ShoppingCart.getTotalItemCount();
        cart.displayTotalCount();
    }
}
