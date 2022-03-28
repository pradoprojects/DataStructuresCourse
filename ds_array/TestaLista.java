//solução para a tarefa de casa de 21 de março.
//solution to the homework problems of march 21.
package ds_array;
import ds_array.arranjo.Lista;

public class TestaLista {
  public static void main (String[] args) {
    Lista lista = new Lista(12);
    Integer n = null;
	
    int i, j, k, max;
    Integer kA = new Integer(1);
	Integer kB = new Integer(2);
	Integer kC = new Integer(3);
	Integer kD = new Integer(4);
	Integer kE = new Integer(5);
	Integer kF = new Integer(6);
	
    max = 6;
    
	/*Vou exercicitar tudo dentro de um bloco 'try' porque se acontecer exceção irei tratá-la no 'catch'.
	Se eu não quisesse tratar a exceção, bastava adicionar 'throws Exception' antes de abrir a chave do main. 
	Nesse último caso, a exceção, quando ocorrer, será exibida diretamente no terminal, no formato padrão de um erro java.
	*/
	
	/*Here, I am exercising everything inside a 'try' block because in case the exception happens I'll treat it in the 'catch'.
	I case I did't wish to handle the exception, I could just add 'throws Exception' before the opening curling brackets of the main method. 
	In this last case, the exception , when it happens, will be shown directly on the prompt, in the standard form of a java error.
	*/
	try {
      
	  // Insere cada objeto Integer criado antes na lista
      // Inserts each Integer object previously created in the list.
      lista.insere(kA);
      System.out.println("Inseriu " + kA.toString());
	  
	  lista.insere(kB);
      System.out.println("Inseriu " + kB.toString());
	 
	  lista.insere(kC);
      System.out.println("Inseriu " + kC.toString());
     
	  lista.insere(kD);
      System.out.println("Inseriu " + kD.toString());
	  
	  lista.insere(kE);
      System.out.println("Inseriu " + kE.toString());
	  
	  lista.insere(kF);
      System.out.println("Inseriu " + kF.toString());
	  
	 
      
      Integer x = new Integer(4);
	  // Pesquisa um objeto Integer de valor 4 na lista. Sabemos que ele existe, porque o kD foi inserido
      // Searches an object Integer with the value "4" in the list. We know it exists, because kD was previously inserted.
      
	  n = (Integer) lista.pesquisa(x);
	  if (n == null){
		System.out.println("Item nao encontrado");
	  }else{
		System.out.println("O item encontrado eh o item: "+n.toString());
	  }
      
	  // Pesquisa sem sucesso
	  // Unsuccessful search
      Object item = lista.pesquisa(new Integer(100)); // Note que aqui eu optei por instanciar o objeto Integer(100) direto no parametro. Poderia ter feito tambem do jeito anterior, ou seja, armazenando antes em uma variavel.
      if (item == null){
		System.out.println("Item nao encontrado");
	  }else{
		System.out.println("O item encontrado eh o item: "+item.toString());
	  }
	
    // Aqui eu trato a exceção quando ela acontece.
	// Here I handle the exception when it happens.
	} catch (Exception e) {
      System.out.println(e.getMessage());
    }
	
	//Aqui testo se a lista esta vazia. 
	//Here I test if the list is empty. 
	boolean teste = lista.vazia();
	if(teste == true){
		System.out.println("Lista Vazia!");
	}else{
		System.out.println("Ainda há algum elemento na lista!");
	}
	
 
  }
}
