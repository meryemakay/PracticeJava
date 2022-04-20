package Replıt_YoutubeSorulr;

import java.util.ArrayList;
import java.util.Scanner;

public class TekRakamlarıBasaAlma {
    public static void main(String[] args) {
        //kullanıcıdan bır sayı alınız
        //bu sayı içindeki tek rakamları
        //basa alalım
        //örnk: 345681-->153468

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int sayı=scan.nextInt();

        ArrayList<Integer>list = new ArrayList<>();


        for (int i=0; i<sayı; i++) {
            if(i%2==0){
                list.add(i);
            }

        }

        System.out.println(list);



    }

}