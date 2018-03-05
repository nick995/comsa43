package src;


import java.util.Date;

public abstract class StorUnits {

    private double width;
    private double height;
    private double price;
    private Date startDate;
    private Customer customer;
    private double rentedPrice;

    public StorUnits(){this(0.0, 0.0);}
    public StorUnits(double width, double height){
        if(height%2 != 0)
        {
            throw new IllegalArgumentException("Height must be always multiples of two");
        }

        if(width%4 != 0){
            throw new IllegalArgumentException("Width must be always multiples of four");
        }

        this.width = width;
        this.height = height;
        this.price = price;
        this.customer = customer;


    }

    public double getBasePrice()
    {
        return 75;
    }

    /**
     * Accessors for objects of getting width
     *
     * Get the double and reuturn it
     */
    public double getWidth() {
        return width;
    }
    /**
     * Accessors for objects of getting height
     *
     * Get the double and reuturn it
     */
    public double getHeight() {
        return height;
    }
    /**
     * Accessors for objects of getting customer
     *
     * Get the Customer and reuturn it
     */
    public Customer getCustomer() {
        return customer;
    }
    /**
     * Accessors for objects of getting UnitType
     *
     * Get the UnitType and reuturn it
     */

    /**
     * Accessors for objects of getting start Date
     *
     * Get the Date and reuturn it
     */
    public Date getStartDate() {
        return startDate;
    }
    /**
     * Accessors for objects of getting RentedPrice
     *
     * Get the double rentedPrice and reuturn it
     */
    public abstract double getRentedPrice();


    /**
     * Mutator for objects of setting Width
     *
     * Get the width and save it
     */
    public void setWidth(double width) {
        this.width = width;
    }
    /**
     * Mutator for objects of setting height
     *
     * Get the height and save it
     */
    public void setHeight(double height) {
        this.height = height;
    }
    /**
     * Mutator for objects of setting price
     *
     * Get the double price and save it
     */
    public void setPrice(double price) {
        this.price = price;
    }
    /**
     * Mutator for objects of setting Cutomer
     *
     * Get the Customer and save it
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Mutator for objects of setting RentedPrice
     *
     * Get the RentedPrice and save it
     */
    public void setRentedPrice(double rentedPrice) {
        this.rentedPrice = rentedPrice;
    }


    /**
     * Mutator for objects of setting rentUnit
     *
     * Get the Customer, price, Date and save it
     */
    public void rentUnit(double rentedPrice, Customer customer,Date startDate) {
        this.rentedPrice = rentedPrice;
        this.customer = customer;
        this.startDate = startDate;
        customer.setAcctBalanel(rentedPrice);
    }
    /**
     * Mutator for objects of setting unrentUnit
     */
    public void unrentUnit() {
        this.rentedPrice = 0;
        this.customer = null;
    }
    /*
        reporting by toString
     */
    @Override
    public String toString() {
        String report = "";
        report +=  "Width = " + width + "\n";
        report +=  "Height = " + height + "\n";
        report +=  "Start date = " + startDate + "\n";
        report +=  "Customer = " + customer + "\n";
        report +=  "rentedPrice = " + rentedPrice + "\n";
        return report;

    }
}