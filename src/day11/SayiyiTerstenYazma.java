package day11;

import java.util.Scanner;

public class SayiyiTerstenYazma {
    public static void main(String[] args) {


        /*kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)

        Input :1238

        Output :Girilen Numananin Tersi: 8321*/

        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen bır sayı gırınız: ");
        int sayi = scan.nextInt();

        for (int i = 0; i < sayi; i++) {
            System.out.print(sayi % 10);
            sayi = sayi / 10;


        }
        System.out.println(sayi);

    }
}
