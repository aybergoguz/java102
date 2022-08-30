public class Main {
    
    public static void main(String[] args) {
        
        String kelime2 = "abc";
        Nullable<Integer> n = new Nullable<Integer>(10);
        Nullable<String> kelime = new Nullable<String>("Ayberg");
        Nullable<String> kelime1 = new Nullable<String>(kelime2);
        n.run();
        kelime.run();
        kelime1.run();
        System.out.println("------------");

        String a = "as";
        int b = 10;
        double c = 12.3;
        Test<String,Integer,Double> test = new Test<>(a,b,c);
        Test<String,Integer,Double> test1 = new Test<>("asa",12,3.4);
        test.showInfo();
        System.out.println("---------");
        test1.showInfo();

        System.out.println("------Generic Methodlar------");

        DiziYazdir diziYazdir =new DiziYazdir();
        String [] kelimeler = {"Ali","Ahmet","Ayse"};
        Integer [] sayilar ={1,2,3,4,5};
        Character [] karakterler = {'a','b','c'};
        diziYazdir.print(kelimeler);
        diziYazdir.print(sayilar);
        diziYazdir.print(karakterler);

        System.out.println("\n-----------");

        Yazdir.printArray(kelimeler);
        Yazdir.printArray(sayilar);
        Yazdir.printArray(karakterler);
        Yazdir.printArray(kelimeler);

    }
}
