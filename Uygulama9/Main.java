public class Main {
    
    public static void main(String[] args) {
        
        Ogrenci<String> ogrenci = new Ogrenci<>();
        ogrenci.insert("abc");

        Nullable <Integer> n1 =new Nullable<Integer>(12);
        n1.run();
        Nullable <Double> n2 =new Nullable<Double>(12.4);
        n2.run();
    }
}
