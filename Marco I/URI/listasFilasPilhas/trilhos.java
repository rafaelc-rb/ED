package listasFilasPilhas;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class trilhos {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int savedNum, num, vagao, cont;
        String vagaoStr, numStr;
        cont = 0;
            do{
                numStr = in.nextLine();
                savedNum = Integer.parseInt(numStr);
                if(numStr.equals("0")){
                    break;
                }
                
                
                if(cont == 0){
                    cont++;
                }else{
                    System.out.println();
                }
    
            do{
                vagaoStr = in.nextLine();
                
                String v[] = new String[savedNum];
                Stack<Integer> stack = new Stack<>();
                
                if(vagaoStr.equals("0")){
                    break;
                }
                
                v = vagaoStr.split(" ");
                
                num =0;
                vagao = Integer.parseInt(v[num]);
                
                for (int i = 1; i <= savedNum; i++) {
                    stack.push(i);
                
                
                while(!stack.empty() && stack.lastElement() == vagao){
                   num++;
                   if(num < savedNum){
                       vagao =Integer.parseInt(v[num]);
                   }
                    stack.pop();
                }
                
                }
                
                if(stack.empty()){
                    System.out.println("Yes");
                    //System.out.println(pilhaV);
                }else if(!stack.empty()){
                    System.out.println("No");
                    //System.out.println(pilhaV);
                }
                
            } while (!vagaoStr.equals("0"));
        }while(!numStr.equals("0"));

        System.out.println();
        
        in.close();
    }
}
