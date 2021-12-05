package ro.fasttrackit.temacurs9.homeworkcourse9;

public class Fridge extends Electronics {
    protected double temperature;

    public Fridge(double temperature) {
        super("30", "50", "30", "13");
        this.temperature = temperature;
    }

    public double getTemperature(double temperature) {
        return temperature;
    }

    public String toString() {
        return ("length : " + length + ", width : " + width + ", height : " + height + ", weight : " + weight + " temperature :  " + temperature);
    }
}
