package day11;

import java.util.Scanner;

public class Fktoriyel {
    public static void main(String[] args) {
        /*
        Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

Input : 6

Output: 6!=65432*1=720
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("faktoriyelini yazdırmak istediginiz bir sayi giriniz :");
        int sayi=scan.nextInt();
        int faktoriyel=1;

        for (int i=1; i<=sayi; i++) {
            faktoriyel=faktoriyel*i;

        }
        System.out.println(sayi + " ! :"  +faktoriyel);
    }
}
