
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if(this.squares > compared.squares){
            return true;
        }
        return false;
    }
    
    private int price(){
        return princePerSquare * squares;
    }
    public int priceDifference(Apartment compared){
        int thisPrice = this.price();
        int comparedPrice = compared.price();
        return Math.abs(thisPrice - comparedPrice);
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        if(this.price() > compared.price()){
            return true;
        }
        return false;
    }

}
