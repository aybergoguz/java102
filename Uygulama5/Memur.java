public class Memur extends Calisan{

    private String depertman;
    private int mesai;

    public Memur(String adSoyad, String telefon, String email, String depertman , int mesai) {
        super(adSoyad, telefon, email);
        this.depertman=depertman;
        this.mesai=mesai;
    }

    public String getDepertman() {
        return depertman;
    }

    public void setDepertman(String depertman) {
        this.depertman = depertman;
    }

    public int getMesai() {
        return mesai;
    }

    public void setMesai(int mesai) {
        this.mesai = mesai;
    }

    public void calis(){
        
    }


    

}