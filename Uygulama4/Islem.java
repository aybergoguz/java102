public class Islem{

    public static void isimleriYazdir(Student [] names){

        for(Student ogrenci : names){
            System.out.println(ogrenci.getName());
        }
    }

    public static void ortalamaBul(Student [] notes){

        double total = 0;
        for(int i=0; i<notes.length ; i++){
            total +=notes[i].getNote();
        }
        double ortalama = total / notes.length;
        System.out.println("Ucunun ortalamasi :\t" + ortalama);
    }
}