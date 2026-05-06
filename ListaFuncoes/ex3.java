// Arthur Vinicius Santos
import java.util.Scanner;

public class ex3 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = scan.nextInt();

        System.out.println("O maior número dentre " + num1 + " e " + num2 + " é " + encontrarMax(num1, num2) );
        scan.close();
    }

    public static int encontrarMax(int num1, int num2) {
        int max = 0;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
        return max;
    }
    
}
