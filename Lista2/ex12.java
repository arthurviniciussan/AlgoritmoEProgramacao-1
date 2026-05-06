// Arthur Vínicius Santos
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double num = scan.nextDouble();
        double numel2 = Math.pow(num, 2);
        double numel3 = Math.pow(num, 3);
        double raiz = Math.sqrt(num);
        double numele10 = Math.pow(num, 10);
        System.out.println("O número elevado ao quadrado: " + numel2);
        System.out.println("O número elevado ao cubo: " + numel3);
        System.out.println("A raiz quadrada do número: " + raiz);
        System.out.println("O número elevado a décima poténcia: " + numele10);
        scan.close();
    }
}
