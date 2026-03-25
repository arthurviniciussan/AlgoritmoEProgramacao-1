// Arthur Vinícius Santos

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        int i = 1;
        int result = 2147483647;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 10 número inteiros e positivos");
        while (i <= 10) {
        
            int num = scan.nextInt();
    
            if (num < result) {
                result = num;
            }
            i++;
        }
        System.out.println("O menor número é " + result);
      
        scan.close();
    }

}
