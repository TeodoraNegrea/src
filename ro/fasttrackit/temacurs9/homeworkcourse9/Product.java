package ro.fasttrackit.temacurs9.homeworkcourse9;

public class Product {
    protected String name;
    protected double price;
    protected String description;
    protected int quantity;

    public Product () {

    }

    public Product(String name,String description,int price, int quantity){
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;

    }
    public String getName(String name){
        return name;

    }
    public String  getDescription(String description){
        return description;
    }
    public double getPrice(double price){
        return price;
    }
    public int getQuantity(int quantity){
        return quantity;

    }
    public String toString(){
        return ("name : " + name + ", description : " + description + "price : " +  price + "quantity : " + quantity);
    }

}
