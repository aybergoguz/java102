import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        List<String> liste = new LinkedList<>();
        liste.add("Mustafa");
        liste.add("Cetindag");
        liste.add("Java");
        liste.add("102");

        Iterator<String> itr = liste.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        Vector<String> vector = new Vector<>();
        vector.add("Denizli");
        vector.add("Izmir");
        vector.add("Ankara");
        vector.add("Aydin");
        System.out.println(vector.contains("Denizli"));

        Iterator<String> itr1 = vector.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

    }
}