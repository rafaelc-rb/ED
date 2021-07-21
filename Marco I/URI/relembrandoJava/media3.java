package relembrandoJava;

import java.io.IOException;
import java.util.Scanner;

public class media3 {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        float n1, n2, n3, n4, media, ne, mf;
        String mStr, mfStr;

        n1 = in.nextFloat();
        n2 = in.nextFloat();
        n3 = in.nextFloat();
        n4 = in.nextFloat();

        media = ((n1*2) + (n2*3) + (n3*4) + (n4*1))/10;
        mStr = String.format("%.1f", media);
        System.out.println("Media: " + mStr);

         if(media >= 7){
            System.out.println("Aluno aprovado.");
         }else if (media >= 5 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            ne = in.nextFloat();
            System.out.println("Nota do exame: " + ne);

            mf = ((media + ne)/2);
            if (mf >= 5) {
                System.out.println("Aluno aprovado."); 
            } else {
                System.out.println("Aluno reprovado.");
            }
            mfStr = String.format("%.1f", mf);
            System.out.println("Media final: " + mfStr);
            
         }else{
             System.out.println("Aluno reprovado.");
         }

        in.close();
    } 
}