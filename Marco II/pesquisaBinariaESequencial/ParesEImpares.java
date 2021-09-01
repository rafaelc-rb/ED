import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Pares e Impares - 1259 URI
 */
public class ParesEImpares {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int v;
        ArrayList<Integer> pares = new ArrayList<Integer>();
        ArrayList<Integer> impares = new ArrayList<Integer>();
        v = in.nextInt();

        int vector[] = new int[v];

        for(int i = 0; i < v; i++){
            vector[i] = in.nextInt();
        }

        for(int i = 0; i < v; i++){
            if(vector[i]%2 == 0){
                pares.add(vector[i]);
            }else{
                impares.add(vector[i]);
            }
        }
        Collections.sort(pares);
        Collections.sort(impares);
        Collections.reverse(impares);

        for(int i : pares){
            System.out.println(i);
        }
        for(int i : impares){
            System.out.println(i);
        }
        in.close();
    }
}