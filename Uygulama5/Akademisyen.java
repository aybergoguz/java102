public abstract class Akademisyen extends Calisan{

    private String bolum;
    private String unvan;

    public Akademisyen(String adsoyad, String telefon, String email, String bolum , String unvan){
            
        super(adsoyad,telefon,email);
        this.bolum=bolum;
        this.unvan=unvan;
    }

    public String getBolum() {
        return bolum;
    }
    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public abstract void derseGir(String dersSaati);
}