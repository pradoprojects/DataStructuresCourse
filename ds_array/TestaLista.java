package cap3;

import cap3.arranjo.Lista;

/**
@author: Marllos Prado.
Class to implement the solution of the exercícises 6, 7 and 8.

*/

public class TestaLista {
  public static void main (String[] args) {
	int capacidadeMaxima = 12;
    Lista lista = new Lista(capacidadeMaxima);
    Integer n = null;
	
	//Insere o item kC e kE na lista.
	Integer kC = new Integer(3);
	Integer kE = new Integer(5);
	
	/*Depois:
	    - Insere um novo item após uma chave existente com o método insereAposChave.
		- Insere um item que ainda não existe com o método insereSemRepetir.
		- Insere um item que já existe com o método insereSemRepetir.
	*/
	try {
	  lista.insere(kE);  
	  lista.insere(kC); 
	  lista.insereAposChave(new Integer(50), kE);
	  lista.insereSemRepetir(new Integer(90));
	  System.out.println("Chegou ate aqui sem excecao! Sinal de que as insercoes funcionaram!");
	  lista.insereSemRepetir(new Integer(3));
	} catch (Exception e) {
	  System.out.println(e.getMessage());
	}
	
	
	//Testa metodo que une duas listas
	
	
	Lista L1 = new Lista(3);
	Lista L2 = new Lista(2);
	Lista L3 = null; // variavel que irá guardar a referencia para a lista que será gerada pela união de L1 e L2.
	
    Integer itemA = new Integer(2);
	Integer itemB = new Integer(3);
	Integer itemC = new Integer(4);
	
	Integer itemD = new Integer(7);
	Integer itemE = new Integer(8);
	
	
	try {
      
	  // Insere cada objeto Integer criado nas listas L1 e L2
      
      L1.insere(itemA);
      System.out.println("Inseriu na L1 " + itemA.toString());
	  L1.insere(itemB);
      System.out.println("Inseriu na L1 " + itemB.toString());
	  L1.insere(itemC);
      System.out.println("Inseriu na L1 " + itemC.toString());
	  
	  L2.insere(itemD);
      System.out.println("Inseriu na L2 " + itemD.toString());
	  L2.insere(itemE);
      System.out.println("Inseriu na L2 " + itemE.toString());
	
	  
	  //Chama o método que une a L2 na L1 e armazena o retorno em L3
	  L3 = L1.uneListas(L2);
	  
	  //Testa se L3 tem o tamanho igual a L1 + L2. Se tiver, é porque ela de fato uniu os itens de L1 e L2.
	  System.out.println("O tamanho de L3 eh: "+L3.getTamanho());
	  
	  
	}catch(Exception e) {
	  System.out.println(e.getMessage());
	}
 
  }
}
