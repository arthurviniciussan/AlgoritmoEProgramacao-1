// Arthur Vinicius Santos

import java.util.Scanner;

public class  ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        System.out.println("Digite os 5 valores do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scan.nextInt();
        }

        int[] vetorB = new int[vetorA.length];
        System.out.println();
        System.out.println("Digite os 5 valores do vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = scan.nextInt();
        }

        // Motando o Vetor C
        int[] vetorC = new int[vetorA.length];
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] - vetorB[i];
        }

        // Mostrando o Vetor C
        System.out.println();
        System.out.println("Mostrando o Vetor C");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.println(vetorC[i]);
        }
        scan.close();
    }
    
}