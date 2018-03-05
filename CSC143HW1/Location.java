import java.lang.reflect.Array;

public class Location {

    private String locationName;
    private int custCount;
    private double payment;
    private StorUnits [][] storUnits = new StorUnits[12][20];
    private Customer [] customers = new Customer[100];

    public Location(String locationName){

        if(!locationName.matches("[A-Z]{2}+[0-9]]{2}+[A-Z]{1}+[a-z]")){

            throw new IllegalArgumentException("Wrong location name, Please put again" +
                    "ex: WA23Issaqua ");
        }

    }

    public String getLocationName() {
        return locationName;
    }

    public StorUnits getStorUnits(int row, int colum) {
        return storUnits[row][colum];
    }

    public int getCustCount(){

        int custCount = 0;
        for(custCount =0; custCount< customers.length; custCount++){
            if(customers[custCount] == null){
                return custCount;
            }
        }
        return custCount;
    }

    public void addCustomer(String name, int phoneNumber, double accountBalance){
        for(int i = 0; i< customers.length; i++){
            if(customers[i] ==null) // We can add customer here
            {
                customers[i] = new Customer(name, phoneNumber, accountBalance);
                return;
            }
        }
        throw new IllegalArgumentException("No empty slot for more customers.");
    }

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
                unitsRentedByThisCustomer[currentSlot] = storUnits[row][colum];
                currentSlot++;
            }
        }
        return unitsRentedByThisCustomer;
    }

    public StorUnits [] getEmptyStorageUnits(UnitType type){
        // Need to find out how many stoarge units customer has
        int amount = 0;
        for(int row = 0; row <12; row++){
            for(int colum = 0; colum<20; colum++){
                if(storUnits[row][colum].getCustomer() == null){
                    amount++;
                }
            }
        }
        StorUnits[] emptyUnits = new StorUnits[amount];
        int currentSlot = 0;

        for(int row = 0; row <12; row++){
            for(int colum = 0; colum<20; colum++){
                if(storUnits[row][colum].getCustomer() == null && storUnits[row][colum].getCustomer() == null)
                emptyUnits[currentSlot] = storUnits[row][colum];
                currentSlot++;
            }
        }
        return emptyUnits;
    }

    public void Charge(){
        for(int currentCustomerIndex = 0; customers[currentCustomerIndex] != null; currentCustomerIndex++ ){
            Customer currentCustomer = customers[currentCustomerIndex];

            StorUnits [] customerUnits = getCustomersUnits(currentCustomer);

            int totalCost = 0;
            for(int i=0; i< customerUnits.length; i++){
                totalCost += customerUnits[i].getPrice();
            }
            currentCustomer.setAcctBalanel(currentCustomer.getAcctBalanel()-totalCost);
        }
    }






    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String toString(){
        String report = "";
        report += "Location Name is      " + getLocationName() + "\n";
        report += "Customer's count is   " + getCustCount() + "\n";



        return report;
    }


}
