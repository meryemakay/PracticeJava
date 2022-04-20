package day11;

import java.util.Scanner;

public class Switch {
     /*Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

INPUT:

Ay Numarasi:

2

Yil :

2016

OUTPUT :

Subat 2016 29 Gundur.*/
     public static void main(String[] args) {



    Scanner scan=new Scanner(System.in);
    System.out.print(" Lutfen ay no gırınız :");

    int ayno=scan.nextInt();

        switch(ayno){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("girdiğiniz ayda 31 gün vardır");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("girdiğiniz ayda 30 gün vardır");
                    break;

            case 2:
                System.out.print("lütfen bulundugunuz yılı giriniz : ");
                int yıl = scan.nextInt();

                if (yıl % 4 == 0) {
                    System.out.println("girdiğiniz ayda 29 gün vardır");

                } else {
                    System.out.println("girdiğiniz ayda 28 gün vardır");
                }
                break;
            default:
                System.out.println(" yıl 12 aydır lutfen 1-12 arası bır sayı gırınız");
        }
    }

}



