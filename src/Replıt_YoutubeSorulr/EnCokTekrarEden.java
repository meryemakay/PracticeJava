package Replıt_YoutubeSorulr;

import java.util.ArrayList;
import java.util.List;

public class EnCokTekrarEden {
    public static void main(String[] args) {
        /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)
         Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiran code create ediniz.
       input : Learning java is easy
       output: maximumCounts occurring character is : a
        */
        String str = "Madem geldin dünyaya, otur çalış Javaya";
        String enCok = "";
        String yeniStr[] = str.split("");
        List<String> harfler = new ArrayList<>();

        for (int i = 0; i < yeniStr.length; i++) {
            if (!harfler.contains(yeniStr[i])) {
                harfler.add(yeniStr[i]);
            }


        }
        int count;
        int max = 0;
        for (int i = 0; i < harfler.size(); i++) {
            count = 0;
            for (int j = 0; j < yeniStr.length; j++) {
                if (harfler.get(i).contains(yeniStr[j])) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                enCok = harfler.get(i);
            }
        }


        System.out.println("En çok geçen harf:  " + enCok + " = " + max);





    }
}
