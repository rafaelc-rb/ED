package listasFilasPilhas;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class balancoDeParentesesI {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String input;
        char c;

        while (in.hasNextLine()) {
            Stack<Integer> stack = new Stack<Integer>();

            input = in.nextLine();
            for (int i = 0; i < input.length(); i++) {
                c = input.charAt(i);
                if (c == '(')
                    stack.push(1);
                else if (c == ')') {
                    if (!stack.empty())
                        stack.pop();
                    else
                        stack.push(1);
                }
            }
            if (stack.isEmpty()) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        }

        in.close();
    }
}
