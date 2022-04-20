package day10;

public class C05 {
    public static void main(String[] args) {

        /*
        Verilen iki sayının (sıfırdan büyük veya sıfıra eşit)
         toplamını hesaplayan ve yazdıran bir Java programı yazın.
         Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.

Ornek:

INPUT :

25

46

OUTPUT :

Numaralarin Toplami:

71
         */
        int sayi1=6;
        int sayi2=2;
        int sayi3=sayi1+sayi2;

        System.out.println("ıkı sayının toplamı :" + sayi3);

if (sayi3>10 || sayi1>10 || sayi2>10){
    System.out.println("overflow");


        }else
    System.out.println("toplam :" + sayi3);

    }
}
