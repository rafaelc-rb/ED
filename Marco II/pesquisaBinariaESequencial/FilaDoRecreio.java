import java.io.IOException;
import java.util.Scanner;
import java.util.*;

/**
 * Fila do Recreio
 */
public class FilaDoRecreio {
    static Integer unchangeCount(Integer[] array){
        int unchanged = 0;
        Integer sortedArr[] = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArr[i] = array[i];
        }
        Arrays.sort(sortedArr, Collections.reverseOrder());

        for (int i = 0; i < sortedArr.length; i++) {
            if(sortedArr[i] == array[i]){
                unchanged++;
            }
        }
        return unchanged;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int ntestes = in.nextInt();
        int unchangedArr[] = new int[ntestes];
        
        for (int i = 0; i < ntestes; i++) {
            int alunos = in.nextInt();
            Integer notas[] = new Integer[alunos];

            for (int j = 0; j < alunos; j++) {
                notas[j] = in.nextInt();
            }
            unchangedArr[i] = unchangeCount(notas);
        }

        for (int i = 0; i < unchangedArr.length; i++) {
            System.out.println(unchangedArr[i]);
        }
        
        in.close();
    }
    
}