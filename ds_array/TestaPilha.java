package ds_array;
import ds_array.arranjo.*;

/**
@author: Marllos Prado.
Classe para testar o exercício 13;

Class to test exercise 13 (stack);
*/

public class TestaPilha{
  public static void main (String[] args) {
	int capacidadeMaxima = 6;
    Pilha p1 = new Pilha(capacidadeMaxima);
    
	Integer kA = new Integer(7);
	Integer kC = new Integer(3);
	Integer kE = new Integer(5);
	
	/*Empilha o item kA, kC e kE na pilha.*/
	
	/*Puts the itens kA, kC and kE in the stack. */ 
	
	try {
	  p1.empilha(kA);  
	  p1.empilha(kC); 
	  p1.empilha(kE);
	  
	  /*Imprime a pilha usando o metodo imprimeSimples -- solução mais simples para exercicio 12.
	  Note que aqui a impressão é feita pelo próprio objeto pilha (entretanto no mundo real uma pilha não tem esse tipo de comportamento).*/
	  
	  /*Prints the stack using the method imprimeSimples -- simplest solution to exercise 12.
	  Note that here the print is made by the object stack (pilha) itself (However in the real world, a stack doesn't have this kind of behaviour).*/
	  
	  p1.imprimeSimples();
	  
	  
	  
	  System.out.println("\n------------ \n");
	  
	  
	  /*Imprime a pilha usando o metodo toString -- solução mais elegante para exercicio 12.
	  Note que aqui, a classe TestaPilha é quem imprime o retorno do método toString da classe Pilha.*/
	  
	  /* Prints the stack using the method toString -- more elegant solution to the execise 12.
	  Note that here, the class TestaPilha is the one that prints the object returned from the method toString in the class Pilha.*/ 
	  */
	  String res = p1.toString();
	 
	 if(res == null){
		System.out.println("Pilha vazia!");
	  } else {
		System.out.println(res);  
	  }
	  
	} catch (Exception e) {
	  System.out.println(e.getMessage());
	}
  }
	
	
	
}
