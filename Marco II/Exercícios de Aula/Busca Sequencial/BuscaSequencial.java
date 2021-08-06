import java.util.Scanner;

public class BuscaSequencial {

    int sequentialSearch(int vet[], int key) {
        

        for(int i = 0; i < vet.length; i++){
            if(key == vet[i])
                return i;      
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BuscaSequencial srch = new BuscaSequencial();

        int vet[] = {10,11,20,35,20,28,7,40,37,32};
        int temp;

        System.out.println("\n\n========================================================");
        System.out.print("Type the temperature u want to find: ");
        temp = in.nextInt();
        System.out.println("The position in vector of the temperature u seek is: " + srch.sequentialSearch(vet, temp));
        System.out.println("========================================================\n\n");
        in.close();
    }  
}
