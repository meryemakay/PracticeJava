package Replıt_YoutubeSorulr;

public class ForEach {
    public static void main(String[] args) {

        // Bir integer array olusturunuz ve
        // bu array’deki tum sayilarin carpimini For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.

        int arr[]= {1,2,2,2,4};

        int carpim=1;

        for (int each : arr) {

            carpim*=each;


        }

        System.out.println("array'in tum elemanlarinin carpimi : " + carpim);


        int arr1[]={4,5,2,10,10};
        int carpım1=1;

        for (int each : arr1) {
            carpım1*=each;

        }

        System.out.println(carpım1);
    }



    }

