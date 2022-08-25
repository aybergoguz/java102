public class Main{
    public static void main(String[] args) {

        Akademisyen akademisyen1= new Akademisyen("ayşe", "5431231212", "a@b.com", "CENG", "Ogretim Gorevlisi");
        //akademisyen1.derseGir();

        LabAsistani labCalisan1 = new LabAsistani("muti", "432", "a@b.co", "CENG", "ASA", "02:00");
        Memur memur1= new Memur("ahmet ", "32134","a@d.cd", "oi", 12);
        //labCalisan1.giris("12:00");
        //labCalisan1.giris();

        Calisan [] calisanlar ={akademisyen1,memur1,labCalisan1}; 

        Islem.girisYapanlar(calisanlar);
    
    }
}