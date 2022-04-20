package Replıt_YoutubeSorulr;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {
       /*
         kullanıcıdan iki tamsayı değeri kabul eden
         ve daha büyük değerleri döndüren bir Java programı yazınız
         Ancak iki değer aynıysa, 0 döndürün ve
         iki değer 6'ya bölündüğünde aynı kalana sahipse  küçük değeri döndürün.

 */
Scanner scan=new Scanner(System.in);
        System.out.println("1.sayıyı gırınız");
int sayı1=scan.nextInt();
        System.out.println("2.sayıyı gırınız");
int sayı2=scan.nextInt();



if(sayı1==sayı2){
    System.out.println("0");
}
if(sayı1%6==sayı2%6){
    if(sayı1>sayı2){
        System.out.println(sayı2);
    }else
        System.out.println(sayı1);
}
if(sayı2>sayı1){
    System.out.println(sayı2);
}else{
    System.out.println(sayı1);
}

    }



    }

