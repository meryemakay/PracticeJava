package day04;

import java.util.Scanner;

public class kıtleIndeksı {
    public static void main(String[] args) {

           /*  Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)

                IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
        BMI 18,5'in altındaysa zayıfsınız
        BMI 18,5 ile 25 arasında ise kilonuz idealdir
        BMI 25-30 arasındaysa şişmansınız
        BMI 30'dan büyük veya eşitse, obez
        Input:
        Output:
        Agirlik : 71
       Boy : 1,72
         BMI : 23.99945916711736
       */


        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen  boyunuzu cm olarak gırınız :");
        double boy = scan.nextInt();
        System.out.print("lutfen kılonuzu kg olarak gırınız :");
        double kılo = scan.nextInt();

        double BKI = kılo / (boy/100* boy/100); //boy cm olarak alındı



        if (BKI < 18.5) {
            System.out.println("zayıfsınız");
        } else if (BKI > 18.5 & BKI < 25) {
            System.out.println("kilonuz ıdeal");
        } else if (BKI > 25 & BKI < 30) {
            System.out.println("sismansınız");

        } else if (BKI >= 30){
            System.out.println("obezsiniz");
        }
        System.out.print("kitle endeksınız : " + BKI);

    }
}






