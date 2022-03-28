package cap3;

import cap3.arranjo.*;
import java.util.Scanner;

/**
@author: Marllos Prado.
Classe para testar o exercício 14;

Class to test the exercise 14;
*/

// Exercise 14
public class TestaPilha2{
  public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	int capacidadeMaxima = 5;
    int valor;
	
	
	// 14.1
	Pilha p1 = new Pilha(capacidadeMaxima);
    Pilha p2 = new Pilha(capacidadeMaxima);
	
	
	
	try {
		
		// 14.2
		for(int cont=1; cont<6; cont++){
			System.out.println("Digite o proximo valor a ser empilhado:");
			valor = sc.nextInt();
			p1.empilha(new Integer(valor));
		}
		
		// 14.3
		System.out.println("Os valores da primeira pilha são: ");
		p1.imprimeSimples();
		
		// 14.4
		while(!p1.vazia()){
			p2.empilha(p1.desempilha());
		}
		
		// 14.5
		System.out.println("Os valores da primeira pilha são: ");
		p1.imprimeSimples();	
		System.out.println("Os valores da segunda pilha são: ");
		p2.imprimeSimples();
		
	} catch (Exception e) {
	  System.out.println(e.getMessage());
	}	
  }
	
	
}
