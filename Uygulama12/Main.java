import java.util.Scanner;

public class Main {

    public static void checkAge(int age) throws AgeCheckExeption {
        if (age < 18) {
            throw new AgeCheckExeption("yas hatsi alindi.");
        }
        System.out.println("yas uygundur.");
    }

    public static void main(String[] args) throws AgeCheckExeption {

        Scanner scanner = new Scanner(System.in);
        // int a = 10;
        // int b = 20;
        // int c;
        // int[] arr = new int[2];
        int age = scanner.nextInt();
        checkAge(age);
        /*
         * try {
         * System.out.println(b / a);
         * 
         * c = scanner.nextInt();
         * 
         * arr[c] = 11;
         * 
         * } catch (ArithmeticException e) {
         * System.out.println(e.getClass().getName() + ":\t0'a bolme hatasi");
         * } catch (InputMismatchException e) {
         * System.out.println(e.getClass().getName() + ":\tBir tamsayi girmelisiniz");
         * } catch (ArrayIndexOutOfBoundsException e) {
         * System.out.println(e.getClass().getName() + ":\tArray index hatasi");
         * } finally {
         * System.out.println("Burasi kesin calisacak");
         * }
         */

    }
}