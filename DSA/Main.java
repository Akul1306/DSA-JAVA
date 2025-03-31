import java.util.* ;
import java.io.*;
public class Main{
    public static void main(String[] args) {
        System.out.println(fibonacciNumber(95));
    }
    public static long fibonacciNumber(int n){
        if (n <= 1) return n;

        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
}