
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String elementString = "";
        int counter = 0;
        for(String element : elements){
            elementString = elementString + "\n" + element;
            counter++;
        }
        if(elements.size() == 0){
            return "The collection " + this.name + " is empty.";
        }
        return "The collection " + this.name + " has " + counter + (elements.size() == 1 ? " element:" :" elements:") +
                elementString;
    }
    
    
}
