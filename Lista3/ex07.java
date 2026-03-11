package Lista3;

//Arthur Vinicius Santos
import java.util.Scanner;

public class ex07{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos anos completos o funcionário trabalhou? ");
        int anos = scan.nextInt();

        System.out.println("Qual o salario dele? ");
        double salario = scan.nextDouble();
        double aumento20 = salario * 0.20;
        double aumento10 = salario * 0.10;

        if (anos > 5) {
            System.out.println("Por ter mais de 5 anos o funcionário recebeu um aumento de 20% no salário");
            System.out.printf("Novo salário %.2f\n", salario + aumento20);
        } else {
            System.out.println("Por ter ter menos de 5 anos na empresa, o funcionário recebeu um aumento de apenas 10% no salário");
            System.out.printf("Novo salário %.2f\n", salario + aumento10);
        }
        scan.close();

    }
}