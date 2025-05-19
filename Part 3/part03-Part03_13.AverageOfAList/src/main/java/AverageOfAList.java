
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        // implement here a program, that first reads user input
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            // adding them on a list until user gives -1.
            if(input == -1){
                break;
            }
            numbers.add(input);
        }
        // Then it computes the average of the numbers on the list
        int sum = 0;
        for(int number : numbers){
            sum = sum + number;
        }
        // and prints it.
        System.out.println("Average: " + ((double)sum / numbers.size()));
        
    }
}
