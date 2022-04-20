package Replıt_YoutubeSorulr;

import java.util.Scanner;

public class Soru_VizeFınalOrt {
    public static void main(String[] args) {

        //vıze notunu %40 ı
        //fınal notunun %60 ını alarak ort notu hesaplayın
        //ort 50 den buyukse gectı
        //kucukse kaldı yazdırın
        Scanner scan = new Scanner(System.in);
        int vize, fnl;
        double ortalama;


        System.out.println("vize notunu  gırınız");
        vize = scan.nextInt();
        System.out.println("final notunu gırınız");
        fnl = scan.nextInt();
        ortalama = (double) vize * 0.4 + fnl * 0.6;

        System.out.println("ortalamanız:" + ortalama);


        if (ortalama >= 50) {
            System.out.println("gectınız");
        } else
            System.out.println("kaldınız");


    }
}
