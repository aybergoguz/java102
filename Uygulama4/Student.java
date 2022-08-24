public class Student{

    private String name;
    private String surname;
    private String idNo;
    private String address;
    private int note;

    public Student(String name, String surname , String idNo,String addres,int note){

        this.name = name;
        this.surname = surname;
        this.idNo = idNo;
        this.address = addres;
        this.note=note;
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

    public String getIdNo(){
        return idNo;
    }
    public void setIdNo(String idNo){
        this.idNo=idNo;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public int getNote(){

        if(note > 100 || note < 0){
            note=0;
        }
        return note;
    }
    public void setNote(int note){
        this.note=note;
    }

}