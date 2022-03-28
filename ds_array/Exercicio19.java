/**
	Solution for exercise 19.
*/
package cap3;
import cap3.arranjo.Fila;

public class Exercicio19{
	public static void main (String [] args){
		Fila f1 = new Fila();
		Fila f2 = new Fila();
		Fila f3;
		int index;

		try {
			for(index = 0; index < 10; index++) {
				f1.enfileira(Integer.valueOf(index));
			}
		}
		catch(Exception obj)
		{
			System.out.println(obj.getMessage());
		}

		try {
			for(index = 100; index < 110; index++) {
				f2.enfileira(Integer.valueOf(index));
			}
		}
		catch(Exception obj)
		{
			System.out.println(obj.getMessage());
		}
		
		try {
			f3 = f1.intercalar(f2);
			System.out.println("Impressao da fila 3:");
			f3.imprime();
		}
		catch(Exception obj) {
			System.out.println(obj.getMessage());
		}		
		
		/*Os comandos seguintes ao serem executados não 
		exibirão nada pois o método intercalar (classe Fila) não
		preserva as filas originais.
		*/
		
		/*The following commands will show nothing when
		executed because the method "intercalar" at class Fila
		does not keep the original queues.
		*/
		System.out.println("Impressao da fila 1:");
		f1.imprime();
		System.out.println("Impressao da fila 2:");
		f2.imprime();
	}
}