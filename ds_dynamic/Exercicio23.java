//************************************************************************
// Exercise 23
//************************************************************************
package ds_dynamic;
import ds_dynamic.autoreferencia.Fila;
import java.util.Scanner;

public class Exercicio23{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		Fila senhas = new Fila();
		Fila senhasNormais = new Fila();
		Fila senhasPrioritarias = new Fila();
		int senha, hora;
		char tipo;
		Integer aux;

		do {
			try {
				System.out.println("Digite o tipo de senha (P-Prioritario; N-Normal) ou S para sair: ");
				tipo = sc.next().charAt(0);
				if(tipo != 'S' && tipo != 's') {
					System.out.println("Digite a senha: ");
					senha = sc.nextInt();
					System.out.println("Digite a hora da geracao da senha: ");
					hora = sc.nextInt();
					senhas.enfileira(new Senha(senha, hora, tipo));
				}
			}
			catch(Exception obj) {
				System.out.println(obj.getMessage());
				break;
			}
		} while(tipo != 'S' && tipo != 's');

		while(!senhas.vazia())
		{
			try {
				Senha senhaTemp = (Senha)senhas.desenfileira();
				if(senhaTemp.retornaTipo() == 'N')
					senhasNormais.enfileira(senhaTemp);
				else if(senhaTemp.retornaTipo() == 'P')     // I put the else just to prevent new types of passwords from causing the program to stop working.
					senhasPrioritarias.enfileira(senhaTemp);
			}
			catch(Exception obj) {
				System.out.println(obj.getMessage());
			}
		}
		
		System.out.println("Imprimindo senhas prioritarias:");
		senhasPrioritarias.imprime();
		System.out.println("Imprimindo senhas normais:");
		senhasNormais.imprime();
	}
}

