import java.util.ArrayList;

public class CollegeStudents {

    ArrayList<Student> collegeStudent = new ArrayList<Student>();


    public void addStudent(Student student){
        boolean flag = true;
        if(flag == true){
            collegeStudent.add(student);
        }
    }


    public void removeStudent(String id){
        int index = isFound(id);
        if(index >=0){
            collegeStudent.remove(index);
        }
        else{
            System.out.println("There is no student to remove");
        }
    }

    public int isFound(String id) {
        for(int i = 0 ; i<collegeStudent.size(); i++){
            if(id.equals(collegeStudent.get(i).getId())){
                return i;
            }
        }
        return -1;
    }

    public int studentCount(){
        return collegeStudent.size();
    }

    @Override
    public String toString() {
        String report = super.toString();
        report += "Student count    = " + studentCount() + "\n";
        return report;
    }
}
