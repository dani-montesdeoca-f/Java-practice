
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            // BAD DESIGN, EVERY PART SHOULD A A SINGLE TASK
            if(number < 0){
                System.out.println("Unsuitable number");
                continue;
            }else if(number > 0){
                System.out.println(number * number);
            }else if(number == 0){
                break;
            }
        }

    }
}
