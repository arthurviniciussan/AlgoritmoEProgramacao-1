package Lista2;

// Arthur Vínicius Santos
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args)
    {
        int num1, num2, num3, num4;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 4 números separados por um ENTER");
        num1 = scan.nextInt();

        num2 = scan.nextInt();

        num3 = scan.nextInt();

        num4 = scan.nextInt();


        System.out.printf("a soma dos números é %d", num1+num2+num1+num2);
    }
}
