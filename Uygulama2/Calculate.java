public class Calculate{

    public static void calculateAvarage(Course [] notes){

        double total =0;
        for(Course i : notes){
            total += i.note;
        }
        double avarage = total / notes.length;
        System.out.println("Ortalamaniz :\t" + avarage);
    }

    public static void dersIsimleriniYazdir(Course [] names){
        
        for (Course j : names){

            System.out.println(j.name);

        }
    }

    // static method yazarak nesne üretmeden işlem yapabildik.
}