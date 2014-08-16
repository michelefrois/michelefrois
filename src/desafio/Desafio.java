/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package desafio;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in); //Instancie o objeto       
        String[] vnome = new String[5]; //criei um vetor do tipo string de 5 posições
              
        // Entrada de Dados 
        for (int i=0; i<5; i++)       
       {
           System.out.printf("Informe o nome do %2do. aluno do total de 5: ", (i+1)); 
           vnome[i] = nome.nextLine(); 
       }
        
        System.out.println("Digite uma letra: ");
        String l = nome.nextLine();
        
        for (int i = 0; i < 5; i++)
        {
          if (l.charAt(0) == vnome[i].charAt(0)) //comparar a letra digitada com os nomes inseridos
          {
              System.out.println("Nome(s): " + vnome[i] );         
          }         
        }
             
        
    }
    
}
