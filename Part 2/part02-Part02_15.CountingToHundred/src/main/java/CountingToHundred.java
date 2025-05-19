
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = 100;
        int userStart = Integer.valueOf(scanner.nextLine());
        for(int i = userStart; i <= goal; i++){
            System.out.println(i);
        }

    }
}
