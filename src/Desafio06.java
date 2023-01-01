import java.util.Scanner;

public class Desafio06 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Jogador");
        int jogadaJogador = leitor.nextInt();

        System.out.println("Inimigo");
        int jogadaInimigo = leitor.nextInt();

        if (jogadaJogador == jogadaInimigo) {
         System.out.println("Empatou");
        }

        else if (jogadaJogador == 2 && jogadaInimigo == 1 || 
        jogadaJogador == 3 && jogadaInimigo == 2 || 
        jogadaJogador == 1 && jogadaInimigo == 3) {
         System.out.println("Ganhou");

       } else {
         System.out.println("Perdeu");
       }   


    }

}
