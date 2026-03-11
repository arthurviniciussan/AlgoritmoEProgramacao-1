//Arthur Vinicius Santos
import java.util.Scanner;

public class ex13{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double num1;
        double num2;
        char sinal;

        System.out.println("Calculadora simples!!!!");
        System.out.println("Informe o primeiro número");
        num1 = scan.nextDouble();

        System.out.println("Informe o segundo número");
        num2 = scan.nextDouble();

        System.out.println("Informe o sinal da operação: + - * /");
        sinal = scan.next().charAt(0);

        if (sinal == '+'){
            System.out.println(num1 + num2);
        }
        
        else if (sinal == '-'){
            System.out.println(num1 - num2);
        }

        
        else if (sinal == '*'){
            System.out.println(num1 * num2);
        }

        else if (sinal == '/'){
            if (num1 <= 0){
                System.out.println("Impossível dividir");
            } 
            else {
            System.out.println(num1 / num2);
            }
        } 
        else {
            System.out.println("Sinal Inválido");
        }
}
}