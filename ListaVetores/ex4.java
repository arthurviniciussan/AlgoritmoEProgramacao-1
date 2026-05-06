// Arthur Vinicius Santos

import java.util.Scanner;

public class  ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        System.out.println("Digite os 5 valores do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scan.nextInt();
        }

        int[] vetorB = new int[vetorA.length];
        System.out.println();
        System.out.println("elementos do vetor B são os mesmo do vetor A * 3: ");
        for (int i = 0; i < vetorB.length; i++) {
           vetorB[i] = (vetorA[i] * 3);
        }

        // Mostrando os elementos do Vetor B
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i]);
        }
        scan.close();
    }
    
}