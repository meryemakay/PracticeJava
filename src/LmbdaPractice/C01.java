package LmbdaPractice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class C01 {

    /*
     Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
     Kullanıcıdan alınacak  iki kelimenin Anagram durumunu belirleyen  Java kodunu yazınız.
     isAnagram("listen", "Silent") ==> true
       */
    public static void main(String[] args) {
        System.out.println(isAnagram("adanada", "adanada"));
        System.out.println(isAnagram("listen", "Silent"));
    }

    public static boolean isAnagram(String x, String y) {
        String[] a = x.toLowerCase().split("");
        String[] b = y.toLowerCase().split("");

        return Arrays.stream(a).sorted().collect(Collectors.toList()).equals(Arrays.stream(b).sorted().collect(Collectors.toList()));
    }

}
