public class ShoppingCart extends AbstractCart {

    @Override
    public void addItem(Item item) {
        cartItems.add(item);
        TotalItemCount++;
    }

    @Override
    public double calculateTotal() {
        total = 0.0;
        for (Item item : cartItems) {
            total += item.getTotalPrice();
        }
        return total;
    }
}
