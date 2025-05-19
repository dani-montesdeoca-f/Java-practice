
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition){
        Money newMoney = new Money(addition.euros + this.euros, addition.cents + this.cents);
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        if(this.euros < compared.euros){
            return true;
        }else if(this.euros == compared.euros){
            if(this.cents < compared.cents){
                return true;
            }
        }
        return false;
    }
    
    public Money minus(Money decreaser){
        if(this.lessThan(decreaser)){
            Money newMoney = new Money(0, 0);
            return newMoney;
        }
        int newEuros = this.euros - decreaser.euros;
        int newCents = this.cents - decreaser.cents;
        
        if(newCents < decreaser.cents){
            newEuros--; // borrow one euro
            newCents+=100;
        }
        
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }
    /* MODEL SOLUTION
    public Money plus(Money addition) {
        int euros = this.euros + addition.euros();
        int cents = this.cents + addition.cents();
 
        if (cents > 99) {
            cents = cents - 100;
            euros = euros + 1;
        }
 
        return new Money(euros, cents);
    }
 
    public boolean lessThan(Money compared) {
        return (100 * this.euros + this.cents) < (100 * compared.euros() + compared.cents());
    }
 
    public Money minus(Money decreaser) {
        int euros = this.euros - decreaser.euros();
        int cents = this.cents - decreaser.cents();
 
        if (cents < 0) {
            cents = cents + 100;
            euros = euros - 1;
        }
 
        // if the value becomes negative, return zero
        if (euros < 0) {
            return new Money(0, 0);
        }
 
        return new Money(euros, cents);
    }
    */

}
