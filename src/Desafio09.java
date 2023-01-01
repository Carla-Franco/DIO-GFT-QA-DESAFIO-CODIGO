import java.util.Arrays;
import java.util.Scanner;

public class Desafio09 {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe um número: ");
    int numero = scan.nextInt();

    String numeroEmString = String.valueOf(numero);
    String[] split = numeroEmString.split("");

    int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();

    int multiplicacao = multiplicacaoDosDigitos(ints);
    int soma = somaDosDigitos(ints);
    int resultado = multiplicacao - soma;
    System.out.println("O resultado é: " + resultado);
}

public static int multiplicacaoDosDigitos(int[] ints) {
    int multiplicacao = 1;
    for (int i = 0; i < ints.length; i++) {
        multiplicacao *= ints[i];
    }

    return multiplicacao;
}

public static int somaDosDigitos(int[] ints) {
    int soma = 0;
    for (int i = 0; i < ints.length; i++) {
        soma += ints[i];
    }

    return soma;
}
}