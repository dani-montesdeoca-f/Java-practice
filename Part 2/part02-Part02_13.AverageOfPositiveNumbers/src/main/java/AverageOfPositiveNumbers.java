
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            }else if(number < 0){
                continue;
            }else{
                sum = sum + number;
                counter++;
            }
        }
        
        if(sum == 0 && counter == 0){
            System.out.println("Cannot calculate average");
        } else{
            double result = (float) sum / counter;
            System.out.println(result);
        }

    }
}
