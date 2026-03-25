// Arthur Vinícius Santos

import java.util.Scanner;

public class ex05 {
 public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
  double media;
	int alunosAprovados = 0;
	int alunosExame = 0;
	int alunosReprovados = 0;
	double mediaClasse = 0;

	for(int i = 1; i <= 6; i++){
		System.out.println("Digite a primera nota do aluno");
    double nota1 = scan.nextDouble();

    do {
    if (nota1 < 0 || nota1 > 10) {
    System.out.println("Valor de nota1 inválido");
    nota1 = scan.nextDouble();
    }
    } while (nota1 < 0 || nota1 > 10);


    System.out.println("Digite a segunda nota do aluno");
    double nota2 = scan.nextDouble();

    do {
    if (nota2 < 0 || nota2 > 10) {
    System.out.println("Valor de nota2 inválido");
    nota2 = scan.nextDouble();
    }
    } while (nota2 < 0 || nota2 > 10);

    media = (nota1 + nota2) / 2;

    System.out.printf("A média do aluno foi %.2f \n", media);
		if (media <= 3){
				System.out.println("REPROVADO");
				alunosReprovados++;
		}
		else if (media > 3 && media < 7) {
			System.out.println("EXAME");
			alunosExame++;
		}
		else {
			System.out.println("APROVADO");
			alunosAprovados++;
		}
		mediaClasse += media;
	}
	System.out.printf("\nTotal de alunos aprovados %d\n", alunosAprovados);

	System.out.printf("Total de alunos de exame %d\n", alunosExame);

	System.out.printf("Total de alunos reprovados %d\n", alunosReprovados);

	System.out.printf("A média da classe foi %.2f\n", mediaClasse / 6);

	scan.close();
 }
}
