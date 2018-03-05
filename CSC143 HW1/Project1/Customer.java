
public class Customer {
    private String custName;
    private String custNumber;
    private double acctBalanel;

    public Customer (String custName, String custNumber, double acctBalanel){
        if(!custName.matches("[a-zA-Z]{2,12}"+"\\s"+"[a-zA-Z]{2,12}")){
            throw new IllegalArgumentException("Name formatting is not correct," +
                    "please put again. EX: Sean Monaco");
        }

        if(!String.valueOf(custNumber).matches("[0-9]{3}"+"\\-"+"[0-9]{3}"+"\\-"
                +"[0-9]{4}")){
            throw new IllegalArgumentException("Number formatting is not correct" +
                    "please put again. EX: xxx-xxx-xxxx");
        }

        if(acctBalanel<0){
            throw new IllegalArgumentException("Account balance cannot be less than 0");
        }

        this.custName = custName;
        this.custNumber = custNumber;
        this.acctBalanel = acctBalanel;

    }

    public String getCustName(){
        return custName;
    }

    public String getCustNumber() {
        return custNumber;
    }

    public double getAcctBalanel() {
        return acctBalanel;
    }


    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCustNumber(String custNumber) {
        this.custNumber = custNumber;
    }

    public void setAcctBalanel(double acctBalanel) {
        this.acctBalanel = acctBalanel;
    }

    @Override
    public String toString() {
        String report = " ";
        report += "Customer name is              " + getCustName();
        report += "Customer number is            " + getCustNumber();
        report += "Customer Account Balance is   " + getAcctBalanel();
        return super.toString();
    }

    public double debitAmount(double amount) {
        if(acctBalanel < amount)
            throw new IllegalArgumentException("Insufficient balance");
        acctBalanel -= amount;
        return acctBalanel;
    }

    public double creditAmount(double amount) {
        acctBalanel += amount;
        return acctBalanel;
    }
}