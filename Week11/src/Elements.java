import java.util.Scanner;
import java.util.ArrayList;
public class Elements {

    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner input = new Scanner(System.in);
        int arraySize = input.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i=0; i<arraySize; i++){
            numbers.add((int)Math.random()*10+1);
        }
        System.out.println(numbers);

        while (true) {
            Scanner console = new Scanner(System.in);
            System.out.println("Welcome to input Validation. Please select the menu\n");
            System.out.println(" 1. Add  \n 2. validate SSN \n 3. instructions \n 0. quit");
            Scanner vaild = new Scanner(System.in);

            if (!console.hasNextInt()) {
                System.out.println("put again. You have to put only 1,2,3 and 0 for quit");
                continue;
            }
            int menuNum = console.nextInt();
            switch (menuNum) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
            if(menuNum == 0){
                System.out.println("See you later!");
                break;
            }
        }

    }


}
