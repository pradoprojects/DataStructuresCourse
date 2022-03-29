//************************************************************************
// Exercício 17
//************************************************************************
package ds_dynamic;
import ds_dynamic.autoreferencia.Pilha;
import ds_dynamic.autoreferencia.Lista;
import java.util.Scanner;

public class Exercicio17{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		Pilha p1 = new Pilha();
		Lista l1 = new Lista();
		Lembrete lem, lemAux;
		int hora, minuto;
		String nota;
		int index;

		/*Código que habilita o usuário a criar quantos lembretes desejar
		e armazena os lembretes em uma lista à medida que são criados.*/
	
		/*Code that enables the user to create as many reminders as desired
		and stores the reminders in a list as they are created.*/ 
		try {
			System.out.println("Digite ENTER para comecar: ");
			do {
				sc.nextLine();
				nota = null;
				System.out.println("Digite o lembrete (ou ENTER para finalizar): ");
				nota = sc.nextLine();
				if(nota.compareTo("")!=0){
					System.out.print("Digite a hora do lembrete: ");
					hora = sc.nextInt();
					System.out.print("Digite os minutos do lembrete: ");
					minuto = sc.nextInt();
					lem = new Lembrete(nota);
					lem.adHorario(hora, minuto);
					l1.insere(lem);
				}
			} while(nota.compareTo("")!=0);
		}
		catch(Exception obj) {
			System.out.println("Insercao de dados encerrada!!\n");
		}
		
		/*Código que procura os lembretes mais antigos.
		A cada iteração o lembrete mais antigo é encontrado,
		empilhado na pilha e retirado da lista original. Esse
		processo é repetido até que a lista original fique vazia.
		*/
		
		/*
		Code that looks for the oldest reminders. At each iteration,
		the oldest reminder is found, put on the stack, and removed
		from the original list. This process is repeated until the
		original list is empty.
		*/
		
		while(!l1.vazia())
		{
			lem = (Lembrete)l1.primeiro();
			lemAux = (Lembrete)l1.proximo();
			while(lemAux != null) {
				if(lemAux.ehMenosRecente(lem)) {
					lem = (Lembrete)lemAux;
				}
				lemAux = (Lembrete)l1.proximo();
			}
			p1.empilha(lem);
			try{
				l1.retira(lem);
			}
			catch(Exception obj) {
				System.out.println(obj.getMessage());
			}
		}
		
		//Código que imprime os lembretes na pilha.
		//Printing the Stack reminders
		System.out.println("Quantidade de lembretes: " + p1.tamanho());
		p1.imprime();
	}
}

