/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package er1;

/**
 *
 * @author aleaguado
 */
import java.util.Scanner;


/**
 *
 * @author aleaguado
 */
public class Usuaria {
  
    public static void main(String[] args)
          {
              int maxSize = 100;            // coloca em uma constante o tamanho do vetor
              Estrutura arr = new Estrutura(maxSize); // instancia a estrutura de dados
              Scanner entrada = new Scanner (System.in); //Instancio o objeto entrada do tipo Scanner
             // Scanner entradanum = new Scanner (System.in);
              System.out.println("Seja Bem Vindo Jogadores!!!");
              
              for (int i = 0; i < 2; i++) {
                System.out.println("\nDigite o nome do " + i + "° jogador: ");
                String nome = entrada.nextLine();                  
                 
                System.out.println("Digite a altura do " + i + "° jogador: ");
                double altura = entrada.nextDouble();
                  
                System.out.println("Digite a idade do " + i + "° jogador: ");
                int idade = entrada.nextInt();
                 
                entrada.nextLine();  
                 
                 arr.insert(nome, altura, idade);
              }
              
              System.out.println("\n\n");
              arr.display();
              System.out.println("\n Muito Bem! Agora que você cadastrou os Jogadores, digite uma Idade: ");
          
              System.out.println("\n \nDigite a idade a ser pesquisada: ");  
              int buscaid = entrada.nextInt();             
              
              if(arr.findByIdade(buscaid) == 0)
              {
                System.out.println(buscaid + " ---> Idade não encontrada!!!");  
              }
              
              System.out.println("\nDigite um nome a ser pesquisado: "); 
              entrada.nextLine();
              
              String nome = entrada.nextLine();
              arr.findNome(nome);
              
              arr.display();
          }    
    
          
}