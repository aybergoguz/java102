public class IsBank implements IBank{

    private String bankaAdi;
    private String terminalID;
    private String password;
    
    public IsBank(String bankaAdi,String terminalID , String password){

        this.bankaAdi=bankaAdi;
        this.terminalID = terminalID;
        this.password = password;
        
    }

    public void setBankaAdi(String bankaAdi){
        this.bankaAdi=bankaAdi;
    }

    public String getBankaAdi(){
        return bankaAdi;
    }

    public void setTerminalID(String terminalID){
        this.terminalID=terminalID;
    }

    public String getTerminalID(){
        return terminalID;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public String getPassword(){
        return password;
    }

    @Override
    public boolean connect(String ipAddress){

        System.out.println(this.bankaAdi + " Baglandi.");
        System.out.println("Kullanici ip adresi:\t" + ipAddress );
        System.out.println("Makine ip adresi:\t" + this.hostAddress );
        

        return true;
    }

    @Override
    public boolean payment(double price ,String cardNo, String date, String cvc){

        System.out.println("islem basarili");

        return true;

    }
}