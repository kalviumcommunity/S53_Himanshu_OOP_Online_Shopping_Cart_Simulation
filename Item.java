public class Item {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;



    public Item(){
        this.itemName="MamyPoko Paints";
        this.itemPrice=200;
        this.itemQuantity=5;
    }

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
    public String getName(){
        return itemName;
    }
    public double getPrice(){
        return itemPrice; 
    }
    public int getQuantity(){
        return itemQuantity; 
        
    }

    public Item(String name, double price, int quantity) {
        this.itemName = name;
        this.itemPrice = price;
        this.itemQuantity = quantity;
    }    
}
