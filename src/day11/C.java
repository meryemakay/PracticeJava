package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
    /*    Write a program that accepts an integer as input and prints first 10 prime numbers greater than input Check numbers if they are even or not in a return method.
                Input : 5
        Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]*/

        Scanner scan = new Scanner(System.in);
        System.out.print("sayı giriniz : ");
        int sayi = scan.nextInt();
        int sayac = 0;
        List<Integer> list=new ArrayList<>();
        while (sayac != 10) {
            sayi++;
            while (sayi % 2 != 0 && sayi % 3 != 0 && sayi % 5 != 0) {
                list.add(sayi);
                sayi++;


              //***
                sayac++;
            }
        }
        System.out.print(list);
    }
    }

