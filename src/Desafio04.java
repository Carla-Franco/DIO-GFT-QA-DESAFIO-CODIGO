import java.util.Scanner;

public class Desafio04 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
            
        //TODO:  Retorne o percentual de desconto que foi aplicado no produto
          
        System.out.println("Digite o valor do produto: ");
        float M = input.nextFloat();

        System.out.println("Digite o valor do produto com desconto: ");
        float S = input.nextFloat();
        
        float calc = 100 / M;
        float calc2 = M - S;
        float percentual = calc * calc2;

        int percentual1 = Math.round(percentual);

        
        System.out.print("O desconto foi de " + percentual1 + "%");
      
    }
    
}
