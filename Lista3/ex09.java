//Arthur Vinicius Santos
import java.util.Scanner;

public class ex09{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double salarioBruto;
        double pretacao;

        System.out.println("Informe o salário bruto: ");
        salarioBruto = scan.nextDouble();

        System.out.println("Informe o valor da pretação: ");
        pretacao  = scan.nextDouble();

        if (pretacao > (salarioBruto * 0.30)){
            System.out.println("O empréstimo não pode ser concedido");
        }
        else{
            System.out.println("O empréstimo pode ser concedido");
        }
}
}