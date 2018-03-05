public class Teacher extends Person {

    private String[] coursesTaught = new String[50];
    private int nextCourseIndex;

    // Constructor @parm String id and String email.

    public Teacher(String id, String name, String email) {
        super(id, name, email);
        nextCourseIndex = 0;
    }

    // other methods, for checking if id is correct format or not.
    // using Regular expression (regex) to check.
    public boolean isValidId(String id) {
        return id.matches("[A-Z0-9]{6}");
    }

    public void addCourseTaught(String courseName){
        int course = 0;
        while ( course < coursesTaught.length &&
                course < nextCourseIndex &&
                !coursesTaught[course].equals(course)) {
            course++;
        }
        if (coursesTaught[course] == null || !coursesTaught[course].equals(course)) {
            // Add the course
            coursesTaught[course] = courseName;
            nextCourseIndex++;
        }

    }

    public String toString() {
        String report = super.toString(); // need to overriding
        report += "Has taught " + nextCourseIndex + " course(s) which is :\n";
        for (int i = 0; i < nextCourseIndex; i++) {
            report += "   - " + coursesTaught[i] + "\n";
        }
        return report;
    }
}
