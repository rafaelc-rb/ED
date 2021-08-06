package relembrandoJava;

import java.io.IOException;
import java.util.Scanner;

public class preenchimentoDeVetorI {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);

        int n[] = new int[10];
        int nmr, i;

        nmr = in.nextInt();
        in.close();

        if(nmr <= 50){
            n[0] = nmr;

            for(i = 1; i < 10; i++){
                n[i] = n[i-1]*2;
            }
            for(i = 0 ; i < 10; i++){
               System.out.println("N["+ i + "] = " + n[i]);
            }
        }
    }
}
