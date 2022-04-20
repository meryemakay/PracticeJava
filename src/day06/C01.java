package day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C01 {
    public static void main(String[] args) {
        String str="Javaisalsoeasy";
        String arr[]=str.split("");

        List<String> list = Arrays.asList(arr);

        List <String> birdenFazla= new ArrayList<>(); //
        Collections.sort(list);

        for (int i = 1; i <arr.length ; i++) {
            if (arr[i-1].equals(arr[i])){
                birdenFazla.add(arr[i]);
            }
        }
        System.out.println("Birden fazla olan element List"+birdenFazla);
        List <String> istenen = new ArrayList<>();

        for (int i = 0; i <birdenFazla.size() ; i++) {
            if (!istenen.contains(birdenFazla.get(i))){
                istenen.add(birdenFazla.get(i));
            }
        }
        System.out.println("Sonuc: "+istenen);



    }
}
