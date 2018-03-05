package src;

public class Tempertaure extends StorUnits {
    private final double TEMPERAUTRE_PRICE = 1;
    private final double DISCOUNT_PERCENTAGE = 0.95;

    public Tempertaure() {

    }

    public Tempertaure(double width, double height) {
        super(width, height);
    }


    @Override
    public double getRentedPrice()
    {

        return Math.round(super.getBasePrice() + TEMPERAUTRE_PRICE * meterToFeet((super.getHeight() * super.getWidth())));

    }

    public double meterToFeet(double meters)
    {
        return meters * 3.2808399;
    }

    @Override
    public String toString() {
        String report = "";
        report += "TEMPERATURE unit \n";
        report +=  super.toString();
        return report;
    }


}