/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package desafio;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Aluno
 */
public class Desafio3 {
   private String[] nome;                 // cria a referência do vetor
   private int nElems;              // nElems controla quantos elementos o vetor terá ...
//-----------------------------------------------------------
   public Desafio3(int max)         // tamanho do vetor, quantidade de itens do Vetor
      {
        nome = new String[max];                 // cria o vetor ...
        nElems = 0;  
      }

//--------------------------------------------------------------
//Método de busca ....
//--------------------------------------------------------------
  public boolean buscaA(String nomebusca)
      { 
        boolean b = false;
        int j;
        for(j=0; j<nElems; j++)            // varrerá o vetor buscando ...
            if (nomebusca.equals(nome[j])) 
            {
                System.out.println("Nome: " + nome[j] );     
                b = true;
            }             
        
        return b;

      }  // fim da busca 
  
 
//--------------------------------------------------------------
//Método de deletar ....
//--------------------------------------------------------------
/*  public boolean remove(String nomebusca)
      { 
        boolean e = false;
        int j;
        
        for(j=0; j<nElems.lenght; j++){            // varrerá o vetor buscando ...
            if (nomebusca.equals(nome[j])) 
            {
                boolean [j]remove = nome.remove[j];
                if (nome[j] == null)
                    nome[j] = j+1;                  
                System.out.println("Nome: " + nome[j] + "Excluído com Sucesso!!!");     
                e = true;
            }             
        
        return e;

      }  // fim da busca 
} */
//--------------------------------------------------------------
//Método de inserção ....
//--------------------------------------------------------------
   public void insert(String inome)    // insere um elemento no vetor
      {
      nome[nElems] = inome;             // insere nessa posição ...
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
}   
 //-----------------------------------------------------------

class Usuario3
   {
   public static void main(String[] args)
      {
      int maxSize = 5;             // coloca em uma constante o tamanho do vetor
      Desafio3 arr;                // cria referencia para a estrutura de dados
      arr = new Desafio3(maxSize); // instancia a estrutura de dados
      Scanner nome = new Scanner(System.in); //Instancie o objeto
          System.out.println("Seja Bem Vindo ao programa 3!");
     
      //Pedir para o usuario digitar 5 nomes
       for (int i=1; i<maxSize; i++)       
       {
           System.out.printf("Informe o nome do " + i + "º aluno do total de 5: "); 
           arr.insert(nome.nextLine());
       }
      
       arr.display();
       
       //Pedir para o usuario digitar um nome
       System.out.println("Digite um nome para busca: ");
       arr.buscaA(nome.nextLine());
       
       //Pedir para o usuario digitar um nome p/ excluir do vetor
       //System.out.println("Digite um nome para exclusão: ");
       //arr.remove(nome.nextLine());
       
       //Chama o metodo da classe Desafio2 que ira imprimir os nomes que comecarem com
       //essa letra
       if( !arr.buscaA(nome.nextLine()))
         System.out.println("Não encontrei o nome procurado!!!");
}
   
}
