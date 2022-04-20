package Replıt_YoutubeSorulr;

import java.util.Scanner;

public class Soru_3SayınınEnBuyugu {
    public static void main(String[] args) {

        //kullanıcdan alınan 3 sayıdan en buyugunu bulan
        //progrm yazınız
Scanner scan=new Scanner(System.in);
        int a, b, c;
        System.out.println("1.sayıyı gırınız");
        a = scan.nextInt();

        System.out.println("2.sayıyı gırınz");
        b = scan.nextInt();

        System.out.println("3.sayıyı gırzn");
        c = scan.nextInt();

        if (a > b && a > c) {
            System.out.println("en buyuk sayı : " + a);
        } else if (b > a && b > c) {
            System.out.println("en buyuk sayı : " + b);
        } else if (c>a && c>b){
            System.out.println("en buyuk sayı:" + c);

        }else
            System.out.println("sayılar esıt");
    }

    }

