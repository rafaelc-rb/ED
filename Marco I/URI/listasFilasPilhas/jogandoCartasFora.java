package listasFilasPilhas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class jogandoCartasFora {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> forwent = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int pfirst;
        int numList;

        do {
            numList = in.nextInt();
            if (numList != 0) {
                list.add(numList);
            }
        } while (numList != 0);

        for (Integer num : list) {
            for (int i = num; i > 0; i--) {
                stack.push(i);
            }

            while (stack.size() > 1) {
                pfirst = stack.peek();
                forwent.add(pfirst);
                stack.pop();
                pfirst = stack.peek();
                stack.add(0,pfirst);
                stack.pop();
            }
            System.out.print("Discarded cards: ");
            for(int i = 0; i < forwent.size();i++){
                System.out.print(forwent.get(i));
                int d = i;
                d++;
                if(d == forwent.size()){
                    System.out.println();
                }else{
                    System.out.print(", ");
                }
                
            }
            System.out.print("Remaining card: ");
            for(int i = 0; i < stack.size();i++){
                System.out.print(stack.get(i));
                int d = i;
                d++;
                if(d == stack.size()){
                    System.out.println();
                }else{
                    System.out.print(", ");
                }
                
            }
            stack.clear();
            forwent.clear();
        }
        in.close();
    }
}
