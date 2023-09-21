import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mesafe;
        double tarife = 2.20;
        double acilis = 10;

        System.out.print("Mesafe giriniz (km): ");
        mesafe = scanner.nextDouble();

        double tutar = mesafe*tarife;

        if (tutar<20) {
            System.out.println("Ödenecek tutar : 20TL'dir");
        } else {
            System.out.println("Ödenecek tutar : " + (tutar+acilis) );
        }

    }
}