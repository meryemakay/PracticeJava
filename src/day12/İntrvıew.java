package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;

public class İntrvıew {
     /*
   Problem Tanımı :
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.
   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı
   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */

    public static void main(String[] args) {

        List<String> sayi = new ArrayList<>(Arrays.asList("$20","$30","$-60"));

        getSum(sayi);


    }

    private static void getSum(List<String> sayi) {

        int toplam = sayi.stream().map(t->parseInt(t.substring(1))).reduce(0,(x,y)->x+y);

        if(toplam<0) {
            System.out.println(-1);

        }else
            System.out.println(toplam);
    }
}
