
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        
        System.out.print("Last number? ");
        int last = Integer.valueOf(scanner.nextLine());
        for(int i = 1; i <= last; i++){
            sum = sum + i;
        }
        
        System.out.print("The sum is " + sum);

    }
}
