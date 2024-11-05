public class Item {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;

    // public Item(String name, double price, int quantity) {
    //     this.itemName = name;
    //     this.itemPrice = price;
    //     this.itemQuantity = quantity;
    // }

    // Setter

    public void setName(String name){
        this.itemName = name;
    }
    public void setPrice(double price){
        this.itemPrice = price;
    }
    public void setQuantity(int quantity){
        this.itemQuantity = quantity;
    }
    

    // getter
    public void getName(){
        System.out.println("Name: " + itemName);
    }
    public void getPrice(){
        System.out.println("Price: " + itemPrice); 
    }
    public void getQuantity(){
        System.out.println("Quantity: " + itemQuantity); 
        
    }


    public double getTotalPrice() {
        return itemPrice * itemQuantity;
    }

    public void displayItem() {
        System.out.println("Item: " + itemName + ", Price: " + itemPrice + ", Quantity: " + itemQuantity);
    }

}
