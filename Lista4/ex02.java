package Lista4;

//Arthur Vinicius Santos
import java.util.Scanner;

public class ex02{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mes;
        String nomeMes;

        System.out.println("Digite um número que represente o mês");

         while (true){
            if (!scan.hasNextInt()){
                System.out.println("Coloque um número que represente o mês");
                scan.next();
                continue;
            }
            else {
                mes = scan.nextInt();
                break;
            }
        }

        switch (mes) {
            case 1: nomeMes = "Janeiro";break;
            
            case 2: nomeMes = "Fevereiro";break;
            
            case 3: nomeMes = "Março";break;
            
            case 4: nomeMes = "Abril";break;
            
            case 5: nomeMes = "Maio";break;
            
            case 6: nomeMes = "Junho";break;
            
            case 7: nomeMes = "Julho";break;
            
            case 8: nomeMes = "Agosto";break;
            
            case 9: nomeMes = "Setembro";break;
            
            case 10: nomeMes = "Outubro";break;

            case 11: nomeMes = "Novembro";break;

            case 12: nomeMes = "Dezembro";break;
            default: nomeMes = "Mês Iválido";break;
        }
        System.out.println(nomeMes);
        scan.close();
    }
}