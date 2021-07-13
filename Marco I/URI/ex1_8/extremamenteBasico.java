package ex1_8;

import java.io.IOException;
import java.util.Scanner;

public class extremamenteBasico{
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int a, b, x;
        a = in.nextInt();
        b = in.nextInt();
        x = a + b;
        System.out.println("X = " + x);
        in.close();
    }  
}