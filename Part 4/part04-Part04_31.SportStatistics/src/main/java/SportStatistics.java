
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Game> games = new ArrayList<>();
        int gamesCounter = 0;
        int winsCounter = 0;
        int lossesCounter = 0;
        
        
        // File reading and object creation
        System.out.println("File:");
        String fileName = scan.nextLine();
        try(Scanner fileScanner = new Scanner(Paths.get(fileName))){
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                // splitting each line into parts
                String[] parts = line.split(",");
                String home = parts[0];
                String visiting = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);
                
                // store object
                games.add(new Game(home, visiting, homePoints, visitingPoints));
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        for(Game game : games){
            // first check if wether the team is in the object
            if(team.equals(game.getHomeTeam()) || team.equals(game.getVisitingTeam())){
                gamesCounter++;
                // then if that team won
                if(game.won(team)){
                    winsCounter++;
                }else{
                    lossesCounter++;
                }
            }
        }
        
        System.out.println("Games: " + gamesCounter);
        System.out.println("Wins: " + winsCounter);
        System.out.println("Losses: " + lossesCounter);

    }

}
