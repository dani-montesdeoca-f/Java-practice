/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linkz
 */
public class Game {
    private String homeTeam;
    private String visitingTeam;
    private int homePoints;
    private int visitingPoints;
    
    public Game(String homeTeam, String visitingTeam, int homePoints, int visitingPoints){
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homePoints = homePoints;
        this.visitingPoints = visitingPoints;
    }
    
    public String getHomeTeam(){
        return this.homeTeam;
    }
    
    public String getVisitingTeam(){
        return this.visitingTeam;
    }
    
    public boolean won(String team){
        if(team.equals(this.homeTeam)){
            if(this.homePoints > this.visitingPoints){
                return true;
            }
        }
        else if(team.equals(this.visitingTeam)){
            if(this.visitingPoints > this.homePoints){
                return true;
            }
        }
        return false;
    }
}
