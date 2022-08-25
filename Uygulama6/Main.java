import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Tutati Giriniz:\t");
        double price = scanner.nextDouble();

        System.out.print("KartNo Giriniz:\t");
        String cardNo = scanner.nextLine();

        scanner.nextLine();

        System.out.print("Son kullanma tairihini giriniz:\t");
        String date = scanner.nextLine();

        System.out.println("1. IsBank");
        System.out.println("2. AkBank");
        System.out.print("Banka Seciniz:\t");
        int selectBank = scanner.nextInt();

        switch(selectBank){

            case 1 : 
                IsBank aPos = new IsBank("isbank", "2312312", "3123213");
                aPos.connect("127.1.1.1");
                aPos.payment(100, "21312", "231312", "231");
                break;
            case 2 :
                AkBank bPos = new AkBank("isbank", "2312312", "3123213");
               
                break;
            default :
                System.out.println("gecerli bir banka giriniz");
        }

        
    }
}