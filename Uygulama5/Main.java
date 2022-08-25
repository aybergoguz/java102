public class Main{
    public static void main(String[] args) {

        Akademisyen akademisyen1= new Akademisyen("ayşe", "5431231212", "a@b.com", "CENG", "Ogretim Gorevlisi");
        akademisyen1.derseGir();

        LabAsistani labCalisan1 = new LabAsistani("muti", "432", "a@b.co", "CENG", "ASA", "02:00");

        labCalisan1.giris("12:00");
        labCalisan1.giris();
    
    }
}