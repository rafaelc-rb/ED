package listasFilasPilhas;

import java.util.*;

public class filaDoSupermercado {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int qtdFunc = in.nextInt();
        int qtdCli = in.nextInt();
        int tempoDoFuncionario = 0;

        Queue<Integer> filaClientes = new LinkedList<Integer>();
        ArrayList<Integer> tempoFunc = new ArrayList<>();
        ArrayList<Integer> funcionariosTrabalhando = new ArrayList<>();       

        for (int i=0; i<qtdFunc; i++) {
            tempoDoFuncionario = in.nextInt();
            tempoFunc.add(i, tempoDoFuncionario);
        }

        for (int i=0; i<qtdCli; i++) { //adicionar clientes na fila
            filaClientes.offer(in.nextInt());
        }

        if(qtdCli >= qtdFunc){
            for (int i=0; i<qtdFunc; i++) {
                funcionariosTrabalhando.add(tempoFunc.get(i) * filaClientes.poll());
            }
        }else{
            for (int i=0; i<qtdCli; i++) {
                funcionariosTrabalhando.add(tempoFunc.get(i) * filaClientes.poll());
            }
        }

        //tempo para atender todos os clientes
        int tempo = Collections.min(funcionariosTrabalhando);

        int subtrair = tempo;
        funcionariosTrabalhando.replaceAll(numero -> numero - subtrair);
        
        while (!filaClientes.isEmpty()) {
            int multiplicador = tempoFunc.get(funcionariosTrabalhando.indexOf(0));
            int multiplicacao = multiplicador * filaClientes.poll();
            funcionariosTrabalhando.set(funcionariosTrabalhando.indexOf(0), multiplicacao); //coloca os funcionários para empacotar
            tempo += Collections.min(funcionariosTrabalhando); //adiciona o menor tempo
            int s = Collections.min(funcionariosTrabalhando);
            funcionariosTrabalhando.replaceAll(numero -> numero - s); //subtrai o menor tempo dos funcionáriosTrabalhando
        }
        tempo += Collections.max(funcionariosTrabalhando);

        System.out.println(tempo);
        in.close();
    }
}