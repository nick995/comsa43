public class Department {

    private int totalStud110,totalStud142,totalStud143,totalStudents,totalGr110,totalGr142,totalGr143;

    private double totalBalance;

    private String toString;

    final static int group = 28;

    public Department(){}
    public Department(int totalStud110, int totalStud142, int totalStud143, double totalBalance){
        if(totalStud110 <0 || totalStud142<0 || totalStud143<0 ){
            throw new IllegalArgumentException("you must choose one of classes");
        }
        this.totalStud110 = totalStud110;
        this.totalStud142 = totalStud142;
        this.totalStud143 = totalStud143;
        this.totalBalance = totalBalance;
    }

    public int getTotalStud110(){
        return totalStud110;
    }
    public int getTotalStud142(){
        return totalStud142;
    }
    public int getTotalStud143(){return totalStud143;}
    public int getTotalStudents(){
        totalStudents = totalStud110 + totalStud142 + totalStud143;

        return totalStudents;
    }

    public double getTotalBalance() {

        totalBalance = (double) totalStudents*550;

        return totalBalance;
    }

    public int getTotalGr110() {
        if(totalStud110%group == 0){
            return totalStud110/group;
        }else{
            return totalStud110/ group + 1;
        }
    }

    public int getTotalGr142() {
        if(totalStud142%group == 0){
            return totalStud142/group;
        }else{
            return totalStud142/group + 1;
        }
    }
    public int getTotalGr143() {
        if(totalStud143%group == 0){
            return totalStud143/ group;
        }else{
            return totalStud143/ group + 1;
        }
    }

    public String toString() {
        String report = "";
        report += "Our total csc110 students are " + totalStud110 + "\t" ;
        report += "Our total csc142 students are " + totalStud142 + "\t"  ;
        report += "Our total csc143 students are " + totalStud143  + "\n" ;
        report += "Our total students are " + this.getTotalStudents() + "\t" ;
        report += "Our total balance is " + getTotalBalance() + " dollars \t\n" ;
        report += "total group of 110 is " + getTotalGr110() + "\t";
        report += "total group of 142 is " + getTotalGr142() + "\t" ;
        report += "total group of 143 is " + getTotalGr143() + "\t";

        return report;
    }

    public void addStudent(Student student){

        if(student.getCSC110()){
            this.totalStud110++;
        }

        if(student.getCSC142()){
            this.totalStud142++;
        }

        if(student.getCSC143()){
            this.totalStud143++;
        }

    }
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
