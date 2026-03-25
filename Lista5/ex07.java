import java.util.Scanner;
public class ex07 {
    public static void main(String[] args) {
        int i = 1;
        int pessoasNãoObesas = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a altura e peso de 10 pessoas");
        while (i <= 10) {

            System.out.println("Digite o peso");
            double peso = scan.nextDouble();
            
            System.out.println("Digite o altura");
            double altura = scan.nextDouble();

            System.out.println("Outra pessoa\n");
            double imc = peso / (altura * 2);

            if (imc >= 18.5 && imc <= 24.9){
                pessoasNãoObesas++;
            }
            i++;
        }
        System.out.printf("Existem %d pessoas que não estão obesas", pessoasNãoObesas);
        scan.close();
    }
}
