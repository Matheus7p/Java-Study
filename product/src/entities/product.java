package entities;
public class product {

    public String name ;
    public double price ;
    public int quantity;

    public product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProduct(int quantity){
        this.quantity += quantity;
    }

    public void removeProduct(int quantity){
        this.quantity -= quantity;
    }


    public String toString(){
        return "Name: " + name + "\nPrice: " + price + "\nQuantity: " + quantity + "\nTotal Value in Stock: " + totalValueInStock();
    }
}
