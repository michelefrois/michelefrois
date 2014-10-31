
package exercListaEncadeada;

import java.util.Scanner;

/**
 *
 * @author Lucas Oliveira
 */
public class listaEncadeada {
    public static void main(String[] args){
     
        Scanner e = new Scanner(System.in);
        System.out.print("Digite seu Nome: ");
        String nome  = e.nextLine();
        
        System.out.print("Digite o nome de uma pessoa especial: ");
        String nome2  = e.nextLine();
        
        ListaE le = new ListaE();
        
        le.InsertFirst(nome, nome2);
        le.print();
        
        
        System.out.println("---------------------------------------------");
        System.out.println("Deletamos o primeiro nome da Lista Encadeada!");
        System.out.println("---------------------------------------------");
        le.deletFirst();
        le.print();
        
        
        System.out.print("Qual nome está procurando? ");
        nome = e.nextLine();        
        le.findname(nome);
      
  }  
}

