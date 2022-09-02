import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(10);
        hashSet.add(30);
        hashSet.add(null);

        for (Integer sayi : hashSet) {
            System.out.println(sayi);
        }

        System.out.println(hashSet.size());

        Iterator<Integer> ite = hashSet.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }

        HashSetOrnek.hashSet();

    }
}