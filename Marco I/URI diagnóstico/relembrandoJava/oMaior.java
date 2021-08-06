package relembrandoJava;

import java.io.IOException;
import java.util.Scanner;

public class oMaior {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int a, b, c, maiorAB, maiorABC;

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        maiorAB = (a+b+Math.abs(a-b))/2;
        maiorABC = (maiorAB+c+Math.abs(maiorAB-c))/2;

        System.out.println(maiorABC + " é o maior"); //a vergonha de escrever "eh" eu não passo não...
        in.close();        
    }
}
