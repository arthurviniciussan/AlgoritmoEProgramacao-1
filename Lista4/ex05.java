package Lista4;

//Arthur Vinicius Santos
import java.util.Scanner;

public class ex05{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char opcao;
        double num1;
        double num2;
        double res = 0;

        System.out.println("Insira o primeiro número: ");

        while (!scan.hasNextDouble()) {
            System.out.println("Digite um número valido:");
            scan.next();
        }
        num1 = scan.nextDouble();


        System.out.println("Insira o segundo número: ");

        while (!scan.hasNextDouble()) {
            System.out.println("Digite um número valido:");
            scan.next();
        }

        num2 = scan.nextDouble();

        System.out.println("Insira uma letra correspondente a uma opção M, S, P ou D: ");

        do {
            opcao = scan.next().toUpperCase().charAt(0);
            if (opcao != 'M' && opcao != 'S' && opcao != 'P' && opcao != 'D'){
                System.out.println("Coloque uma letra válida M, S, P ou D");
                
            }
        } while (opcao != 'M' && opcao != 'S' && opcao != 'P' && opcao != 'D');

        
        switch (opcao) {
            case 'M': res = (num1 + num2) / 2; break;

            case 'S': if (num1 < num2) {
                res = num2 - num1;
                } else {
                res = num1 - num2;
                }; 
                break;

            case 'P': res = num1 * num2; break;

            case 'D': if (num1 == 0) {
                res = 0;
                System.out.println("Imporssível Dividir");
                } else {
                res = num1 / num2;
                }; 
            break;
            
            default: System.out.println("Letra inválida");break;
        }
        System.out.println("O resultado é " + res);
        scan.close();
    }
}