public class StorUnits {

    private double width;
    private double height;
    private double price;
    private int year;
    private int month;
    private int day;
    private UnitType type;
    private Customer customer;

    public StorUnits(){this(0.0, 0.0,0.0,0,0,0,
            UnitType.STANDARD, null);}

    public StorUnits(double width, double height, double price,
                     int year, int month, int date, UnitType type,
                     Customer customer){

        this.width = width;
        this.height = height;
        this.price = price;
        this.year = year;
        this.month = month;
        this.day = day;
        this.type = type;
        this.customer = customer;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public Customer getCustomer() {
        return customer;
    }

    public UnitType getType() {
        return type;
    }

    public String getStartDate(){
        return Integer.toString( getYear()) + "-" + Integer.toString(getMonth()) +
                "-" + Integer.toString(getDay());
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setType(UnitType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
