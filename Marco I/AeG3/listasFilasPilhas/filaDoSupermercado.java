package listasFilasPilhas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.io.IOException;

public class filaDoSupermercado {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int numeroDeFuncionarios = in.nextInt(); //N
        int numeroDeClientes = in.nextInt(); //M
        int cont = 1;

        ArrayList<Integer> tempoFuncionarios = new ArrayList<>();
        Queue<Integer> numeroDeCompras = new LinkedList<>();
        ArrayList<Integer> funcionario = new ArrayList<>();


        for (int i=0; i<numeroDeFuncionarios; i++) {
            int tempoParaEmpacotar = in.nextInt();

            tempoFuncionarios.add(tempoParaEmpacotar);
            cont = cont++;
            funcionario.add(cont);
        }

        for (int i=0; i<numeroDeClientes; i++) {
            int comprasNaCesta = in.nextInt();

            numeroDeCompras.add(comprasNaCesta);
        }

        int tempo = 0;
        int tMax = Collections.max(tempoFuncionarios);
        int tMin = Collections.min(tempoFuncionarios);

        for (int i=0; i<numeroDeClientes; i++) {
            if (numeroDeFuncionarios >= numeroDeClientes) {
                tempo += numeroDeCompras.element() * tempoFuncionarios.get(i);
                numeroDeCompras.poll();
                funcionario.set(i, 0);
            } else {
                tempo += numeroDeCompras.element() * tMax;
                numeroDeCompras.poll();
                funcionario.set(i, 0);

                if(funcionario.containsAll(0)){
                    for(int j = 0; i < numeroDeCompras.size(); j++){
                        
                    }
                }
                
            }
        }

        System.out.println(tempo/numeroDeFuncionarios);
        
        in.close();
    }
}
