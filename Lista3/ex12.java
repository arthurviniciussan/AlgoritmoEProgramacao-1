package Lista3;

//Arthur Vinicius Santos
import java.util.Scanner;

public class ex12{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

       System.out.println("Digite o seu salário para saber o desconto do INSS");
       double salario = scan.nextDouble();
       
       if (salario < 600){
        System.out.println("Isento");
       }

       else if  (salario >= 600 && salario <= 1200){
        System.out.printf("Desconto de %.2f no seu salário", salario * 0.20);
       }

       else if (salario >= 1200 && salario <= 2000){
        System.out.printf("Desconto de %.2f no seu salário", salario * 0.25);
       }

       else {
        System.out.printf("Desconto de %.2f no seu salário", salario * 0.30);
       }
       scan.close();
}
}