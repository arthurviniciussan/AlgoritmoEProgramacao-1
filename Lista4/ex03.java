//Arthur Vinicius Santos
import java.util.Scanner;

public class ex03{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char periodo = ' ';
        String saudacao;

        System.out.println("Insira uma letra correspondente a um período M, V ou N: ");

        do{
            periodo = scan.next().toUpperCase().charAt(0);
            if (periodo != 'M' && periodo != 'N' && periodo != 'V'){
                System.out.println("Coloque uma letra válida M, V ou N");
                
            }
        } while (periodo != 'M' && periodo != 'N' && periodo != 'V');

        
        switch (periodo) {
            case 'M': saudacao = "bom dia"; break;
            case 'V': saudacao = "boa tarde"; break;
            case 'N': saudacao = "boa noite"; break;
            
            default: saudacao = "Letra inválida";break;
        }
        System.out.println(saudacao);
        scan.close();
    }
}