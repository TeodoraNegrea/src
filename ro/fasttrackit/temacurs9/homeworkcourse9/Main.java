package ro.fasttrackit.temacurs9.homeworkcourse9;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("","", 45, 10);


        product.getName("");
        System.out.println(product);
        product.getDescription("");
        System.out.println(product);
        product.getPrice(3.5);
        System.out.println(product);
        product.getQuantity(55);
        System.out.println(product);

        Cosmetics cosmetics = new Cosmetics("blue", 5);
        cosmetics.getName("");
        System.out.println(cosmetics);
        cosmetics.getDescription("");
        System.out.println(cosmetics);
        cosmetics.getPrice(2.4);
        System.out.println(cosmetics);
        cosmetics.getQuantity(15);
        System.out.println(cosmetics);
        cosmetics.getColor("red");
        System.out.println(cosmetics);
        cosmetics.getWeight(8);

        Electronics electronics = new Electronics("","","","");
        electronics.getName("");
        System.out.println(electronics);
        electronics.getDescription("");
        System.out.println(electronics);
        electronics.getPrice(119.99);
        System.out.println(electronics);
        electronics.getQuantity(15);
        System.out.println(electronics);
        System.out.println(electronics.getLength(""));
        System.out.println(electronics.getWidth(""));
        System.out.println(electronics.getHeight(""));
        System.out.println(electronics.getWeight(""));

        Fridge fridge = new Fridge(18.5);
        fridge.getDescription("");
        System.out.println(fridge);
        fridge.getPrice(1999.99);
        System.out.println(fridge);
        fridge.getQuantity(20);
        System.out.println(fridge);
        System.out.println(fridge.getLength(""));
        System.out.println(fridge.getWidth(""));
        System.out.println(fridge.getHeight(""));
        System.out.println(fridge.getWeight(""));
        fridge.getTemperature(18.5);
        System.out.println(fridge);







    }
}
