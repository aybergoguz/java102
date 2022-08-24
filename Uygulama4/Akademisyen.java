public class Akademisyen{

    private String name;
    private String surname;
    private String bolum;

    public Akademisyen(String name , String surname , String bolum){

        this.name = name;
        this.surname = surname;
        this.bolum = bolum;

    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getSurname(){
        return this.surname;
    }

    public void setSurname(String surname){
        this.surname=surname;
    }

    public String getBolum(){
        return this.bolum;
    }

    public void setBolum(String bolum){
        this.bolum=bolum;
    }
} 