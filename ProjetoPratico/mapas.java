public class mapas {
    public static void main(String[] args) throws InterruptedException {
        buildMapa(4);
    }

   
    public static void buildMapa(int sala) throws InterruptedException {
        switch (sala) {
            case 1 -> {
                System.out.println("* * * * * * * * * * * * * * * ");
                System.out.println("* * * * * * * * * * * * * * * ");
                for (int i = 0; i < 3; i++) {
                System.out.print("*" + "\u001B[31m" + " 1 " + "\u001B[0m" + "* * 2 * * 3 * * 4 * * 5 * ");
                
                Thread.sleep(500);
                for (int j = 0; j < 30; j++) {
                    System.out.print("\b");
                }
                System.out.print("*" + "\u001B[31m" + "  "+" " + "\u001B[0m" + "* * 2 * * 3 * * 4 * * 5 * ");
                
                Thread.sleep(500);

                for (int j = 0; j < 30; j++) {
                    System.out.print("\b");
                }
                }
                
                System.out.println();
            }
            case 2 -> {
                System.out.println("* * * * * * * * * * * * * * * ");
                System.out.println("* * * * * * * * * * * * * * * ");
                for (int i = 0; i < 3; i++) {
                System.out.print("* 1 * *" + "\u001B[31m" + "   "+"\u001B[0m"+"* * 3 * * 4 * * 5 * ");

                Thread.sleep(450);
                for (int j = 0; j < 30; j++) {
                    System.out.print("\b");
                }

                System.out.print("* 1 * *" + "\u001B[31m" + " 2 "+"\u001B[0m"+"* * 3 * * 4 * * 5 * ");

                Thread.sleep(450);
                for (int j = 0; j < 30; j++) {
                    System.out.print("\b");
                }
                }
                System.out.println();
            }
            case 3 -> {
                System.out.println("* * * * * * * * * * * * * * * ");
                System.out.println("* * * * * * * * * * * * * * * ");
                for (int i = 0; i < 4; i++) {
                System.out.print("* 1 * * 2 * *"+"\u001B[31m"+"   "+"\u001B[0m"+"* * 4 * * 5 * ");

                Thread.sleep(450);
                for (int j = 0; j < 30; j++) {
                    System.out.print("\b");
                }
                System.out.print("* 1 * * 2 * *"+"\u001B[31m"+" 3 "+"\u001B[0m"+"* * 4 * * 5 * ");

                Thread.sleep(450);
                for (int j = 0; j < 30; j++) {
                    System.out.print("\b");
                }

                }
                System.out.println();
            }
            case 4 -> {
                System.out.println("* * * * * * * * * * * * * * * ");
                System.out.println("* * * * * * * * * * * * * * * ");
                for (int i = 0; i < 4; i++) {
                System.out.print("* 1 * * 2 * * 3 * *"+"\u001B[31m"+"   "+"\u001B[0m"+"* * 5 * ");

                Thread.sleep(450);
                for (int j = 0; j < 30; j++) {
                    System.out.print("\b");
                }

                System.out.print("* 1 * * 2 * * 3 * *"+"\u001B[31m"+" 4 "+"\u001B[0m"+"* * 5 * ");

                Thread.sleep(450);
                for (int j = 0; j < 30; j++) {
                    System.out.print("\b");
                }
                }
                System.out.println();
            }
            case 5 -> {
                System.out.println("* * * * * * * * * * * * * * * ");
                System.out.println("* * * * * * * * * * * * * * * ");
                for (int i = 0; i < 4; i++) {


                System.out.print("* 1 * * 2 * * 3 * * 4 * *"+"\u001B[31m"+"   "+"\u001B[0m"+"* ");

                Thread.sleep(450);
                for (int j = 0; j < 30; j++) {
                    System.out.print("\b");
                }

                System.out.print("* 1 * * 2 * * 3 * * 4 * *"+"\u001B[31m"+" 5 "+"\u001B[0m"+"* ");
                
                Thread.sleep(450);
                for (int j = 0; j < 30; j++) {
                    System.out.print("\b");
                }
                }
                System.out.println();
            }

        
            default -> {
                System.out.println("ERRO! Número de sala inválido, apenas de 1 até 5");
            }
        }
    }

}
