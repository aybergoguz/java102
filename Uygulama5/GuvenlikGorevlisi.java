public class GuvenlikGorevlisi extends Memur{

    private String belge;

    public GuvenlikGorevlisi(String adSoyad, String telefon, String email, String depertman, int mesai, String belge) {
        super(adSoyad, telefon, email, depertman, mesai);
        this.belge=belge;
    }

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }

    public void nobet(){

        
    }





}