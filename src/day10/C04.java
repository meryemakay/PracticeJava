package day10;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        /*
       Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

Input :

John White

1234234534561478

Output : Name :

J*** W****

CCN : **** **** **** 1478

Ilk Harfler Buyuk harf ile baslamalidir.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen adınızı giriniz");
        String isim=scan.nextLine();

        System.out.println("lutfen soyisminizi giriniz");
        String soyisim=scan.nextLine();

        System.out.println("lutfen Kredı Kart numaranızı giriniz  ");

        String  CCN=scan.next();


        String yenıısım = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).replaceAll("\\S", "*");


        String yenısoyısım = soyisim.substring(0, 1).toUpperCase() +
                soyisim.substring(1).replaceAll("\\S", "*");

        String yenıkkno = "**** **** **** " + CCN.substring(12);

        System.out.println("ısım soyısım :" + yenıısım +" " + yenısoyısım+
                "\nkart no: " + yenıkkno);
    }
}
