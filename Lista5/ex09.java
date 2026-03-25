
//Arthur Vinicius Santos
import java.util.Scanner;

public class ex09{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int codigo = 0;
        int quantidade = 0;
        double valorTotalCompra = 0;
        double valorPago = 0;
        String nomeProduto = " ";
        boolean continuar = true;
        
        
        while (continuar) {
            
        
        System.out.println("-- Cardápio --");
        System.out.println("Código   Produto        Preço");
        System.out.println("100 - Cachorro Quente   R$1,20\n101 - Bauro Simples     R$1,30");
        System.out.println("102 - Bauro com ovo     R$1,50\n103 - Hambúrguer        R$1,20\n104 - Cheeseburguer     R$1,30");
        System.out.println("105 - Refrigerante      R$1,00\n");
        
        System.out.println("Insira o código do produto: ");
        do {
            while (!scan.hasNextInt()) {
        		System.out.println("Digite um número válido:");
        		scan.next();
    		}

    		codigo = scan.nextInt();

    		if (codigo < 100 || codigo > 105) {
       		 System.out.println("Digite um código entre 100 e 105.");
   		 	}

				} while (codigo < 100 || codigo > 105);

        System.out.println("Insira a quantidade: ");
        while (!scan.hasNextInt()) {
            System.out.println("Digite um número valido:");
            scan.next();
        }
        quantidade = scan.nextInt();

        switch (codigo) {
            case 100:
                valorPago = quantidade * 1.20;
                nomeProduto = "Cachorro Quente";
                break;

            case 101:
                valorPago = quantidade * 1.30;
                nomeProduto = " Bauro Simples";
								break;

            case 102:
                valorPago = quantidade * 1.50;
                nomeProduto = "Bauro com ovo";
                break;

            case 103:
                valorPago = quantidade * 1.20;
                nomeProduto = "Hambúrguer";
								break;

            case 104:
                valorPago = quantidade * 1.30;
                nomeProduto = "Cheeseburguer";
                break;

            case 105:
                valorPago = quantidade * 1.00;
                nomeProduto = "Refrigerante";
								break;

            default:
                break;
        }
        valorTotalCompra += valorPago;
        System.out.printf("Você comprou %d %s\n", quantidade, nomeProduto);
        System.out.println("E pagou R$" + valorPago);

        System.out.println("Você continuar comprando? (s ou n)");
         char letra = scan.next().toLowerCase().charAt(0);
         if (letra == 's') {
            continuar = true;
         }
         else {
            continuar = false;
         }
    }
           System.out.printf("\nValor total da compra: R$%.2f\n", valorTotalCompra);
           System.out.println("Obrigado e volte sempre!");
        scan.close();
    }
}