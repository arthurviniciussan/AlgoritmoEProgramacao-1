//Arthur Vinicius Santos
import java.util.Scanner;

public class ex04{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char plano;
        double salario;


        System.out.println("Insira o salário do funcionário");

        while (!scan.hasNextDouble()) {
            System.out.println("Digite um salário válido:");
            scan.next();
        }
        salario = scan.nextDouble();

        System.out.println("Insira uma letra correspondente a um plano de salário A, B ou C: ");

        do {
            plano = scan.next().toUpperCase().charAt(0);
            if (plano != 'A' && plano != 'B' && plano != 'C'){
                System.out.println("Coloque uma letra válida A, B ou C");
                
            }
        } while (plano != 'A' && plano != 'B' && plano != 'C');

        
        switch (plano) {
            case 'A': System.out.printf("Com o plano A você ganha um aumento de 10 porcento \n Novo Salário %.2f\n", salario *= 1.10); break;
            case 'B': System.out.printf("Com o plano B você ganha um aumento de 15 porcento \n Novo Salário %.2f\n", salario *= 1.15); break;
            case 'C': System.out.printf("Com o plano C você ganha um aumento de 20 porcento \n Novo Salário %.2f\n", salario *= 1.20); break;
            
            default: System.out.println("Letra inválida");break;
        }
        scan.close();
    }
}