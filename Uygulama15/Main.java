import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(null);
        list.add(1);

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println(list);
        System.out.println("---------------");
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.indexOf(1));
        System.out.println(list.lastIndexOf(1));
        System.out.println("---------------");
        list.add(2, 100); // 2. index e atar diğerlerini bir sonraki indexe öteler
        list.set(4, 2000);
        for (Integer eleman : list) {
            System.out.println(eleman);
        }

        System.out.println("---------------");
        System.out.println(list.contains(100));
        System.out.println(list.remove(5));

        for (Integer eleman : list) {
            System.out.println(eleman);
        }
        HackerRank.as();

    }
}