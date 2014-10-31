
package exercListaEncadeada;


public class EstruturaLista {

    private String nome;
    private String Pessoaespecial;
    private EstruturaLista next;


    public EstruturaLista(String nome, String nome2) 
    {
    this.nome = nome;
    this.Pessoaespecial = nome2;
    }

    public String getNome ()
    {
    return nome;
    }

    public void setNext (EstruturaLista n)
    {
    next = n;
    }

    public String displayNomes()
    {
    return (" \nSeu nome: " + nome + " De uma pessoa especial: " + Pessoaespecial);
    }

    public EstruturaLista getNext()
    {
    return next;
    }
  
}

//--------------------------------------------------------------------------------------
class ListaE{
    
    private EstruturaLista first;
    public ListaE()
    {
        first = null;
    }
    
    public boolean isEmpty()
    {
        return (first == null);
    }
    
    public void InsertFirst(String nome1, String nome2)
    {
        EstruturaLista newEL  = new EstruturaLista(nome1,nome2);
        newEL.setNext(first);
        first = newEL;
    }
    
    public EstruturaLista deletFirst()
    {
        EstruturaLista temp = first;
        first = first.getNext();
        return temp;
    }
   
    public void print()
    {
        for(EstruturaLista n = first; n != null; n = n.getNext())
        {
            System.out.println(n.displayNomes());
        } 
    }
   
    public void findname(String nome)
    {
        for(EstruturaLista n = first; n != null; n = n.getNext())
        {
            if(n.getNome().compareTo(nome)==0)
            {
            System.out.println(n.displayNomes());
            }
        } 
    }
}


