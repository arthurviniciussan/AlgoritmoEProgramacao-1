package Lista2;

// Arthur Vínicius Santos
import java.util.Scanner;
public class ex05 {
        public static void main(String[] args)
        {
            double nota1, nota2, nota3;
            double media;
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite as notas: ");
            nota1 = scan.nextDouble();
            nota2 = scan.nextDouble();
            nota3 = scan.nextDouble();
            media = nota1 + nota2 + nota3 / 3;
            String mediaformat = String.format("%.2f", media);
            System.out.println(mediaformat);
            scan.close();
        }

}
