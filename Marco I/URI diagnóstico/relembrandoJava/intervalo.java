package relembrandoJava;

import java.io.IOException;
import java.util.Scanner;

public class intervalo {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        float nmr;

        nmr = in.nextFloat();

        if(nmr >= 0 && 25f >= nmr){
            System.out.println("Intervalo [0,25]");
        }else if (nmr > 25f && 50f >= nmr){
            System.out.println("Intervalo (25,50]");
        }else if (nmr > 50f && 75f >= nmr) {
            System.out.println("Intervalo (50,75]");
        }else if (nmr > 75f && 100f >= nmr) {
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }

        in.close();
    }
}
