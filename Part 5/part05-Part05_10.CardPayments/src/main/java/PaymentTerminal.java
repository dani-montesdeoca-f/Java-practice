
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    private static final double affordableCost = 2.50;
    private static final double heartilyCost = 4.30;


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        double cost = 2.50;
        if(payment >= affordableCost){
            // increase the amount of cash by the price of an affordable mean and return the change
            this.money += affordableCost;
            this.affordableMeals++;
            return payment - affordableCost;
        }
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return payment;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        double cost = 4.30;
        if(payment >= heartilyCost){
            // increase the amount of cash by the price of a hearty mean and return the change
            this.money += heartilyCost;
            this.heartyMeals++;
            return payment - heartilyCost;
        }
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return payment;
    }
    
    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        if(card.balance() >= affordableCost){
            card.takeMoney(affordableCost);
            this.affordableMeals++;
            return true;
        }
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        if(card.balance() >= heartilyCost){
            card.takeMoney(heartilyCost);
            this.heartyMeals++;
            return true;
        }
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        return false;
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if(sum > 0){
            this.money += sum;
            card.addMoney(sum);
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
