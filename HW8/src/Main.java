public class Main {

    public static void main(String[] args){
        Sex sex=Sex.FEMALE;
        Level level = Level.ESL1A;
        Student testESLStudent = new ESL("985871450", "Min-Gyu", "Jung", sex,"03", "25", "1995", level;
//        Student collegeStudent = new College("3213214", "Second", "People",
//                "MALE", "01", "01", "1995") ;


        ESLStudents esls = new ESLStudents();
        esls.addStudent(testESLStudent);
        System.out.println(esls);


        CollegeStudents colleges = new CollegeStudents();
//        colleges.addStudent(collegeStudent);



        System.out.println("The student who you want to find is at " + esls.isFound("985871450"));

//        System.out.println(testESLStudent);



    }

}
