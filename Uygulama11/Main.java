import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static final MyCalculator myCalculator = new MyCalculator();
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (scanner.hasNextInt()) {

            int n = scanner.nextInt();
            int p = scanner.nextInt();

            try {
                System.out.println(myCalculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e.getClass().getName());
            }

        }
    }

}