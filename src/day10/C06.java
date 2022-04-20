package day10;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {

        /*
     Preview of readme.md

Char değişken yanıtının değerini test eden ve aşağıdaki işlemleri gerçekleştiren bir switch ifadesi yazın:

yanıt a ise,

"Talebiniz işleniyor" mesajı yazdırılır

yanıt b ise,

"yine de ilgilendiğiniz için teşekkür ederiz" mesajı yazdırılır yanıt c ise,

"Üzgünüz, şu anda herhangi bir yardım yok" mesajı yazdırılır

başka herhangi bir yanıt değeri için,

"Geçersiz giriş, lütfen tekrar deneyin!" yazdırılı

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bır karakter  giriniz");
        char karakter = scan.next().charAt(0);


switch(karakter){
    case 'a':
        System.out.println("Talebiniz işleniyor");
        break;
    case 'b':
        System.out.println("yine de ilgilendiğiniz için teşekkür ederiz");
break;
    case 'c':
        System.out.println("Üzgünüz, şu anda herhangi bir yardım yok");
break;
   default:
        System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");
break;
}


    }
}


