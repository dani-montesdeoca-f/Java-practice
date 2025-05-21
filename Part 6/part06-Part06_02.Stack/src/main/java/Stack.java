/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linkz
 */
import java.util.ArrayList;

public class Stack {
    ArrayList<String> strings = new ArrayList<>();
    
    public boolean isEmpty(){
        return strings.isEmpty();
    }
    
    public void add(String value){
        strings.add(value);
    }
    
    public ArrayList<String> values(){
        return strings;
    }
    
    public String take(){
        int lastIndex = strings.size() - 1;
        String taken = strings.get(lastIndex);
        strings.remove(strings.get(lastIndex));
        return taken;
    }
}
