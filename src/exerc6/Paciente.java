/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exerc6;

public class Paciente {
   private String nome;
   private int febre;
 
//--------------------------------------------------------------
   public Paciente(String n, int f)
      {                             
        nome = n; 
        febre = f;
      }
   
//--------------------------------------------------------------
   public String displayPaci()
   {
        String paci = (" Nome: " + nome) + (", Febril? Sim = 1 / Não = 0 : " + febre);
        
        return paci;
   }   
   
   public String getNome() 
      { return nome; }
    
   public int getFebre()         
      { return febre; } 

}
