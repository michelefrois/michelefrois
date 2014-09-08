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
public class Jogador
   { 
   private String nome;
   private int idade;
   private double altura;
//--------------------------------------------------------------
   public Jogador(String n, double a, int id)
      {                               
      nome = n;
      altura = a;
      idade = id;
      }
//--------------------------------------------------------------
   public void displayJogador()
      {
      System.out.print(" Nome: " + nome);
      System.out.println(", Idade: " + idade);
      System.out.print(", Altura: " + altura);
      }
//--------------------------------------------------------------
   public int getIdade()           
      { return idade; }

   
  public String getName()           
      { return nome; }
  
   }  // Final da Classe 