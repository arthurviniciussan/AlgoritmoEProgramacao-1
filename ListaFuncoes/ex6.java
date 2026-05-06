// Arthur Vinicius Santos
public class ex6 {

    public static void main(String[] args) {
        int[] listaNum = new int[] {1,2,3,4,5,6,7,8,9};
        System.out.println("O maior valor: " + maiorValor(listaNum)); // 9
        System.out.println("O menor valor: " + menorValor(listaNum)); // 1
        System.out.println("O valor mediano: " + mediaLista(listaNum)); // 1 + 9 = 10 / 2 = 5

        int[] listaNum2 = new int[] {44,23,555,4234,562,43212,7788,976, 2147483647};
        System.out.println("O maior valor: " + maiorValor(listaNum2)); // maior int posivel
        System.out.println("O menor valor: " + menorValor(listaNum2)); // 23
        System.out.println("O valor mediano: " + mediaLista(listaNum2)); // -1073741813 
        // porque 2147483647 + 23 = -2147483626 / 2 = -1073741813

    }

    public static int maiorValor(int[] lista) {
        int max = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > max) {
                max = lista[i];
            }
        }
        return max;
    }

    public static int menorValor(int[] lista) {
        int min = maiorValor(lista);

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < min) {
                min = lista[i];
            }           
        }
        return  min;
    }

    public static int mediaLista(int[] lista) {
        int media = (maiorValor(lista) + menorValor(lista)) / 2 ;
        return media;
    }
}
