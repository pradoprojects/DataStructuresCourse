//************************************************************************
// Exercício 16 
// 
//************************************************************************
package ds_dynamic;
import ds_dynamic.autoreferencia.Pilha;

import java.util.Scanner;

public class Exercicio16{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		Pilha p1 = new Pilha();
		Pilha pares = new Pilha();
		Pilha impares = new Pilha();
		int valor=0;
		Integer aux;

		System.out.println("Insira valores para inserir na pilha ou 0 para sair.");
		
		do {
			try {
				valor = sc.nextInt();
			}
			catch(Exception obj) {
				System.out.println(obj.getMessage());
			}
			if(valor != 0)
				p1.empilha(new Integer(valor));
		}
		while(valor != 0);
		
		// Testa se há algum objeto na pilha antes de prosseguir.
		// Test if there is any object in the Stack before continuing.
		if(p1.tamanho() != 0)
		{
			System.out.println("Tamanho da pilha: " + p1.tamanho());
			System.out.println("Valores da pilha: ");
			//Exercicio 15: Ver codigo do método imprime() na Pilha autoreferenciada 
			//Exercise 15: Check the code of the imprime() method in the self-referenced Stack
			p1.imprime();
		
			
			
			try {
				
				while(p1.vazia()==false){
					aux = (Integer)p1.desempilha();
					if((aux.intValue() % 2) == 0)
						pares.empilha(aux);
					else
						impares.empilha(aux);
					
					
				}
				
				System.out.println("Tamanho da pilha de numeros pares: " + pares.tamanho());
				pares.imprime();
				System.out.println("Tamanho da pilha de numeros impares: " + impares.tamanho());
				impares.imprime();
			    
			}
			catch(Exception obj) {
				System.out.println(obj.getMessage());
				
			}
						
		}else{
			System.out.println("A pilha original esta vazia! Nao eh possivel completar a tarefa!");
		}
	}
}

