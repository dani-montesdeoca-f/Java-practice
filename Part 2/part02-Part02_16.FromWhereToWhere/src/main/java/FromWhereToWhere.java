
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int goal = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int start = Integer.valueOf(scanner.nextLine());
        
        
        for(int i = start; i <= goal; i++){
            System.out.println(i);
        }
    }
}
