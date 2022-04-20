package Replıt_YoutubeSorulr;

import java.util.Scanner;

public class TekSayiToplami {
    public static void main(String[] args) {

        // 1 den n e kadar olan sayılardan tek olanların toplamını bulunuz
        //n sayısı kullanıcıdan alınacak

        Scanner scan=new Scanner(System.in);
        System.out.println("bır  tam sayı gırınız");
        int sayı=scan.nextInt();


        int toplam=0;
        for (int i=1; i<sayı; i++){

            if(i%2==1){
                toplam+=i;


            }
        }
        System.out.println("toplam:" +toplam);
    }
}
