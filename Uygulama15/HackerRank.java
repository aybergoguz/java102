import java.util.ArrayList;
import java.util.Scanner;

public class HackerRank {

    public static void as() {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList[] arrayLists = new ArrayList[20000];
        for (int i = 0; i < n; i++) {
            arrayLists[i] = new ArrayList();
            int d = scanner.nextInt();
            for (int j = 0; j < d; j++) {
                int value = scanner.nextInt();
                arrayLists[i].add(value);
            }
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int row = scanner.nextInt();
            int column = scanner.nextInt();
            try {
                System.out.println(arrayLists[row - 1].get(column - 1));
            } catch (Exception e) {
                System.out.println("ERROR");
            }
        }
    }

}
