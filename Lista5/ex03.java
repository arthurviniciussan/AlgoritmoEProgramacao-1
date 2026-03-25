// Arthur Vinícius Santos

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        int i = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número limite");
        int num = scan.nextInt();

        while (i <= num) {
            System.out.println(i);
            i = i * 2;
        }
        scan.close();
    }

}
