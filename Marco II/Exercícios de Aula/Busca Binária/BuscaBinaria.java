import java.util.Scanner;

/**
 * buscaBinaria
 */
public class BuscaBinaria {
    
    int binarySearch(int vector[], int value){
        int start = 0;
        int end = 9;
        int middle;

        while (start <= end) {
            middle = (start+end)/2;
            if (vector[middle] == value)
                return middle;
            else if (vector[middle] > value)
                end = middle-1;
            else
                start = middle +1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vet[] = {1,3,5,7,9,11,13,15,17,19};
        int num;
        BuscaBinaria search = new BuscaBinaria();

        System.out.println("\n\n=================================================");
        System.out.print("Choose the number u want to find in vector: ");
        num = in.nextInt();
        System.out.println("The position in vector u seek is: " + search.binarySearch(vet, num));
        System.out.println("=================================================\n\n");
        in.close();
    }
}