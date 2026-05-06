import java.util.Random;

public class ex3 {
    
    public static void main(String[] args) {
        Random r = new Random();
        int[] lista = new int[10];
        
        System.out.println("Números gerados:");
        for(int i = 0; i < lista.length; i++) {
            lista[i] = r.nextInt(10);
            System.out.println(lista[i]);
        }
        
        int menor = lista[0];

        for(int i = 1; i < lista.length; i++) {
            if (lista[i] < menor) {
                menor = lista[i]; 
            }
        }

        System.out.println("\n\nO menor numero e: " + menor);
    }
}