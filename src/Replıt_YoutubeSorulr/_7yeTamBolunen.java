package Replıt_YoutubeSorulr;

import java.util.Scanner;

public class _7yeTamBolunen {
    //n den me e kadar olan sayılaradan 7 ye tam bolunnlerı bulunuz
    //m ve n kullnıcdan alınacak

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("baslangıc sayısını yazınız");
        int sayı1=scan.nextInt();
        System.out.println("bıtıs sayısını gırınız");
        int sayı2=scan.nextInt();


        for (int i=sayı1; i<sayı2;i++){
            if(i%7==0){
                System.out.print(i+ " ");
            }
        }
    }
}
