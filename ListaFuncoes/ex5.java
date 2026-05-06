// Arthur Vinicius Santos
public class ex5 {
    public static void main(String[] args) {
        // Sucesso
        System.out.println(exibirSemana(1));
        System.out.println(exibirSemana(2));
        System.out.println(exibirSemana(3));
        System.out.println(exibirSemana(4));
        System.out.println(exibirSemana(5));
        System.out.println(exibirSemana(6));
        System.out.println(exibirSemana(7));
        
        // Erro 
        System.out.println(exibirSemana(8));
        System.out.println(exibirSemana(0));
    }

    public static String exibirSemana(int num)
     {
        if (num < 1 || num > 7) {
            return "Dia da semana inválido";
        }
        switch (num) {
            case 1 -> { return "Domingo"; }
            case 2 -> { return "Segunda"; }
            case 3 -> { return "Terça";   }
            case 4 -> { return "Quarta";  }
            case 5 -> { return "Quinta";  }
            case 6 -> { return "Sexta";   }
            case 7 -> { return "Sábado";  }
            default -> {}
        }
        return "Erro... ";
     }

}
