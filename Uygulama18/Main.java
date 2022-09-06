import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Takim sayisini Giriniz");
        int n = scanner.nextInt();

        List<String> takimlar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Takimlari giriniz");
            String takim = scanner.next();
            takimlar.add(takim);
        }
        scanner.close();

        if (n % 2 != 0) {
            takimlar.add("Bay");
            n = n + 1;
        }
        System.out.println(takimlar);

        System.out.println(takimlar.indexOf("GS"));

        List<String> tempTakimlar = new ArrayList<>();

        while (0 < takimlar.size()) {
            int index = (int) (Math.random() * takimlar.size());
            tempTakimlar.add(takimlar.get(index));
            takimlar.remove(takimlar.get(index));
        }

        takimlar = tempTakimlar;

        int toplamMacSayisi = n - 1;
        int haftadaKiMacSayisi = n / 2;

        LinkedHashMap<String, ArrayList<ArrayList<String>>> maclar = new LinkedHashMap<>();

        for (int i = 0; i < toplamMacSayisi; i++) {
            String hafta = String.valueOf(i + 1);
            maclar.put(hafta, new ArrayList<ArrayList<String>>());
        }

        for (int i = 0; i < toplamMacSayisi; i++) {
            ArrayList<String> evSahibi = new ArrayList<>();
            ArrayList<String> misafir = new ArrayList<>();

            for (int j = 0; j < haftadaKiMacSayisi; j++) {
                evSahibi.add(takimlar.get(j));
                misafir.add(takimlar.get((n - 1) - j));
            }

            String hafta = String.valueOf(i + 1);
            maclar.get(hafta).add(evSahibi);
            maclar.get(hafta).add(misafir);

            List<String> yeniTakimlar = new ArrayList<>();

            yeniTakimlar.add(takimlar.get(0));
            yeniTakimlar.add(takimlar.get((n - 1)));

            for (int k = 1; k < takimlar.size() - 1; k++) {
                yeniTakimlar.add(takimlar.get(k));
            }

            takimlar = yeniTakimlar;
        }

        System.out.println();

        for (int i = 0; i < 2 * toplamMacSayisi; i++) {
            System.out.println((i + 1) + ". Hafta");
            for (int j = 0; j < haftadaKiMacSayisi; j++) {
                if (i < toplamMacSayisi) {
                    System.out.println(maclar.get(String.valueOf(i + 1)).get(0).get(j) + " vs "
                            + maclar.get(String.valueOf(i + 1)).get(1).get(j));
                } else {
                    System.out.println(maclar.get(String.valueOf(i + 1 - toplamMacSayisi)).get(1).get(j) + " vs "
                            + maclar.get(String.valueOf(i + 1 - toplamMacSayisi)).get(0).get(j));
                }
            }
            System.out.println();
        }
    }
}