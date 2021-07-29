package listasFilasPilhas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class amigosDoHabay {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String insc;
        String maior = "";
        String nomeop[] = new String[2];
        ArrayList<String> singupsYes = new ArrayList<>();
        ArrayList<String> singupsNo = new ArrayList<>();

        do {
            insc = in.nextLine();
            nomeop = insc.split(" ");

            if (nomeop[1].equalsIgnoreCase("YES")) {
                for(String str : singupsYes){
                    if (!nomeop[0].equalsIgnoreCase(str)){
                        singupsYes.add(nomeop[0]);
                        if (nomeop[0].length() > maior.length()) {
                            maior = nomeop[0];
                        }
                    }
                }
            }else{
                for(String str : singupsNo){
                    if (!nomeop[0].equalsIgnoreCase(str)){
                        singupsNo.add(nomeop[0]);
                    }
                }
            }

        } while (!insc.equalsIgnoreCase("FIM"));

        Collections.sort(singupsYes);
        Collections.sort(singupsNo);

        for (String str : singupsYes) {
            System.out.println(str);
        }

        for (String str : singupsNo) {
            System.out.println(str);
        }
        
        System.out.println("\nAmigo do Habey:\n" + maior);

        in.close();
    }
}