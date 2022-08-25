public class OgretimGorevlisi extends Akademisyen{

    private String kapiNo;

    public OgretimGorevlisi(String adsoyad, String telefon, String email , String bolum, String unvan, String kapiNo){

        super(adsoyad, telefon, email, bolum, unvan);
        this.kapiNo=kapiNo;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }

    public void senatoToplantisi(){

        System.out.println(this.getAdSoyad() + " Senato toplantisina katildi.");
    }

    public void sinavYap(){

        System.out.println(this.getAdSoyad() + " Sinav yapti.");
    }
}