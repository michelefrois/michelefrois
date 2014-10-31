

package listaencadeada;


public class ExercicioListaEncadeda {

   
    public static void main(String[] args) {
        ListaPessoas lp = new ListaPessoas();
        lp.InsertFirst("Michele",  "Lucas");
        lp.InsertFirst("Camila",   "Júlia");
        lp.InsertFirst("Ana",      "Rafael");
        lp.InsertFirst("Lívia",    "Adriano");
        lp.InsertFirst("Carla",    "Paulo");
        
        
        lp.print();
        System.out.println("------------------------------------");
        System.out.println("------------Deletar------------------");
        System.out.println("------------------------------------");
        lp.deletFirst();
        lp.print();
        System.out.println("------------------------------------");
        System.out.println("-----------Buscar Michele------------");
        System.out.println("------------------------------------");
        
        lp.findname("Michele");
    }
    
}
