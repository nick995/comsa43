package src;

public class Humidty extends StorUnits {
    private final double HUMIDITY = 5;
    private final double DISCOUNT_PERCENTAGE = 0.95;

    public Humidty() {

    }

    public Humidty(double width, double height) {
        super(width, height);
    }


    @Override
    public double getRentedPrice()
    {
        return Math.round(super.getBasePrice() + HUMIDITY * meterToFeet((super.getHeight() * super.getWidth())));

    }

    public double meterToFeet(double meters)
    {
        return meters * 3.2808399;
    }

    @Override
    public String toString() {
        String report = "";
        report += "HUMIDTY unit \n";
        report +=  super.toString();
        return report;
    }


}