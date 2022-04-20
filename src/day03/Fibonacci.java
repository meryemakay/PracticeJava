package day03;

public class Fibonacci {
    public static void main(String[] args) {

        //0-1000 arası fıbonacci sayıları?

        int a = 0;
        int b = 1;
        int c = 0;

        do {
            c = a + b;
            if (c>1000) break; //1000 den buyuk 1597 yı yazdırmaması ıcın
            System.out.print( " " +c );
            a = b;
            b = c;
        } while (c < 1000);


    }
}
