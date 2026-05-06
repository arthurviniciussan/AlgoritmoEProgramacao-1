
import java.util.Scanner;

// Arthur Vinicius Santos
public class  ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[4];
        int[] vetorB = new int[7];
        
        System.out.println("Digite os 4 valores do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scan.nextInt();
        }

        System.out.println();
        System.out.println("Digite os 7 valores do vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = scan.nextInt();
        }


        // Contruindo o vetorC
        int[] vetorC = new int[vetorA.length + vetorB.length];
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i];            
        }
        
        int j = 0;
        for (int i = vetorA.length; i < vetorC.length; i++) {
            vetorC[i] = vetorB[j];
            j++;
        }

        System.out.println();
        System.out.println("Mostrando o vetor C: ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.println(vetorC[i]);
        }

         scan.close();

    }
    
}