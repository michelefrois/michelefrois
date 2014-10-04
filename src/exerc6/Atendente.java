
package exerc6;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Atendente {
    public static void main(String[] args)
      {           
      Scanner e = new Scanner(System.in);
          System.out.print("Digite a quantidade de pacientes: ");
          int max  = e.nextInt();   
      
          FilaPrioridade fila = new FilaPrioridade(max);
          
          for(int i=1; i<=max; i++){
            
           e.nextLine();
            System.out.print("\nDigite o nome do paciente: ");
            String nome = e.nextLine();
          
            System.out.print("Digite 1 se o paciente estiver COM FEBRE ou 0 se NÃO ESTIVER: ");
            int febre  = e.nextInt();
                 
            fila.insert(nome, febre);
          }
         
          System.out.println(fila.displayP());
          
          System.out.println("\nPaciente " + fila.remove() + " compareça ao consultório de imediato!");
          
          System.out.println(fila.displayP());
      }    
}
