
package exercListaEncadeada;

import java.util.Scanner;

/**
 *
 * @author Lucas Oliveira
 */
public class listaEncadeada {
    public static void main(String[] args){
     
        Scanner e = new Scanner(System.in);
        
        /*
        System.out.print("Digite seu Nome: ");
        String nome  = e.nextLine();
        
        System.out.print("Digite o nome de uma pessoa especial: ");
        String nome2  = e.nextLine();
        
        ListaE le = new ListaE();
        
        le.InsertFirst(nome, nome2);
        le.print();
        */
        
        ListaE le = new ListaE();
        le.InsertFirst("Michele",  "Lucas");
        le.InsertFirst("Camila",   "Júlia");
        le.InsertFirst("Ana",      "Rafael");
        le.InsertFirst("Lívia",    "Adriano");
        le.InsertFirst("Carla",    "Paulo");
        
        le.print();
        
        System.out.println("\n---------------------------------------------");
        System.out.println("Deletamos o primeiro nome da Lista Encadeada!");
        System.out.println("---------------------------------------------");
        le.deletFirst();
        le.print();
        
        /*
        System.out.print("Qual nome está procurando? ");
        nome = e.nextLine();        
        le.findname(nome);
        */
        
        System.out.println("\n--------------------------------------------------------");
        System.out.println("Buscando o nome Michele e o nome de sua pessoa especial!");
        System.out.println("--------------------------------------------------------");
        
        le.findname("Michele");
         
        
        
  }  
}

