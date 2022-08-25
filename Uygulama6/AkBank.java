public class AkBank implements IBank{

    private String bankaAdi;
    private String terminalID;
    private String password;
    
    public AkBank(String bankaAdi, String terminalID, String password) {
        this.bankaAdi = bankaAdi;
        this.terminalID = terminalID;
        this.password = password;
    }

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress){

        System.out.println(this.bankaAdi + " Baglandi.");
        return true;
        
    }

    @Override
    public boolean payment(double price, String cardNo , String date , String cvc ){

        System.out.println("islem basarili");
        System.out.println(this.bankaAdi + " Cevap bekleniyor.");
        return true;

    }
}