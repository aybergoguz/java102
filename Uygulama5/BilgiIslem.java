public class BilgiIslem extends Memur{

    private String gorev;

    public BilgiIslem(String adSoyad, String telefon, String email, String depertman, int mesai, String gorev) {
        super(adSoyad, telefon, email, depertman, mesai);
        this.gorev=gorev;
    }

    public String getGorev() {
        return gorev;
    }
    
    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public void networkKurulumu(){

    }

}