// Arthur Vinicius Santos
import java.util.Random;
import java.util.Scanner;

public class ex2{
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scan = new Scanner(System.in);
        int sorteio = r.nextInt(0, 50);
        int tentativa = 1;

        

        System.out.println("Digite o seu palpite");
        int palpite = scan.nextInt();
        while (sorteio != palpite) {
            if (palpite < sorteio) {
                System.out.println("O número é maior");
            }
            else if (palpite > sorteio){
                System.out.println("Número é menor");
            }

            System.out.println("Digite de novo");
            tentativa++;
            
            palpite = scan.nextInt();
        }


        System.out.println("ACERTOU em " + tentativa + " tentativas!");
        scan.close();
    }
    
}
