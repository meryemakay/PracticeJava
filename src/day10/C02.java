package day10;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
/*
Kullanıcı tarafından girilen DOUBLE sayıyı
tam sayıya çeviren bir program yazınız.

 */
        Scanner scan = new Scanner(System.in);
        System.out.println("bır double sayı gırınz");
        double doublesayı=scan.nextDouble();

        int intsayi=(int)doublesayı;
        System.out.println(doublesayı);
        System.out.println(intsayi);
    }
}
