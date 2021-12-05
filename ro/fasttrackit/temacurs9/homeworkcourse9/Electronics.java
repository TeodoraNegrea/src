package ro.fasttrackit.temacurs9.homeworkcourse9;

public class Electronics extends Product {
    protected String length;
    protected String width;
    protected String height;
    protected String weight;

    public Electronics(String length, String width, String height, String weight) {
        super("microwave", "Is used to heat food  ", 250, 2);

        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public String getLength(String length) {
        return length;
    }

    public String getWidth(String width) {
        return width;
    }

    public String getHeight(String height) {
        return height;
    }

    public String getWeight(String weight) {
        return weight;
    }

    public String toString() {
        return ("name : " + name + ", description : " + description + "price : " + price + "quantity : " + quantity + "length : " + length + ", width : " + width + ", height : " + height + ", weight : " + weight);
    }
}
