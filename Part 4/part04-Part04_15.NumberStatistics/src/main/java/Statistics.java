
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        count = count + 1;
        sum += number;
    }

    public int getCount() {
        // write code here
        return count;
    }
    
    public int sum(){
        if(count == 0){
            return 0;
        }
        return sum;
    }
    
    public double average(){
        if(count == 0){
            return 0;
        }
        return (double) sum / count;
    }
}
