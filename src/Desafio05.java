import java.util.Scanner;

public class Desafio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
    //TODO: Crie as outras condições necessárias para a resolução do desafio.
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();    

        int minimoMultiplo = 0;
        if (numero % 2 == 0) {
          minimoMultiplo = numero;
        } else {
          minimoMultiplo = numero * 2;
        }
    
        System.out.println("O resultado eh:" + minimoMultiplo);
      }
    
}
