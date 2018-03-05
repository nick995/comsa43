package src;

/*
    Ji-won Jung/ Project 1/ 2018/01/09
 */

public class Location {

    private String locationName;
    private double payment;
    private StorUnits [][] storUnits = new StorUnits[12][];
    private Customer [] customers = new Customer[100];

    /**
     * Constroctor for initionalizing
     */
    public Location(String locationName){

        if(!locationName.matches("[A-Z]{2}+[0-9]{2}+[A-Z]{1}+[a-z]{1,15}")){

            throw new IllegalArgumentException("Wrong location name, Please put again" +
                    "ex: WA23Issaqua ");
        }
        for(int row = 0; row < 12; row ++){
            for(int column = 0; column < 20; column ++){
                if(row<7 && column < 10){
                    storUnits[row][column] = new Standard(0,0);
                }
                else if(row<10 && column<8){
                    storUnits[row][column] = new Humidty(0,0);

                }
                else if (row<12 && column<6){
                    storUnits[row][column] = new Tempertaure(0,0);
                }
            }
        }




        this.locationName = locationName;
    }
    /**
     * Accessors for objects of Location Name
     *
     * Get the Location and return a String
     */
    public String getLocationName() {
        return locationName;
    }
    /**
     * Accessors for objects of getStorUnits
     *
     * Get the int row and column and return a StorUnits [][]
     */
    public StorUnits getStorUnits(int row, int colum) {
        return storUnits[row][colum];
    }
    /**
     * Accessors for objects of Customer Count
     *
     * Get the Customer and return a int
     */
    public int getCustCount(){

        int custCount = 0;
        for(custCount =0; custCount< customers.length; custCount++){
            if(customers[custCount] == null){
                return custCount;
            }
        }
        return custCount;
    }
    /**
     * Accessors for objects of adding custormer
     *
     * Get the Customer and save it
     */
    public void addCustomer(Customer customer){
        for(int i = 0; i< customers.length; i++){
            if(customers[i] ==null) // We can add customer here
            {
                customers[i] = customer;
                return;
            }
        }
        throw new IllegalArgumentException("No empty slot for more customers.");
    }
    /**
     * Accessors for objects of getting Customer Index
     *
     * Get the int and reuturn index
     */
    public Customer getCustomerAt(int index){return customers[index];}
    /**
     * Accessors for objects of adding storunits
     *
     * Get the stor units and reuturn StorUnits
     */
    public void addStorUnit(StorUnits unit, int x, int y){storUnits[x][y] = unit;}
    /**
     * Accessors for objects of getting Customer's Units number
     *
     * Get the customer and reuturn StorUnit's object
     */
    public StorUnits [] getCustomersUnits(Customer customer){
        // Need to find out how many stoarge units customer has
        int amount = 0;
        for(int row = 0; row <12; row++){
            for(int colum = 0; colum<20; colum++){
                if(storUnits[row][colum].getCustomer() == customer){
                    amount++;
                }
            }
        }
        StorUnits[] unitsRentedByThisCustomer = new StorUnits[amount];
        int currentSlot = 0;

        for(int row = 0; row <12; row++){
            for(int colum = 0; colum<20; colum++){
                if(storUnits[row][colum].getCustomer() == customer){
                    unitsRentedByThisCustomer[currentSlot] = storUnits[row][colum];
                    currentSlot++;
                }
            }
        }
        return unitsRentedByThisCustomer;
    }


//    /**
//     * Accessors for objects of getting empty storage
//     *
//     * Get the UnitType and reuturn it
//     */
//    public StorUnits [] getEmptyStorageUnits(UnitType type){
//        // Need to find out how many stoarge units customer has
//        int amount = 0;
//        for(int row = 0; row <12; row++){
//            for(int colum = 0; colum<20; colum++){
//                if(storUnits[row][colum].getCustomer() == null){
//                    amount++;
//                }
//            }
//        }
//        StorUnits[] emptyUnits = new StorUnits[amount];
//        return emptyUnits;
//    }
    /**
     * Mutator for objects of setting Location name
     *
     * Get the String and save it
     */
    public void setLocationName(String locationName) {this.locationName = locationName;}
    /**
     * Mutator for objects of setting Stor Units
     *
     * Get the StorUnits and save it
     */

    public void setStorUnits(StorUnits[][] storUnits) {this.storUnits = storUnits;}
    /**@override
     * Mutator for objects of setting Stor Units
     *
     * Get the StorUnits and save it
     */

    public void setStorUnits(StorUnits storUnits, int row, int column) {
        this.storUnits[row][column] = storUnits;
    }
    public void Charge(){
        for(int currentCustomerIndex = 0; customers[currentCustomerIndex] != null; currentCustomerIndex++ ){
            Customer currentCustomer = customers[currentCustomerIndex];

            StorUnits [] customerUnits = getCustomersUnits(currentCustomer);

            int totalCost = 0;

            for(int i=0; i< customerUnits.length; i++){
                totalCost += customerUnits[i].getRentedPrice();
            }
            if(customerUnits.length>1){
                currentCustomer.setAcctBalanel(currentCustomer.getAcctBalanel()-totalCost*0.95);

            }else{
            currentCustomer.setAcctBalanel(currentCustomer.getAcctBalanel()-totalCost);
            }
        }
    }

    public String toString(){
        String report = "";
        report += "Location Name is      " + getLocationName() + "\n";
        report += "Customer's count is   " + getCustCount() + "\n";
        return report;
    }


}
