import java.util.Scanner;

/**
 * recursao
 */
public class Factorial {

    int factorial(int num){
        if (num == 0) 
            return 1;
        else
            return num * factorial(num -1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Factorial f = new Factorial();
        int result;
        int num;

        System.out.println("\n\n=================================================");
        System.out.print("Choose the factorial number: ");
        num = in.nextInt();
        result = f.factorial(num);
        System.out.println("The result of the recursion is: " + result);
        System.out.println("=================================================\n\n");
        in.close();
    }
    
}