import java.util.Comparator;

import java.util.Comparator;

public class OrderNoteComprator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getNote() - o1.getNote();
    }

}
