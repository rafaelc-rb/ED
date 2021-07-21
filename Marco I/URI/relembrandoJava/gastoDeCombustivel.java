package relembrandoJava;

import java.io.IOException;
import java.util.Scanner;

public class gastoDeCombustivel {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int hrs, vm;
        float lt;

        hrs = in.nextInt();
        vm = in.nextInt();

        lt = (hrs*vm)/12f;

        String str = String.format("%.3f", lt);
        System.out.println(str);
        in.close();
    }
}
