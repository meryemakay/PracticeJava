package Replıt_YoutubeSorulr;

import java.util.Scanner;

public class StrıngıTerstenYazma {

    public static void main(String[] args) {
         //kullanıcıdan ısmını alıp ekrana tersten yazan bır progrm yazınız

        Scanner scan=new Scanner(System.in);
        System.out.println("ısmınız yazınız");
        String isim= scan.nextLine();

        for (int i=isim.length()-1 ; i>=0;i--){
            System.out.print(isim.charAt(i));
        }



    }
}
