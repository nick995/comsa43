/* Student
 * Project 4 Student
 *
 * Min-Gyu Jung 10/22/2017
 *
 *
 */


public class Student {

    //private data
    private String firstName, lastName, idNumber, toString;
    private boolean csc110, csc142, csc143;
    private Double balance;
    final static double tuition = 500;
    final static double credit = 5;

    public Student(String firstName, String lastName, String idNumber){
        if(firstName == "" || lastName == "" || idNumber ==""){
            throw new IllegalArgumentException("you must put firstname, lastname, and ID number");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public Student(String firstName, String lastName, String idNumber, Boolean csc110, Boolean csc142, Boolean csc143){

        if(firstName == "" || lastName == "" || idNumber ==""){
            throw new IllegalArgumentException("you must put firstname, lastname, and ID number");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.csc110 = csc110;
        this.csc142 = csc142;
        this.csc143 = csc143;
    }

    /*
    Accessors which is get a data and return it.
     */
    //@parm = None, return = firstname
    public String getFirstName() {return firstName;}
    //@parm = None, return = lastName
    public String getLastName() {return lastName;}
    //@parm = None, return = idNumber
    public String getIdNumber() {return idNumber;}
    //@parm = None, return = csc110
    public boolean getCSC110() {return csc110;}
    //@parm = None, return = csc142
    public boolean getCSC142(){return csc142;}
    //@parm = None, return = csc143
    public boolean getCSC143(){return csc143;}
    //@parm = None, return = balance
    public double getBalance(){

        if(csc110==true || csc142==true || csc143==true){
            balance += 550;
        }
        return balance;
    }
    //@parm = None, return = string
    public String toString(){
        String report = "";
        report += "first name is " + firstName + "\t" ;
        report += "Last name is " + lastName + "\t";
        if(csc110==true){
            report += "class is csc110" ;
        }else if(csc142 == true){
            report += "class is csc142";
        }else if(csc143 == true){
            report += "class is csc143";
        }else{
            throw new IllegalArgumentException("you must choose one class");
        }


        return report;

    }

    public void setCsc110(boolean csc110) {this.csc110 = csc110;}

    public void setCsc142(boolean csc142){this.csc142= csc142;}

    public void setCsc143(boolean csc143) {this.csc143 = csc143;}

    public static void main(String[] args){
        Student newStud=new Student("Name","LastName","123456789",false,true,false);
        //Check the Student class
        System.out.println(newStud.toString());
        //Check the class department
        Department newDep=new Department();
        for(int i=0;i<98;i++){
            newDep.addStudent(new Student("Name"+i,"LastName"+i,"3333"+i,true,false,false));
        }
        for(int i=0;i<51;i++){
            newDep.addStudent(new Student("Name"+i,"LastName"+i,"4444"+i,false,true,false));
        }
        for(int i=0;i<27;i++){
            newDep.addStudent(new Student("Name"+i,"LastName"+i,"5555"+i,false,false,true));
        }
        System.out.println(newDep.toString());
    }



}
