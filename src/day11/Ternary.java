package day11;

import java.util.Scanner;

public class Ternary {


    public static void main(String[] args) {



        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir isim giriniz: ");
        String ad = scan.next();
        System.out.println(ad.length() < 4 ? (ad.charAt(0) == ad.charAt(1) ||
                ad.charAt(0) == ad.charAt(2) || ad.charAt(1) == ad.charAt(2)
                ? "isim ayni karakterlere sahiptir." : "Dizenin benzersiz karakterleri var")
                : "Girilen karakter fazla");
    }

}

