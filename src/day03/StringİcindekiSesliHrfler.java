package day03;

import java.util.Scanner;

public class StringİcindekiSesliHrfler {
    public static void main(String[] args) {


        String isim;
        int sesli=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("isminizi giriniz");
        isim = scan.nextLine();

        for (int i = 0; i <isim.length(); i++) {
           char c = isim.charAt(i);
            if (c=='a' || c=='e'|| c=='i'||c=='ı'|| c=='o'|| c=='ö'|| c=='u'|| c=='ü') {
sesli++;
            }
        }
        System.out.println("seslı harf sayısı:"+ sesli);
        System.out.println("sessiz harf:"+ (isim.length()-sesli));

    }
}
