// Arthur Vinícius Santos

import java.util.Scanner;

public class ex07 {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int idade = 0;
	double altura = 0;
	int peso = 0;
	int maior50 = 0;
	double mediaAltura = 0;
	int inferior40kl = 0;
	int contadorAltura = 0;


	for (int i = 1; i <= 10; i++){
		System.out.println("Digite a idade: ");
		idade = scan.nextInt();
		System.out.println("Digite a altura: ");
		altura = scan.nextDouble();
		System.out.println("Digite a peso: ");
		peso = scan.nextInt();
		if (idade >= 50)
			maior50 += 1;
		if (idade >= 10 && idade <= 20){
			mediaAltura += altura;
			contadorAltura += 1;
		}
		if (peso < 40)
			inferior40kl += 1; 
	}
	System.out.println("Quantidade de pessoas maiores que 50 anos " + maior50);

	if (contadorAltura > 0) 
    System.out.println("Média de altura das pessoas com idade entre 10 e 20 anos: " + mediaAltura / contadorAltura);
  else
    System.out.println("Nenhuma pessoa com idade entre 10 e 20 anos foi encontrada.");

	System.out.printf("A porcentagem de pessoas com peso inferior a 40 quilos: %d %", inferior40kl * 10);
	scan.close();
 }
}
