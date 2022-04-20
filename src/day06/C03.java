package day06;

import java.util.Scanner;

public class C03 {
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

     /*   boolean artıkMI = false;
        if (yıl % 4 == 0) {

            if (yıl % 100 == 0) {

                if (yıl % 400 == 0) {
                    artıkMI = true;
                } else
                    artıkMI = false;
            } else
                artıkMI = true;
        } else{
            artıkMI = false;

    }
      if (artıkMI==true)
          System.out.println(yıl + " artık  bır yıldır");
       else
          System.out.println(yıl + " artık yıl degıldır");*/

       /* if((yıl%4==0 && yıl%100!=0) || yıl%400==0) {
            System.out.println(yıl + " artık yıldır");
        }else
            System.out.println(yıl + " artık yıl degıldır");*/

        if(yıl%4==0) {
            if (yıl % 100 == 0)
                if (yıl % 400 == 0)
                    System.out.println(yıl + " artık yıldır");
            else
                    System.out.println( yıl + " artık yıl degıldr");
        }
        else
            System.out.println(yıl + " artık yıl degıldır");
    }//maın
}