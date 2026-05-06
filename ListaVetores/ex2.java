
import java.util.Scanner;

// Arthur Vinicius Santos
public class  ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] listaNum = new int[10];
        for (int i = 0; i < listaNum.length; i++) {
            System.out.println("Digite o número: " + (i + 1));
            listaNum[i] = scan.nextInt();
        }

        System.out.println();
        
        System.out.println("pares");
        for (int i = 0; i < listaNum.length; i++) {
            if(listaNum[i] % 2 == 0) {
                System.out.println(listaNum[i]);
            }
        }

        System.out.println();

        System.out.println("ímpares");
        for (int i = 0; i < listaNum.length; i++) {
            if(!(listaNum[i] % 2 == 0)) {
                System.out.println(listaNum[i]);
            }
        }
    }
    
}