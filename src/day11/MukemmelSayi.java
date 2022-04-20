package day11;

import java.util.Scanner;

public class MukemmelSayi {

    public static void main(String[] args) {
/*
Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse,
herhangi bir sayı Mükemmel Sayı olarak bilinir.

Input :

6

Output:

6 Mukemmel Sayidir.

======================

Input

7

Output:

7 Mukemmel Sayidir degildir.
 */

            Scanner scan = new Scanner(System.in);
            System.out.print("Lutfen bir sayi giriniz : ");
            int sayi = scan.nextInt();

            System.out.println(checkPerfectNumber(sayi));
            boolean flag;
            flag = checkPerfectNumber(sayi);
            System.out.println(flag);

            String result = checkPerfectNumber(sayi) ? "Sayi mukemmel sayidir"
                    : "Sayi mukemmel sayi degildir";
            System.out.println(result);
        }

        public static boolean checkPerfectNumber(int sayi) {
            int toplam = 0;
            boolean flag = false; // durum kontrolu (acik kapali gibi) "flag ismi bir onem arzetmiyor"
            for (int i = 1; i < sayi; i++) {
                if (sayi % i == 0) {
                    toplam = toplam + i; // toplam += i;
                }
            }
            if (toplam == sayi) {
                flag = true;
            }

            return flag;



        }


    }


    

