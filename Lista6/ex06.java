// Arthur Vinícius Santos

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int escolha = 0;
		int candidato1 =  0;
		int candidato2 =  0;
		int candidato3 =  0;
		int candidato4 =  0;
		int votosNulos = 0;
		int votosBrancos = 0;


		for(int i = 1; i <= 10; i++){
			escolha = scan.nextInt();
			switch (escolha) {
				case 1: candidato1 += 1; break;
				case 2: candidato2 += 1; break;
				case 3: candidato3 += 1; break;
				case 4: candidato4 += 1; break;
				case 5: votosNulos += 1; break;
				case 6: votosBrancos += 1;
				default:
					break;
			}
		}
		System.out.printf("Total de votos para o Candidato 1 foi %d\n", candidato1);
		System.out.printf("Total de votos para o Candidato 2 foi %d\n", candidato2);
		System.out.printf("Total de votos para o Candidato 3 foi %d\n", candidato3);
		System.out.printf("Total de votos para o Candidato 4 foi %d\n", candidato4);

		System.out.println("Todos os votos brancos foram o total de " + votosBrancos);
		System.out.println("Todos os votos nulos foram o total de " + votosNulos);

		System.out.printf("\nO percentual de votos bracos e nulos é %d%", (votosBrancos + votosNulos) * 10);
		scan.close();
	}
}
