package day09;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {



     /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */

        Scanner scan = new Scanner(System.in);
        int arr[] = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("sayi giriniz : ");
            arr[i] = scan.nextInt();
        }


        System.out.println(tekEleman(arr));

    }
        private static java.util.ArrayList<Integer> tekEleman ( int[] arr){

            java.util.ArrayList<Integer> list = new java.util.ArrayList<>();//bos list icine tek elemanlar atanacak

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 1) {
                    list.add(arr[i]);
                }

            }
            return list;


        }
    }
