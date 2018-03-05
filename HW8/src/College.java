public class College extends Student{
    public College(String id, String firstName, String lastName, Sex sex, String month, String day, String year) {
        super(id, firstName, lastName, sex, month, day, year);
    }

//typetime String constant  overcredit 110.0;

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
