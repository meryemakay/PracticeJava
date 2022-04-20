package day11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTumElemanlarıSilme {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list);//[A, B, C]


        Iterator<String>itlist=list.iterator();

        while(itlist.hasNext()){
            itlist.next();
            itlist.remove();
        }
        System.out.println(list);//[]
    }
}
