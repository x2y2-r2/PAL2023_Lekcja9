import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        Babka kociaBabka = new Babka();
        kociaBabka.imie = "Kicia";
        System.out.println(kociaBabka.imie);

        Kot mruczek = new Kot();
        mruczek.imie = "Mruczek";
        mruczek.wiek = 4;

        System.out.println(mruczek.imie);
        mruczek.miaucz();
        mruczek.przedstawSie();



    }
}