
package exercpilha;

public class EstruturaPilha {
    public String[] end; 
    private int posicaoPilha; 
    
    public EstruturaPilha() 
    { 
        this.posicaoPilha = -1; 
        this.end = new String[100];
    } 
    
    public void displayEnderecos()
      {
          System.out.print("Endereços de Pesquisa: \n");
          for (int i=0; i<posicaoPilha; i++)
          {
              System.out.println(end[i]);
          }                                   
      }
    
    public boolean pilhaVazia() 
    { 
        if (this.posicaoPilha == -1) 
        { 
            return true; 
        } 
            return false; 
    } 

    
    public int tamanho() 
    { 
        if (this.pilhaVazia()) 
        { 
            return 0;
        } 
            return this.posicaoPilha + 1; 
    } 

    
    public void exibeUltimoValor() 
    { 
        if (this.pilhaVazia()) 
        { 
            System.out.println("Pilha Vazia!");
        } 
        else      
            System.out.println(end[posicaoPilha]);
    }  

    public void desempilhar() 
    { 
        if (pilhaVazia()) 
        { 
            System.out.println("Pilha Vazia!");
        }
        else
            posicaoPilha--;
    } 

    public void empilhar(String e) 
    { 
        if (this.posicaoPilha < this.end.length - 1) 
        { 
            this.end[++posicaoPilha] = new String(e); 
        } 
    }
     
}
