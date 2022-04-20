package Replıt_YoutubeSorulr;

import java.util.Scanner;

public class soru {
    public static void main(String[] args) {
        //1 den n e kadar sayılardan tek olanların toplamını bulunz
        //n sayısı kullanıcıdan alınacak

        Scanner scan = new Scanner(System.in);
        System.out.println("1 den buyuk bır sayı  gırınız");
        int sayı = scan.nextInt();
        int toplam = 0;

        for (int i = 1; i < sayı; i++) { //i=i+2
            if (i % 2 == 1) {
                toplam += i;
            }

        }
        System.out.println("1-" + sayı + " arasındakı tek sayıların toplamı:" + toplam);
        System.out.println("");



    }
}