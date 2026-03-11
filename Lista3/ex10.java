//Arthur Vinicius Santos
import java.util.Scanner;

public class ex10{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe 3 números: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int maior = Math.max(num1, Math.max(num2, num3));

        if(num1 == num2 && num2 == num3){
            System.out.println("os números são iguais");
        } else {
            System.out.println("O maior número é " + maior );
        }
}
}