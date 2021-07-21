package relembrandoJava;

import java.io.IOException;
import java.util.Scanner;

public class menorEPosicao {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int n;
        int menor = 0;
        int p = 0;

        n = in.nextInt();
        int v[] = new int[n];
        in.nextLine();

        String nmrs[] = in.nextLine().split(" ");       

        for(int i = 0; i < v.length; i++){
            v[i] = Integer.parseInt(nmrs[i]);

            if(i == 0){
                menor = v[i];
                p = i;
            }else if(menor > v[i]){
                menor = v[i];
                p = i;
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + p);
        in.close();
    }
}