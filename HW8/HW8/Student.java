public abstract class Student implements Person{

    private String id;
    private String firstName;
    private String lastName;
    private Sex sex;
    private String month;
    private String day;
    private String year;
    private int credit;
    //constructor

    public Student(String id, String firstName, String lastName,
                   Sex sex, String month, String day, String year){
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setDay(day);
        setMonth(month);
        setYear(year);
        setSex(sex);
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public int getCredit(){
        return credit;
    }

    public abstract double getPrice();

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setCredit(int credit){
        this.credit = credit;
    }

    public String toString() {
        String report = "";
        report += "ID         = " + id + "\n";
        report += "First Name = " + firstName + "\n";
        report += "Last Name  = " + lastName + "\n";
        report += "Sex        = " + sex + "\n" ;
        report += "Day        = " + day + "\n";
        report += "Month      = " + month + "\n";
        report += "Year       = " + year + "\n";
        report += "Credit     = " + credit + "\n";
        return report;

    }
}
