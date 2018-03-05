public class ESL extends Student {

    private Level level;
//price double

    public ESL(String id, String firstName, String lastName, Sex sex, String month, String day, String year, Level level) {
        super(id, firstName, lastName, sex, month, day, year);
        this.level = level;
    }
    //get level set level
    @Override
    public double getPrice() {
        return  25 ;
    }

    public Level getLevel(){
        return level;
    }

    public void setLevel(Level level){
        this.level = level;
    }

    @Override
    public String toString() {
        String report = super.toString();
        report += "Price      = " + getPrice();
        report += "Level      ="  + getLevel();
        return report;
    }


}
