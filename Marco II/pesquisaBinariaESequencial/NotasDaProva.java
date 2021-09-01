import java.io.IOException;
import java.util.Scanner;

/**
 * Notas da Prova - 2344 URI
 */
public class NotasDaProva {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int grade;

        grade = in.nextInt();
        if(grade == 0){
            System.out.println("E");
        }else if(grade >= 1 && grade <= 35){
            System.out.println("D");
        }else if(grade >= 36 && grade <= 60){
            System.out.println("C");
        }else if(grade >= 61 && grade <= 85){
            System.out.println("B");
        }else if (grade >= 86 && grade <= 100){
            System.out.println("A");
        }
        in.close();
    }
    
}