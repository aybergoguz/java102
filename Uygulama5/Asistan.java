public class Asistan extends Akademisyen{

    private String ofisSaati;

    public Asistan(String adsoyad, String telefon, String email, String bolum, String unvan,String ofisSaati) {
        
        super(adsoyad, telefon, email, bolum, unvan);
        this.ofisSaati=ofisSaati;
    }

    public String getOfisSaati() {
        return ofisSaati;
    }

    public void setOfisSaati(String ofisSaati) {
        this.ofisSaati = ofisSaati;
    }

    public void quizYap(){
        System.out.println(this.getAdSoyad() + " quiz yapti.");
    }

    @Override
    public void derseGir(String saat){
        System.out.println(this.getAdSoyad() + " girdi.");
    }


}