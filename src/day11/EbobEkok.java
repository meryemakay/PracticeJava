package day11;

import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {
/*

Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.

Input :

30

40

Beklenen Cikti:
30 ve 40 icin GCD = 10

30 ve 40 icin LCM = 120
 */

        Scanner scan = new Scanner(System.in);
        System.out.print(" Lutfen OBEB ve OKEK hesabı için ilk sayıyı giriniz: ");
        int a = scan.nextInt();

        System.out.print(" Lutfen OBEB ve OKEK hesabı için ikinci sayıyı giriniz:");
        int b = scan.nextInt();

        int GCD = 0;
        int LCM;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                GCD = i;
            }
        }
        LCM = (a * b) / GCD;
        System.out.println(a + " ve " + b + "  için GCD=" + GCD);
        System.out.println(a + " ve " + b + "  için LCM=" + LCM);
    }
}



