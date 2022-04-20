package day10;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

     /*   Kullanıcıdan üç basamaklı bir sayı girmesini
     ve bu sayının basamaklarının toplamını bulmasını isteyin.

                Örnek Çıktı:

        Verilen tamsayının rakamları toplamı 10'dur. */

        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamaklı bir sayi giriniz");
        int sayi=scan.nextInt();


        int rakam=0;
        int rakamlarToplamı=0;

        //1.adım rakam=0 sayı=7532

        rakam=sayi%10; //2
        rakamlarToplamı +=rakam;
        sayi/=10; //753,2 olur ama ınt old için 753 olur

        //2.adım r=2  rkmtop=2  sayı=753


        rakam=sayi%10; //3
        rakamlarToplamı+=rakam; //5
        sayi/=10; //75.3 olur ama ınt old için 75

        //3.adım r=3 rmtop=5  sayı=75

        rakam=sayi%10; //5
        rakamlarToplamı+=rakam; //10
        sayi/=10; //7.5 olur ama ınt old için 7

        System.out.println("gırılen 3 basamaklı sayının rakamlar toplamı :" + rakamlarToplamı);
    }
}
