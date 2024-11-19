public class ItemWithTotalPrice extends Item {
    public ItemWithTotalPrice(String name, double price, int quantity){
        super(name,price,quantity);
    }
    public double getTotalPrice() {
    return getPrice() * getQuantity();
    }
}
