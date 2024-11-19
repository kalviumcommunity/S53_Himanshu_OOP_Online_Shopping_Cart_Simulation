public class ShoppingCart extends AbstractCart {

    @Override
    public void addItem(DisplayAddedItem item) {
        cartItems.add(item);
        TotalItemCount++;
    }

    @Override
    public double calculateTotal() {
        total = 0.0;
        for (DisplayAddedItem item : cartItems) {
            total += item.getTotalPrice();
        }
        return total;
    }
}
