
import java.util.Scanner;

// Arthur Vinicius Santos
public class  ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 10 número para armazenar dentro do vetor: ");
        int[] lista = new int[10];
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Digite o número " + (i + 1));
            lista[i] = scan.nextInt();
        }
        System.out.println("A lista completa ficou assim: ");

        for (int i = 0; i < lista.length; i++) {
            System.out.println("numero: " + (i + 1) + " = " + lista[i]);
            System.out.println();
        }
        scan.close();
    }

}