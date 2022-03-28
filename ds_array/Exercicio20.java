/**
	Solution for exercise 20.
*/

package cap3;
import cap3.arranjo.Lista;
import cap3.arranjo.Fila;
import java.util.Scanner;

public class Exercicio20{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		Lista senhas = new Lista(10);
		Fila senhasNormais = new Fila(10);
		Fila senhasPrioritarias = new Fila(10);
		int senha, hora;
		char tipo;
		Integer aux;

		for(int quantSenhas=0; quantSenhas < 10; quantSenhas++) {
			try {
				System.out.println("Digite a senha(" + quantSenhas + "): ");
				senha = sc.nextInt();
				System.out.println("Digite a hora da geracao da senha: ");
				hora = sc.nextInt();
				System.out.println("Digite o tipo de senha (P-Prioritario; N-Normal): ");
				tipo = sc.next().charAt(0);
				senhas.insere(new Senha(senha, hora, tipo));
			}
			catch(Exception obj) {
				System.out.println(obj.getMessage());
			}
		}

		// Esta parte do código tira as senhas da lista e as enfilera em ordem cronológica segundo seu tipo.
		// This code section removes the passwords (senhas) from the list and queue them up in chronological order according to their type.
		Senha menorNormal = null;
		Senha menorPrioritaria = null;
		Senha temporario = (Senha)senhas.primeiro();
		
		/* Garante, a cada iteração, que as menores senhas (normal e prioritaria)
		sejam encontradas. Quando as encontra, retira elas da lista e as enfileira em
		suas respectivas filas.	Isso é feito enquanto a lista não estiver vazia		
		*/
		
		/* Ensures, with each iteration, that the smallest passwords (normal and priority)
		be found. When it finds them, it removes them from the list and queues them up in
		their respective queues. This is done while the list is not empty.
		*/
		while(!senhas.vazia()) {
			
			/* Procura as menores senhas (normal e prioritaria) daquela iteração.
			*/
			
			/* Searches for the smallest passwords (normal and priority) in that iteration.
			*/
			while(temporario != null) {
				//Verifica se a senha é do tipo Normal
				//Checks if the password is the normal type
				if(temporario.retornaTipo() == 'N') {
					
					//Trata o caso de ser a primeira senha normal
					//Handles the case of being of being the first regular password
					if(menorNormal == null){
						menorNormal = temporario;
					}else{
						//Verifica se descobriu uma nova senha normal de menor valor
						//Checks if it discovered a regular password with the smallest value
						if(temporario.retornaHora() < menorNormal.retornaHora()){
							menorNormal = temporario;
						}
					}
				}else {
					//Verifica se a senha é do tipo Prioritaria
					//Checks if the password is of the prioritary type
					if(temporario.retornaTipo() == 'P') {
						
						//Trata o caso de ser a primeira senha prioritaria
						//Handles the case of being the first priority password.
						if(menorPrioritaria == null){
							menorPrioritaria = temporario;
						}else{
							
							//Verifica se descobriu uma nova senha prioritaria de menor valor
						    //Check if a new lower-value priority password has been discovered 
							if(menorPrioritaria.retornaHora() > temporario.retornaHora()){
								menorPrioritaria = temporario;
							}
						}
					}
				}
				
				//pega a proxima senha da lista a ser avaliada.
				temporario = (Senha)senhas.proximo();
			}
			
			/*
			Neste ponto as menores senhas da iteração em questão já são conhecidas.
			Logo, elas são retiradas da lista e enfileiradas em suas respectivas filas.			
			*/
			
			/* At this point the shortest passwords of the iteration in question are already known.
Then they 	are removed from the list and queued in their respective queues.*/
			try {
				if(menorNormal != null) {
					senhasNormais.enfileira(menorNormal);
					senhas.retira(menorNormal);
					menorNormal = null;
				}
				if(menorPrioritaria != null) {
					senhasPrioritarias.enfileira(menorPrioritaria);
					senhas.retira(menorPrioritaria);
					menorPrioritaria = null;
				}
			}
			catch(Exception obj) {
				System.out.println(obj.getMessage());
			}
			
			//Prepara para começar outra iteração com as senhas restantes.
			//Prepare to start another iteration with the remaining passwords.
			temporario = (Senha)senhas.primeiro();
		}
		
		// Parte que desenfileira e imprime, alternadamente, as senhas de cada fila.
		// Part that alternately dequeues and prints the passwords for each queue.
		Senha Normal;
		Senha Prioritaria;
		
		while(!senhasNormais.vazia() || !senhasPrioritarias.vazia()) {
			try {
				if(!senhasNormais.vazia()) {
					Normal = (Senha)senhasNormais.desenfileira();
					System.out.println(Normal);
				}
				if(!senhasPrioritarias.vazia()) {
					Prioritaria = (Senha)senhasPrioritarias.desenfileira();
					System.out.println(Prioritaria);
				}
			}
			catch(Exception obj) {
				System.out.println(obj.getMessage());
			}
		}
	}
}

