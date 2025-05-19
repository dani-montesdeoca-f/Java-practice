
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for(int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for(int i = 0; i < number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int space = size-1;
        for(int i = 0; i < size; i++){
            printSpaces(space);
            printStars(i+1);
            space--;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        // pyramid
        for(int i = 0; i < height; i++){
            printSpaces(height - (i+1)); // spaces
            printStars(2 * i + 1);
        }
        // log
        for(int i = 0; i < 2; i++){
            printSpaces(height-2); // centered
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
