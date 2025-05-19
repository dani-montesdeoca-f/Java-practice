
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longest = "";
        int sum = 0;
        int count = 0;
        while(true){
            String text = scanner.nextLine();
            if(text.equals("")){
                break;
            }
            String[] parts = text.split(",");
            if (parts[0].length() > longest.length()){
                longest = parts[0];
            }
            int year = Integer.valueOf(parts[1]);
            sum += year;
            count ++;
        }
        double averageYear = (double)sum / count;
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + averageYear);

    }
}
