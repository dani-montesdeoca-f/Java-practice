import java.util.Scanner;
public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String input = scanner.nextLine();
            if(input.equals("stop")){
                break;
            }
            processCommand(input);
        }   
    }
    
    public void processCommand(String command){
        if(command.equals("add")){
            add();
        }else if(command.equals("list")){
            list();
        }else if(command.equals("remove")){
            remove();
        }else{
            System.out.println("Unknown command");
        }
    }
    
    public void add(){
        System.out.println("To add:");
        String word = scanner.nextLine();
        list.add(word);
    }
    
    public void list(){
        list.print();
    }
    
    public void remove(){
        System.out.println("Which one is removed?");
        int index = Integer.valueOf(scanner.nextLine());
        list.remove(index);
    }
}
