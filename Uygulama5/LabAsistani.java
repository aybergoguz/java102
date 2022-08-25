public class LabAsistani extends Asistan{

    public LabAsistani(String adsoyad, String telefon, String email, String bolum, String unvan, String ofisSaati) {
        super(adsoyad, telefon, email, bolum, unvan, ofisSaati);
        
    }

    public void labaGir(){

        System.out.println(this.getAdSoyad() + " lab'a girdi.");
    }


}