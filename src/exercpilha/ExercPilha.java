package exercpilha;


public class ExercPilha {

    
    public static void main(String[] args) {
       EstruturaPilha ep = new EstruturaPilha();
       
       ep.empilhar("www.google.com.br");
       ep.empilhar("www.terra.com.br");
       ep.empilhar("www.uol.com.br");
       ep.empilhar("www.ifsp.com.br");
       ep.empilhar("www.youtube.com.br");
       ep.empilhar("www.facebook.com.br");
       ep.empilhar("www.github.com");
       
       ep.displayEnderecos();
       
       
       System.out.println("\nUltimo endereço registrado: ");
       ep.exibeUltimoValor();
       
       System.out.println("\nApagando a ultima entrada: ");
       ep.desempilhar();
       
       System.out.println("\nUltimo endereço registrado: ");
       ep.exibeUltimoValor();
    }
    
}
