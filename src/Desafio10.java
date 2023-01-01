import java.util.Scanner;

public class Desafio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int dados = leitor.nextInt();
        System.out.println("Informe um número: ");
        int vidaDoJogador = leitor.nextInt();
        System.out.println("Informe um número: ");
        int ataqueDoJogador = leitor.nextInt();
        System.out.println("Informe um número: ");
        int defesaDoJogador = leitor.nextInt();
        System.out.println("Informe um número: ");
        int vidaDoInimigo = leitor.nextInt();
        System.out.println("Informe um número: ");
        int ataqueDoInimigo = leitor.nextInt();

        vidaDoJogador -= ataqueDoInimigo - (defesaDoJogador + dados);

        if (vidaDoJogador > 0) {

            vidaDoInimigo -= ataqueDoJogador + dados;

            if (vidaDoInimigo <= 0) {
                System.out.println("Jogador sobreviveu e derrotou o inimigo");
            } else {
                System.out.println("Jogador sobreviveu e nao derrotou o inimigo");
            }
        } else {
            System.out.println("Jogador nao sobreviveu");
        }
    }
}