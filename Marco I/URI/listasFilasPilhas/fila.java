package listasFilasPilhas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class fila {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in); 
        int size;
        int delSize;

        ArrayList<Integer> queue = new ArrayList<>();

        size = in.nextInt();

        for (int i = 0; i < size; i++) {
            queue.add(in.nextInt());
        }

        delSize = in.nextInt();

        for(int i = 0; i < delSize; i++){
            int remove = in.nextInt();
            queue.remove((Object) remove);
        }

        for(int i = 0; i < (size - delSize); i++){
            if(i == 0)
                System.out.print(queue.get(i));
            else{
                System.out.print(" " + queue.get(i));
            }
        }
        System.out.println();;
        in.close();
    }
}