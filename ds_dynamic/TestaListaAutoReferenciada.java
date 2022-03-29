package ds_dynamic;

import ds_dynamic.autoreferencia.*;
import java.util.Scanner;

/**
@author: Marllos Prado.
Class to test exercises 11 and 12;
*/


public class TestaListaAutoReferenciada{
  public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	int valor; 
	
	
	// Cria duas listas com capacidade maxima de 5 itens.
	// Creates two lists with max capacity of 5 itens.
	Lista L1 = new Lista();
    Lista L2 = new Lista();
	Lista L3;
	
	
	try {
		//Fiz esse for para agilizar a instanciação dos Integers e suas respectivas inserções nas Listas.
		//I did this for to speed up the instantiation of the Integers and their respective insertions in the Lists.
		
		for(int cont=1; cont<=5; cont++){
			L1.insere(new Integer(cont));
		}
		System.out.println("Imprimindo a primeira lista...");
		L1.imprime();
		
		for(int cont=6; cont<=10; cont++){
			L2.insere(new Integer(cont));
		}
		System.out.println("Imprimindo a segunda lista...");
		L2.imprime();
		
		//Test of Exercise 12
		L3 = L1.uneLista(L2);
		System.out.println("Imprimindo a terceira lista (uniao das anteriores)...");
		L3.imprime();
		
		//Test of Exercise 11
		L1.insereSemRepetir(new Integer(2));

	} catch (Exception e) {
	  System.out.println(e.getMessage());
	}	
  }
  
	
	
}
