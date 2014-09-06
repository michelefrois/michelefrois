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
class Estrutura  //Criamos aqui nossa classe EstruturaVetor
   { 
   private Jogador[] vj;                 // cria a referência para um vetor do tipo Pessoa
   private int nElems;               // nElems controla quantos elementos o vetor terá ...
   //-----------------------------------------------------------
   public Estrutura(int max)         // método construtor
      {
      vj = new Jogador[max];                 // cria o vetor ...
      nElems = 0;                        // inicialmente sem itens ...
      }

//--------------------------------------------------------------
//Método que retorna quantidade de itens do vetor ....
//--------------------------------------------------------------
   public int size()
      { return nElems; }
 
 //--------------------------------------------------------------
//Método de pesquisa binária com int
//--------------------------------------------------------------
   public int findByIdade(int buscaid)
      {
      int lowerBound = 0;
      int upperBound = nElems-1;
      int curIn;

      while(true)
         {
         curIn = (lowerBound + upperBound ) / 2;
         if(buscaid == vj[curIn].getIdade()){ 
            for(int i = curIn; (vj[i].getIdade() == buscaid); i++)   
            {   
                vj[i].displayJogador();
                System.out.println("==============================================");
            }     
            for (int i = curIn-1; (vj[i].getIdade() == buscaid); i--) 
            { 
                 vj[i].displayJogador();
                 System.out.println("==============================================");
            }
            return curIn; // encontrei!
         }
         else if(lowerBound > upperBound)
            return nElems;             // não pude encontra-lo
         else                          // divide o range
            {
            if(buscaid > vj[curIn].getIdade()) //mudamos aqui para comparar idade
               lowerBound = curIn + 1; // esta na metade de cima
            else
               upperBound = curIn - 1; // esta na metade de baixo
            }  // fim do else de divisão de range
         }  // fim do while
      }  // fim do método de pesquisa binária()  
 
//--------------------------------------------------------------
//Método de inserção ORDENADA com Int!!! ....
//--------------------------------------------------------------
   public void insert(String n, double a, int id)    // insere o elemento no vetor
      {
      int j;
      for(j=0; j<nElems; j++)        // localiza onde esse elemento se encaixa
          //usamos aqui o metodo getIdade para comparar com a idade
          if (vj[j].getIdade() > id)
            break;
      for(int k=nElems; k>j; k--)    // move os elementos maiores uma posição p/ frente
         vj[k] = vj[k-1];
      //Apos abrir um espaço no lugar certo, ele cria a idade objeto Jogador na posição aberta!!!
      vj[j] = new Jogador(n, a, id);                  // insere o elemento na posição necessária
      nElems++;                      // incrementa a variavel de controle de tamanho
      }  // finaliza o método de inserção

//--------------------------------------------------------------
//Busca linear por nome!!!
//--------------------------------------------------------------
    public boolean findNome(String nome)
      {                              // metodo buscará o valor que a classe usuaria pedir ...
      int j;
      for(j=0; j<nElems; j++)            // varrerá o vetor buscando ...
         if(vj[j].toUpperCase().equals(nome.toUpperCase()))           // encontrou o item?
            break;                       // sai do for antes de finalizar ...
       return j != nElems;
      }  // fim da busca    

//--------------------------------------------------------------
//Método de visualização ....
//--------------------------------------------------------------
   public void display()             // mostra o conteúdo do vetor
      {
      for(int j=0; j<nElems; j++)      
         vj[j].displayJogador();
      }
   
}