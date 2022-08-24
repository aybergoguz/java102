public class Course{

    private String dersAdi;
    private String code;
    private Akademisyen akademisyen;

    public Course(String dersAdi, String code, Akademisyen akademisyen){
        this.dersAdi = dersAdi;
        this.code =code;
        this.akademisyen=akademisyen;
    }

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Akademisyen getAkademisyen(){
        return this.akademisyen;
    }

    public void setAkademisyen(Akademisyen akademisyen){
        this.akademisyen=akademisyen;
    }
}