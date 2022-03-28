/**
	Solution for exercise 18.
*/
package cap3;
import cap3.arranjo.Fila;

public class Exercicio18{
	public static void main (String [] args){
		Fila f1 = new Fila();
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
		
		System.out.println("Impressao da fila:");
		f1.imprime();
	}
}