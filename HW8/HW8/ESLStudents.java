import java.util.ArrayList;

public class ESLStudents  {

    ArrayList<ESL> esl = new ArrayList<ESL>();


    public void addStudent(ESL esls){
        boolean flag = true;
        if(flag == true){
            esl.add(esls);
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
                return Integer.parseInt("The person who you try to find is at " 
                + i +"and ESL level is " +  esl.get(i).getLevel());   
            }
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
