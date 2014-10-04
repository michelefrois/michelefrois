package exerc6;

/**
 *
 * @author Aluno
 */
public class FilaPrioridade { //Inicio da nossa classe FilaPrioridade      
   private int maxSize;
   private Paciente[] queArray; 
   private int nItems;
//-------------------------------------------------------------
   public FilaPrioridade(int s)          // metodo construtor
      {
      maxSize = s;
      queArray = new Paciente[maxSize]; //Criamos o vetor do tamanho que a classe usuaria pede por parametro
      nItems = 0;
      }

//--------------------------------------------------------------
//Método que retorna quantidade de itens do vetor ....
//--------------------------------------------------------------
   public int size()
      { return nItems; }
//-------------------------------------------------------------
   public void insert(String nome, int febre)    // Metodo de Inserção ...podemos dizer "Enfilar" ...
      {
      int j;

      if(nItems==0)                         // Se não tiver nenhum item na FILA...
         queArray[nItems++] = new Paciente(nome, febre);         // ... inserimos o paciente na posição 0 e depois incrementamos nItems
      else                                // ... se tiver algo na fila ...
         {
         for(j=nItems-1; j>=0; j--)         // ... começando pelo final da fila ... 
            {
            if(febre <= queArray[j].getFebre())      // ... comparamos se o item que queremos inserir é maior do que cada um que já esta na fila
               queArray[j+1] = queArray[j]; // ... se for, eles vão pular uma posição "pra traz" na fila!!!
            else                          // ... no momento em que o item que queremos inserir for menor do que os itens na fila...
               break;                     // paramos nessa posição e ...
            }  // end for
         queArray[j+1] = new Paciente(nome, febre);            // inserimos na posição de traz ...
         nItems++;
         }  // final do else
      }  // final do insert ...
//-------------------------------------------------------------
   public String remove()      // remove!!!
      {       
       return queArray[--nItems].getNome(); 
      }
//-------------------------------------------------------------
   public String peekMin()           // pega o último item
      { return queArray[nItems-1].getNome(); }
//-------------------------------------------------------------
   public boolean isEmpty()         // vê se esta vazio
      { return (nItems==0); }
//-------------------------------------------------------------
   public boolean isFull()          // vê se esta cheio!!!
      { return (nItems == maxSize); }
//-------------------------------------------------------------
   public String displayP()
    {
        String paciente = "";
        for(int i = 0; i<nItems; i++)
        {
            paciente = paciente + queArray[i].displayPaci();
        }
        return paciente;
    }
}
