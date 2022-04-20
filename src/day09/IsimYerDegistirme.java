package day09;

import java.util.Arrays;
import java.util.List;

public class IsimYerDegistirme {

    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

        List<String> list = new java.util.ArrayList<>(Arrays.asList("Umit", "Emin", "Kemal", "Kerem", "Taylan", "Orhan", "Sinan", "Furkan", "Ahmet", "Ali"));
        System.out.println("ilk hali : " + list);

        String  eleman3=list.get(2);
        String eleman8=list.get(7);

        list.set(2,eleman8);
        list.set(7,eleman3);

        System.out.println("degısmıs halı :"+ list);


    }
}