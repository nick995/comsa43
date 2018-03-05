public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age;
    }
    public boolean equals(Object other){
        boolean flag = true;
        if (other == null){
            flag = false;
        }else if (!(other instanceof Person)){
            flag = false;
        } else if(other == this){
            flag = true;
        }return  flag;
    }
    // add a compareTo() method for sorting this ArrayList by lastName, firstName, and age


    // add an equals method

}