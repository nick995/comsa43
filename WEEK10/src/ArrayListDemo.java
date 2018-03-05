import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparable;

public class ArrayListDemo {

    public static void main(String[] args) {
        // Create an ArrayList to hold Person objects
        // TODO:  add your code here
        ArrayList<Person> newPerson = new ArrayList<Person>();

        // Create people
        Person person1 = new Person("John", "Doe", 35);
        Person person2 = new Person("Susie", "Shaw", 29);
        Person person3 = new Person("Joe", "Jones", 15);
        Person person4 = new Person("Jane", "Doe", 35);
        Person person5 = new Person("Joe", "Schmoe", 99);

        // Add each of them to the ArrayList
        // TODO:  add your code here
        newPerson.add(person1);
        newPerson.add(person2);
        newPerson.add(person3);
        newPerson.add(person4);
        newPerson.add(person5);

        // Use the ArrayList toString to display the list
        System.out.println("\n----->  Initial  <-----");
        // TODO:  add your code here
        for(Person onePerson : newPerson){
            System.out.println(onePerson);
        }
        // Remove person5 from the list
        // TODO:  add your code here
        newPerson.remove(4);
        // Use a FOR Each loop to show the unsorted contents of the list
        System.out.println("\n----->  Unsorted  <-----");
        // TODO:  add your code here


        // Demonstrate other ArrayList methods
        // TODO:  add your code in place of literal "CODE"
        System.out.println("\n----->  Other Methods  <-----");
        System.out.println("size()                  : " + "CODE");
        System.out.println("indexOf(person4)        : " + "CODE");
        System.out.println("get(0)                  : " + "CODE");

        Collections.sort(newPerson);
        System.out.println("*********  After sorting  **********");
        // Use For Each loop to show the sortet contents of the list
        // TODO: add your code here


    }
}
