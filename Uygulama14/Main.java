import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        LinkedHashSet<Integer> list = new LinkedHashSet<>();

        list.add(10);
        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        OrderNoteComprator order = new OrderNoteComprator();
        TreeSet<Student> students = new TreeSet<>(order); // TreeSet<>(new OrderNoteComprator());

        Student s1 = new Student("Mustafa", 10);
        students.add(s1);
        students.add(new Student("Ayberg", 70));
        students.add(new Student("Ali", 90));
        students.add(new Student("Damla", 100));
        students.add(new Student("Damla", 80));
        students.add(new Student("Cemre", 90));

        for (Student stu : students) {
            System.out.println(stu.getName() + ":" + stu.getNote());
        }

    }
}