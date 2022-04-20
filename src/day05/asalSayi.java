package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class asalSayi {

    public static void main(String[] args) {

/*
Girdi olarak bir tamsayı kabul eden ve girdiden büyük ilk 10 asal sayıyı ekrana yazdıran bir program yazınız.
Input : 5
Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
 */
/* 1.cozum
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı giriniz.");
        int num = scan.nextInt();
        int i = num+1;
        int count = 0;
        while(count<10) {
            for(int j = i-1; j > 1; j--) {
                if(i % j == 0) {
                    break;
                }
                if(j == 2) {
                    System.out.print(i+",");
                    count++;
                }
            }
            i++;
        } */


        //2.cozum

        int input = 9;
        List<Integer> asalSayilar = new ArrayList<>();

        while (asalSayilar.size() < 10) {
            int count = 0;
            input++;
            for (int i = 2; i < input; i++) {
                if (input % i == 0) {
                    count++;
                }

            }
            if (count == 0) {
                asalSayilar.add(input);
            }

        }
        System.out.println(asalSayilar);
    }
}
