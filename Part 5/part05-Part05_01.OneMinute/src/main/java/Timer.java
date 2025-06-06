/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linkz
 */
public class Timer {
    private ClockHand hundreths;
    private ClockHand seconds;
    
    public Timer(){
        this.hundreths = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public String toString(){
        return seconds + ":" + hundreths;
    }
    
    public void advance(){
        this.hundreths.advance();
        
        if(this.hundreths.value() == 0){
            this.seconds.advance();
        }
    }
    
}
