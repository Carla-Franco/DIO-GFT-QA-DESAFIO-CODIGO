import java.util.Scanner;

public class Desafio01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

       int soma = 0;
       int media = 0;
       int cont = 0;
       
       do {
         
         System.out.println("Digite uma idade: ");
         int idade1 = leitor.nextInt();
         
         System.out.println("Digite uma idade: ");
         int idade2 = leitor.nextInt();
         
         System.out.println("Digite uma idade: ");
         int idade3 = leitor.nextInt();
         
         soma = idade1 + idade2 + idade1;
      
         cont = idade3;
         
       } while (cont < 3);
       
       media = soma / 3;
         
       if (media <= 25) 
       System.out.println("Jovem!");
       
       else if (media > 25 && media <= 60)
       System.out.println("Adulto!");
       
       else
       System.out.println("Idoso!");
        
    }
    
}
