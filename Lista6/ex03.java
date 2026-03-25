// Arthur Vinícius Santos
import java.util.Scanner;
public class ex03 {
 public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("Digite um número: ");
	int num = scan.nextInt();

	System.out.print("Sequência: ");
	for(int i = 1; i <= num; i++){
		System.out.printf("%d ", i);
	}
	scan.close();
 }
}
