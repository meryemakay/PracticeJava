package day11;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

char ch1= 'a' ;

	String name =“John came late"

	Expected Output:


Number of a = 2

         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir isim giriniz:");
        String isim = scan.nextLine();

        System.out.print("bır char karakter gırınz:");
        char karakter = scan.next().charAt(0);
        int arananKarakter = 0;

        for (int i = 1; i < isim.length(); i++) {
            karakter = isim.charAt(i);
            if (karakter == 'a') {
                arananKarakter++;

            }

        }
        System.out.println("aranan karakter sayisi :" + arananKarakter);
    }//main
}