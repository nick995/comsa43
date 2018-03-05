import java.util.ArrayList;
import java.util.Collections;

public class Main
{

    public static void main(String[] args) {
        Person collegePeople[] = new Person[5];
        //Creating new object followed examples.
        Student testStudent = new Student("123456789", "Bobby Brown", "bobby@comcast.net");
        Teacher testTeacher = new Teacher("SS9482", "Samantha Smith", "sammys@microsoft.com");
        Person testPerson = new Student("987654321", "Chrissy Caldwell", "cccald@gmail.com");

        //Adding course completion to student.
        testStudent.courseCompletion("History of Western Civilizations", 1.7);
        testStudent.courseCompletion("Algebra II", 3.9);
        testStudent.courseCompletion("Geometry I", 3.7);
        testStudent.courseCompletion("History of Western Civilizations", 3.0);
        //Adding course taught to teacher.
        testTeacher.addCourseTaught("Algebra II");
        testTeacher.addCourseTaught("Intro to Programming");
        testTeacher.addCourseTaught("Algebra II");
        //Checking if student already took a class or not.
        if (testPerson instanceof Student) {
            Student student1 = (Student)testPerson;
            student1.courseCompletion("Sociology I", 4.0);
        }

        // Adding to array
        collegePeople[0] = testStudent;
        collegePeople[1] = testTeacher;
        collegePeople[2] = testPerson;

        for (int personIndex = 0; personIndex < 3; personIndex++) {
            System.out.println(collegePeople[personIndex] + "\n");
        }
    }


}
