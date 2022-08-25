public class Main{
    public static void main(String[] args) {

       OgretimGorevlisi ogretimGorevlisi1 = new OgretimGorevlisi("ayşe", "5431231212", "a@b.com", "CENG", "Ogretim Gorevlisi","12");
        //akademisyen1.derseGir();

        LabAsistani labCalisan1 = new LabAsistani("muti", "432", "a@b.co", "CENG", "ASA", "02:00");
        GuvenlikGorevlisi guvenlikGorevlisi1= new GuvenlikGorevlisi("ahmet ", "32134","a@d.cd", "oi", 12,"kd122");
        //labCalisan1.giris("12:00");
        //labCalisan1.giris();

        Calisan [] calisanlar ={ogretimGorevlisi1,guvenlikGorevlisi1,labCalisan1}; 

        Islem.girisYapanlar(calisanlar);
    
    }
}