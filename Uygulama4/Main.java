public class Main{

    public static void main(String[] args) {
        
        Student student1 = new Student("Ayberg", "Oğuz", "423", "Denzili", -100);
        Student student2 = new Student("Çağdaş", "Türk", "35", "Izmir", 20);
        Student student3 = new Student("Onur", "Öztürk", "26", "Eskisehir", 70);

        Student [] students ={student1,student2,student3};
        Islem.isimleriYazdir(students);
        Islem.ortalamaBul(students);
        System.out.println("---------------");

        Akademisyen akademisyen1 = new Akademisyen("Mahmut", "Hoca", "CENG");
        Course mat =new Course("Matematik", "MAT102", akademisyen1);

        System.out.println(mat.getAkademisyen().getBolum());
        
    }
}