package ex2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op, numero;

        Num n = new Num(0);

        do{
            System.out.println("1. Inicializar um número: ");
            System.out.println("2. Incrementar: ");
            System.out.println("3. Decrementar: ");
            System.out.println("4. Acessar o número: ");
            System.out.println("0. System Exit: ");


            System.out.println("Digite a opção desejada: ");
            op = in.nextInt();
            in.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Digite um número inteiro: ");
                    numero = in.nextInt();
                    n = new Num(numero);
                    break;
                case 2:
                    n.incrementar();
                    System.out.println(n.num);
                    break;

                case 3:
                    n.decrementar();
                    System.out.println(n.num);
                    break;
                
                case 4:
                    System.out.println(n.acessar(n.num));
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    break;
            }

        }while(op < 5);
        in.close();
    }
}
