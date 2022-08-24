import java.time.chrono.ThaiBuddhistChronology;

public class Daire{

    public int yaricap;
    public final double PI_SAYISI =3.14;

    public Daire(int yaricap){

        this.yaricap=yaricap;
    }

    public void AlanDAire(){

       double daireAlani= PI_SAYISI * this.yaricap * this.yaricap;
       System.out.println("Daire'nin Alani : \t"+daireAlani);

    }
}