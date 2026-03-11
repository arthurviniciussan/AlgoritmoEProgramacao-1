
//Arthur Vinicius Santos
import java.util.Scanner;

public class ex11{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a idade do nadador");
        int idade = scan.nextInt();
        if (idade > 18){
            System.out.println("Sênior");
        }

        if (idade >= 5 && idade <= 7){
            System.out.println("infantil A");
        }    

        if (idade >= 8 && idade <= 10){
            System.out.println("infantil B");
        } 
         
        if (idade >= 11 && idade <= 13){
            System.out.println("juvenil A");
        }

        if (idade >= 14 && idade <= 17){
            System.out.println("juvenil B");
        }
        
        if (idade < 5)
        {
            System.out.println("Não tem idade para nadar");
        }
        scan.close();
}
}