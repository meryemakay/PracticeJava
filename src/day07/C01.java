package day07;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

/*
        Kullanicidan
        artik yil olup olmadigini
        kontrol etmek icin yil girmesini isteyin
        Kural1
         4 ile bolunemeyen yillar artik yil
                degildir
        Kural2
         4 ’un kati olmasina ragmen 100 ile
        bolunebilen yillardan sadece
        400 ’un kati olan yillar artik yildir*/

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bır yıl gırınız");
        int yıl = scan.nextInt();

           if((yıl%4==0 && yıl%100!=0) || yıl%400==0) {
            System.out.println(yıl + " artık yıldır");
        }else
            System.out.println(yıl + " artık yıl degıldır");




    }
}
