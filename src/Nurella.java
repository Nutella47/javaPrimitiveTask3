import java.util.Random;

public class Nurella {
    public static void main(String[] args) {
        Random r = new Random();
        int result = r.nextInt(99) + 1;
        System.out.println("The random number is " + result);
        if (result % 2 == 0) {
            System.out.println("it is even number");
        } else {
            System.out.println("it is odd number");
            
        }
    }
}
