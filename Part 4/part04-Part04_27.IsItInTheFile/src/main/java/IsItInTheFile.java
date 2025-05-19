

import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        
        System.out.println("Search for:");
        String search = scanner.nextLine();
        
        boolean found = false;
        
        try(Scanner fileScanner = new Scanner(Paths.get(fileName))){
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                if(line.equals(search)){
                    System.out.println("Found!");
                    found = true;
                }
            }
            
        }catch (Exception e){
            System.out.println("Reading the file " + fileName + " failed");
            return;
        }
        
        if(!found){
            System.out.println("Not found.");
        }
    }
}
