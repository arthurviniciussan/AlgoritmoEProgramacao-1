package Lista4;

//Arthur Vinicius Santos
import java.util.Scanner;

public class ex01{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dia;
        String nomeDia;

        System.out.println("Insira o número do dia: ");

        while (true){
            if (!scan.hasNextInt()){
                System.out.println("Coloque um número");
                scan.next();
                continue;
            }
            else {
                dia = scan.nextInt();
                break;
            }
        }

        switch (dia) {
            case 1: nomeDia = "Domingo";break;
            case 2: nomeDia = "Segunda";break;
            case 3: nomeDia = "Terça";break;
            case 4: nomeDia = "Quarta";break;
            case 5: nomeDia = "Quinta";break;
            case 6: nomeDia = "Sexta";break;
            case 7: nomeDia = "Sábado";break;
            default: nomeDia = "Dia inválido";break;
        }
        System.out.println(nomeDia);
        scan.close();
    }
}