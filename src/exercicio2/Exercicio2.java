/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio2 {

   
    public static void main(String[] args) {
      
        int maxSize = 5;             // coloca em uma constante o tamanho do vetor
      EstruturaDados arr;                // cria referencia para a estrutura de dados
      arr = new EstruturaDados(maxSize); // instancia a estrutura de dados
      Scanner nome = new Scanner(System.in); //Instancie o objeto
          System.out.println("Seja Bem ao Exercício 2!!!");
     
      //Pedir para o usuario digitar 5 nomes
       for (int i=1; i<maxSize; i++)       
       {
           System.out.printf("Informe o nome do " + i + "º aluno do total de 5: "); 
           arr.insert(nome.nextLine());
       }
      
       arr.display();
       
       System.out.println("Muito Bem! Agora que você cadastrou os nomes, digite uma letra");

              if (!arr.displayFirst(nome.nextLine()))
                  System.out.println("Não encontrado nenhum nome!!");
              
              System.out.println("Digite um nome para buscar:");
              
              if (arr.buscaA(nome.nextLine()))
                    System.out.println("Encontrei!!!");
              else
                    System.out.println("Não encontrado");
              
              System.out.println("Digite um nome ser removido:");
              
              if (arr.delete(nome.nextLine()))   
                    System.out.println("Removido!!!");
              else  
                   System.out.println("Não encontrado!!!");  
              
              arr.display();
    }

}    
    
    
    
    
    
