package LmbdaPractice;

import java.util.Arrays;

public class C02 {
   /* TASK :
    multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
    ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
    input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}
    Click to expand inline (6 lines)
        */
   public static void main(String[] args) {


       int arr[][] = {{10, 20, 30}, {4}, {6, 7, 20}};
       System.out.println(Arrays.toString(Arrays.stream(arr)
               .map(t -> Arrays.stream(t).sum())
               .toArray()));

       System.out.println("2.yol\n");

       Arrays.stream(arr).map(t-> Arrays.stream(t).sum()).forEach(System.out::println);
   }
}
