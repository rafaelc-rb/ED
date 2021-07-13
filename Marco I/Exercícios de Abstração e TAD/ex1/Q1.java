package ex1;

import java.util.Scanner;

/**
 * Q1
 */
public class Q1 {
    Scanner in = new Scanner(System.in);
    int op;
    String name, adress, tel;
    Pessoa person;
    MPessoa mp;

    public Q1(){
        mp = new MPessoa();
    }

    void menu(){
        do {
            System.out.println("\n\n");
            System.out.println("1. Adicionar uma pessoa: ");
            System.out.println("2. Listar dados de uma pessoa: ");
            System.out.println("3. Remover uma pessoa: ");
            System.out.println("0. System Exit: ");

            System.out.println("Digite a opção desejada: ");
            op = in.nextInt();
            in.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Digite seu nome: ");
                    name = in.nextLine();
                    System.out.print("Digite seu endereço: ");
                    adress = in.nextLine();
                    System.out.print("Digite seu telefone: ");
                    tel = in.nextLine();
                    try {
                        person = new Pessoa(name, adress, tel);
                        mp.add(person);
                    } catch (IllegalArgumentException e) {
                        e.getCause().toString();
                    }                    
                    break;

                case 2:
                    System.out.print("Digite o nome da pessoa a ser listada: ");
                    name = in.nextLine();
                    try {
                        mp.list(name);
                    } catch (IllegalArgumentException e) {
                        e.getCause().toString();
                    } 
                 
                    
                    
                    break;

                case 3:    
                    System.out.print("Digite o nome da pessoa a ser removida: ");
                    name = in.nextLine();
                    try {
                        mp.delete(name);
                    } catch (IllegalArgumentException e) {
                        e.getCause().toString();
                    }  
                    break;

                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }while(op < 5);

        in.close();
    }

    public static void main(String[] args) {
        Q1 q1 = new Q1();
        q1.menu();
    }
}