// Arthur Vinícius Santos

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        int i = 1;
        int num;
        int par = 0;
        int impar = 0;
        Scanner scan = new Scanner(System.in);
        while (i <= 10) {
            System.out.println("Digite o 1° número");
            num = scan.nextInt();
            if (num % 2 == 0) { par++; } else { impar++; }
            i++;

            System.out.println("Digite o 2° número");
            num = scan.nextInt();
            if (num % 2 == 0) { par++; } else { impar++; }
            i++;

            System.out.println("Digite o 3° número");
            num = scan.nextInt();
            if (num % 2 == 0) { par++; } else { impar++; }
            i++;

            System.out.println("Digite o 4° número");
            num = scan.nextInt();
            if (num % 2 == 0) { par++; } else { impar++; }
            i++;

            System.out.println("Digite o 5° número");
            num = scan.nextInt();
            if (num % 2 == 0) { par++; } else { impar++; }
            i++;

            System.out.println("Digite o 6° número");
            num = scan.nextInt();
            if (num % 2 == 0) { par++; } else { impar++; }
            i++;

            System.out.println("Digite o 7° número");
            num = scan.nextInt();
            if (num % 2 == 0) { par++; } else { impar++; }
            i++;

            
            System.out.println("Digite o 8° número");
            num = scan.nextInt();
            if (num % 2 == 0) { par++; } else { impar++; }
            i++;

            
            System.out.println("Digite o 9° número");
            num = scan.nextInt();
            if (num % 2 == 0) { par++; } else { impar++; }
            i++;
            
            System.out.println("Digite o 10° número");
            num = scan.nextInt();
            if (num % 2 == 0) { par++; } else { impar++; }
            i++;
        }

        System.out.println("O total de pares é: " + par );
        System.out.println("O total de ímpares é: " + impar );
        scan.close();
    }
}