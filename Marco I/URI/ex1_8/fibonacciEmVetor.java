package ex1_8;

import java.io.IOException;
import java.util.Scanner;

public class fibonacciEmVetor {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int num, f;
        long vFib[] = new long[61];
        num = in.nextInt();

        vFib[0] = 0;
        vFib[1] = 1;

        for (int j = 2; j <= 60; j++) {
            vFib[j] = vFib[j - 2] + vFib[j - 1];
        }

        for (int i = 0; i < num; i++) {
            f = in.nextInt();
            System.out.printf("Fib(%d) = %d\n", f, vFib[f]);
        }
        in.close();
    }
    
}
