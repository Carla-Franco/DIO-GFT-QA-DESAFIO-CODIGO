import java.util.Scanner;

public class Desafio08 {

    public static void main(String[] args) {
        final int SLICE = 4;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número de caso de testes");
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            System.out.println("Informe o número de amigos");
            int N = scanner.nextInt();
            System.out.println("Informe o número de fatias necessárias");
            int X = scanner.nextInt();

            int numPizzas = (N * X + 3) / 4;

            System.out.println(numPizzas);
        }
    }
    
}
