/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio2;

import java.util.Scanner;
import java.util.*;


public class EstruturaDados {
    private String[] nome;                 // cria a referência do vetor
   private int nElems;              // nElems controla quantos elementos o vetor terá ...
//-----------------------------------------------------------
   public EstruturaDados(int max)         // tamanho do vetor, quantidade de itens do Vetor
      {
        nome = new String[max];                 // cria o vetor ...
        nElems = 0;  
      }

//--------------------------------------------------------------
//Método de busca ....
//--------------------------------------------------------------
  public boolean buscaA(String nomebusca)
  {  
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;
        
        while(true)
        {
            curIn = (lowerBound + upperBound) / 2;
            if(nome[curIn].charAt(0) == nomebusca.charAt(0))
            {
                for(int i = curIn; (nome[curIn].charAt(0) == nomebusca.charAt(0)); i++){            // varrerá o vetor buscando ...               
                    System.out.println("Nome: " + nome[curIn] );                               
                }
                
                for(int i = curIn; (nome[curIn].charAt(0) == nomebusca.charAt(0)); i--){
                    System.out.println("Nome: " + nome[curIn] );                         
                }
                return true;
            }           
            
            else if(lowerBound > upperBound)
                return false;             // não pude encontra-lo 
            else                          // divide o range
            {
               if(nome[curIn].compareTo(nomebusca) < 0)
               lowerBound = curIn + 1; // esta na metade de cima
            else
               upperBound = curIn - 1; // esta na metade de baixo

            }   // fim do while 
        }
                
}  // fim da buscaA 
  
 
//--------------------------------------------------------------
//Método de remoção ....
//--------------------------------------------------------------
   public boolean delete(String value)
      {
      int j;
      for(j=0; j<nElems; j++)        // varre o vetor 
         if( value.equals(nome[j]) )
            break;
      if(j==nElems)                  // se não encontrar retorna falso
         return false;
      else                           // se encontrar ...
         {
         for(int k=j; k<nElems; k++) // move os mais altos para "frente"
            nome[k] = nome[k+1];
         nElems--;                   // decrementa o contador de elementos
         return true;
         }
      }  // final do método de remoção
//--------------------------------------------------------------
//Método de inserção ....
//--------------------------------------------------------------
   public void insert(String inome)    // insere um elemento no vetor
      {     
      int j;
      for(j=0; j<nElems; j++)            // varrerá o vetor buscando ...
         if(nome[j].compareTo(inome) > 0)           // comparação entre Strings
            break;                       // sai do for antes de finalizar ...
      for(int k=nElems; k>j; k--)
          nome[k] = nome[k-1];
      nome[j] = inome;
      nElems++;                      // incrementa o tamanho
      }   

//--------------------------------------------------------------
//Método de visualização ....
//--------------------------------------------------------------   
   public void display()             // mostra o conteúdo do vetor
      {
      for(int j=0; j<nElems; j++)      
         System.out.print(nome[j] + " ");  
      System.out.println("");
      }
   
      public boolean displayFirst(String letter)
      {      
         boolean retorno = false;
            for(int j=0; j<nElems; j++)    
            {  
                if (letter.charAt(0) == nome[j].charAt(0)) 
                {
                    System.out.print(nome[j] + " ");  
                    System.out.println("");
                    retorno = true;
                }
            }
         return retorno;   
     } 
   
}
