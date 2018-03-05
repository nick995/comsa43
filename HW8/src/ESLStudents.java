import java.util.ArrayList;

public class ESLStudents  {

    ArrayList<Student> esl = new ArrayList<Student>();


    public void addStudent(Student student){
        boolean flag = true;
        if(flag == true){
            esl.add(student);
        }
    }


    public void removeStudent(String id){
        int index = isFound(id);
        if(index >=0){
            esl.remove(index);
        }
        else{
            System.out.println("There is no student to remove");
        }
    }

    public int isFound(String id) {
        for(int i = 0 ; i<esl.size(); i++){
            if(id.equals(esl.get(i).getId())){
                return Integer.parseInt(i+ "Person's ESL level is " + esl.get(i).getId());            }
        }
        return -1;
    }

    public int studentCount(){
        return esl.size();
    }

    @Override
    public String toString() {
        String report = super.toString();
        report += "Student count    = " + studentCount() + "\n";
        return report;
    }


}
