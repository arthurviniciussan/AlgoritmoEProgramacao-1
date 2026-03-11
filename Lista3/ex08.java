package Lista3;

//Arthur Vinicius Santos
import java.util.Scanner;

public class ex08{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a senha");
        String senha = scan.nextLine();
        
        if (senha.equals("R10p5")){
            System.out.println("acesso concedido");
        }
        else {
            System.out.println("acesso negado");
        }
        scan.close();
    }
}