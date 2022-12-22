import java.util.Scanner;

public class Desafio03 {

    public static void main(String[] args) { 
 
        String[] nomesFila = new String[3]; 
        Scanner nome = new Scanner(System.in); 
        
    
     //TODO: Implemente uma condição que simule uma fila bancaria, gerando o nome a posição do cliente na fila:

         int posicao = 0;

     do {
        
         System.out.println("Nome");
         String nomeCliente = nome.next();
        
         System.out.println("Nome");
         String nomeCliente2 = nome.next();
        
         System.out.println("Nome");
         String nomeCliente3 = nome.next();
         
         
         posicao ++;
         System.out.println(nomeCliente + " - " + "esta na posicao: " + posicao);
         posicao ++;
         System.out.println(nomeCliente2 + " - " + "esta na posicao: " + posicao);
         posicao ++;
         System.out.println(nomeCliente3 + " - " + "esta na posicao: " + posicao);

         
   
     } while (posicao < 3);   

 }
    
}
