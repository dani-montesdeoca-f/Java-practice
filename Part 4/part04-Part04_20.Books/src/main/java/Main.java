import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            }
            
            int pages = Integer.valueOf(scanner.nextLine());
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, year));
        }
        
        System.out.println("What information will be printed? ");
        String how = scanner.nextLine();
        for(Book book : books){
            if(how.equals("everything")){
                System.out.println(book.getTitle() + ", " + book.getPages() + " pages, " + book.getYear());
            }else if(how.equals("name")){
                System.out.println(book.getTitle());
            }
        }
    }
}
