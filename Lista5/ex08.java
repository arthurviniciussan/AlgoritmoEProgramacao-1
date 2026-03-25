import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) {

        
        Scanner scan = new Scanner(System.in);
        int i = 1;
        double media;

        while (i <= 5) {

            System.out.println("Digite a primera nota do aluno");
            double nota1 = scan.nextDouble();

            do {
            if (nota1 < 0 || nota1 > 10) {
            System.out.println("Valor de nota1 inválido");
            nota1 = scan.nextDouble();
            }
            } while (nota1 < 0 || nota1 > 10);



            System.out.println("Digite a segunda nota do aluno");
            double nota2 = scan.nextDouble();

            do {
            if (nota2 < 0 || nota2 > 10) {
            System.out.println("Valor de nota2 inválido");
            nota2 = scan.nextDouble();
            }
            } while (nota2 < 0 || nota2 > 10);

            media = (nota1 + nota2) / 2;

            System.out.printf("A média do aluno foi %.2f \n", media);

            i++;
    }
    scan.close();
    }
}
