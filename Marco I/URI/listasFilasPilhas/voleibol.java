package listasFilasPilhas;

import java.io.IOException;
import java.util.Scanner;

public class voleibol {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int players;
        int trys[] = new int[3];
        int strys[] = new int[3];
        String name;

        players = in.nextInt();
        in.nextLine();

        for(int i = 0; i < players; i++){
            name = in.nextLine();
            
            String trysStr[] = in.nextLine().split(" ");
            trys[0] += Integer.parseInt(trysStr[0]);
            trys[1] += Integer.parseInt(trysStr[1]);
            trys[2] += Integer.parseInt(trysStr[2]);

            String stryStr[] = in.nextLine().split(" ");
            strys[0] += Integer.parseInt(stryStr[0]);
            strys[1] += Integer.parseInt(stryStr[1]);
            strys[2] += Integer.parseInt(stryStr[2]);
        }

        float mSaque = strys[0] * 100f / trys[0];
        float mBloqueio = strys[1] * 100f / trys[1];
        float mAtaque = strys[2] * 100f / trys[2];

        System.out.printf("Pontos de Saque: %.2f %%.\n", mSaque);
        System.out.printf("Pontos de Bloqueio: %.2f %%.\n", mBloqueio);
        System.out.printf("Pontos de Ataque: %.2f %%.\n", mAtaque);
        in.close();
    }
}
