package Replıt_YoutubeSorulr;

import java.util.Scanner;

public class OkulaKyıt {
    public static void main(String[] args) {
//kullanıcıdan yasını girip okula kayıt olup olamayacagı bigisini veren kod yaznız




            Scanner scan = new Scanner(System.in);
            System.out.print("yasinizi giriniz :");
            int yas = scan.nextInt();

            if (yas >= 6) {
                System.out.println("okula kayıt olabilir");
                System.out.println("okula hosgeldin");


            } else if (yas < 6) {
                System.out.println("anasinifina kayit olabilir");
            }


        }

    }

