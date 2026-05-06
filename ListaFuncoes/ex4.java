// Arthur Vinicius Santos
import java.util.Scanner;


public class ex4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números ");
        int num = 0;
        for(int i = 0; i < 2; i++) {
            num = scan.nextInt();
            isPar(num);
        }

    }

    public static boolean isPar(int num) {
        if(num % 2 == 0 ) {
            System.out.println("número par");
            return true;
        }
        System.out.println("número ímpar");
        return false;
    }

}
