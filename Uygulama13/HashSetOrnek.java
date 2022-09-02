import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import java.util.Iterator;

public class HashSetOrnek {

    public static void hashSet() {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] pairLeft = new String[t];
        String[] pairRight = new String[t];

        for (int i = 0; i < t; i++) {
            pairLeft[i] = scanner.next();
            pairRight[i] = scanner.next();
        }

        Set<String> stringSet = new HashSet<>();
        for (int i = 0; i < t; i++) {
            stringSet.add(pairLeft[i] + "," + pairRight[i]);
            System.out.println(stringSet.size());
        }

        Iterator<String> ite = stringSet.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }

    }
}
