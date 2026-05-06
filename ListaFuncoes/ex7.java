// Arthur Vinicius Santos
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número para ver o fatorial dele: ");
        int num = scan.nextInt();
        System.out.println("Fatorial de: " + num);
        System.out.println(calcularFatorial(num));
        scan.close();
    }

    public static int calcularFatorial(int num) {
        int factor = num;
        int limite = num;
        if (num == 0) {
            return 1;
        }
        for(int i = 1; i < limite; i++){
            factor *= num - 1;
            num--; 
        }
        return factor;
    }

}
