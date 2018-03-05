public class Student extends Person {

    private String[] coursesTaken = new String[30];
    private double[] courseGrades = new double[30];
    private int nextCourseIndex;

    // Constructor part must superlized first.
    public Student(String id, String name, String email) {
        super(id, name, email);
        nextCourseIndex = 0;

    }

    /**
     * isValidID
     * @param  String id
     * @return True or false.
     */
    // For checking if id is correct format or not.
    public boolean isValidId(String id) {
        return id.matches("[0-9]{9}");

    }
    /**
     *  courseCompletion
     * @param  String courseName, double courseGrade
     * @return None
     */
    // putting course name and their grade to array.
    public void courseCompletion(String courseName, double courseGrade) {
        coursesTaken[nextCourseIndex] = courseName;
        courseGrades[nextCourseIndex] = courseGrade;
        nextCourseIndex++;
    }

    /**
     *  double getAverageGrade
     * @param None
     * @return totalGrade/nextCourseIndex which is average gpa.
     */
    // summing all grade from courseGrade array and calculate average gpa.
    public double getAverageGrade() {
        double totalGrade = 0.0;
        for (int i = 0; i < nextCourseIndex; i++) {

            totalGrade += courseGrades[i];

        }
        return totalGrade/nextCourseIndex;
    }

    // toString method for reporting average gpa, and what student has completed.

    public String toString() {
         String report = super.toString(); //need to overriding from Person class.
         report += "Current grade average is " + getAverageGrade() + "\n";
         report += "Student has completed " + nextCourseIndex + " course(s) so far:" + "\n";
         for (int courseIndex = 0; courseIndex < nextCourseIndex; courseIndex++) {
             report += "   - " + coursesTaken[courseIndex];
             report += " (" + courseGrades[courseIndex] + ")";
             report += "\n";
         }
         return report;
    }
}
