package src;


public class Standard extends StorUnits{

    private final double DISCOUNT_PERCENTAGE = 0.95;

    public Standard(double width, double height) {
        super(width, height);
    }

    @Override
    public double getRentedPrice() {
        return getBasePrice();
    }



    @Override
    public String toString() {
        String report = "";
        report += "STANDARD unit \n";
        report +=  super.toString();
        return report;

    }

}
