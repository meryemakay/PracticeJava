package day11;

import java.util.Scanner;

public class MukemmelSayii {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi = scan.nextInt();

        int toplam=0;
for (int i = 1; i < sayi; i++) {
    if (sayi % i == 0) {
        toplam = toplam + i;

    }
}
      if (toplam==sayi) {
          System.out.println(sayi+ " mukemmel sayidir");
      }
    else
        System.out.println(sayi + "mukemmel sayi degildir");
}



    }

