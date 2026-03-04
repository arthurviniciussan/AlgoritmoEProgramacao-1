// Arthur Vínicius Santos
import java.util.Scanner;
import java.time.LocalDate;

public class ex11 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int anoAtual = LocalDate.now().getYear(); 
        int anoNasc;
        System.out.println("Qual o seu ano de nascimento?");
        anoNasc = scan.nextInt();
        System.out.println("Estamos em " + anoAtual);
        int idade = anoAtual - anoNasc; 
        int idade2030 = 2030 - anoNasc;
        System.out.println("Você tem " + idade + " anos");
        System.out.println("Em 2030 Você terá " + idade2030 + " anos");
        scan.close();
    }
}
