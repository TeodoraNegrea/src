package ro.fasttrackit.temacurs9.homeworkcourse9;

public class Cosmetics extends Product {
    protected String color;
    protected int weight;

    public Cosmetics(String color, int weight) {
        super("lipstick", "Is  used on the lips ", 30, 10);

        this.color = color;
        this.weight = weight;


    }

    public String getColor(String color) {
        return color;
    }

    public int getWeight(int weight) {
        return weight;
    }

    public String toString() {
        return ("name : " + name + ", description : " + description + "price : " + price + "quantity : " + quantity + "color : " + color + "; weight : " + weight);
    }
}
