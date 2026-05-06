
import java.util.Scanner;

// Arthur Vinicius Santos
public class  ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] listaNomes = new String[5];

        for (int i = 0; i < listaNomes.length; i++) {
            System.out.println("Digite o nome: " + (i + 1));
            listaNomes[i] = scan.next();
        }
        System.out.println();

        System.out.println("Nomes do último para o primeiro: ");


        int reverse = listaNomes.length;
        for (int i = 0; i < listaNomes.length; i++) {
            System.out.println(listaNomes[reverse - 1 ]);
            reverse--;    
        }

        System.out.println();
        System.out.println("O primeiro e o ultimo nome da lista: ");
        
        System.out.println(listaNomes[0]);
        System.out.println(listaNomes[4]);
       

    }
    

    
}