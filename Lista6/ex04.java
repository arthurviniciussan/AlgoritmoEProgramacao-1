// Arthur Vinícius Santos
import java.util.Scanner;
public class ex04 {
 public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	double mediaAltura = 0;
	double altura = 0;
	int idade = 0;

	System.out.println("Digite a altura e a idade dde 10 pessoas");
	for (int i = 1; i <= 10; i++) {
		System.out.println("Idade: ");
		idade = scan.nextInt();

		System.out.println("Altura: ");
		altura = scan.nextDouble();
		if (idade >= 50){
			mediaAltura += altura;
		}
	}
	System.out.println(mediaAltura);
	System.out.printf("A média da altura %.2f", mediaAltura / 10);
	scan.close();
 }
}
