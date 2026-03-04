// Arthur Vínicius Santos
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args)
    {
        int num1;
        int num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        num1 = scan.nextInt();
        System.out.println("Digite o segundo número");
        num2 = scan.nextInt();
        System.out.printf("O produto de %d e %d é: %d", num1,num2,num1*num2);
    }
}
