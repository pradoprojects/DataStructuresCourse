//************************************************************************
// Exercise 21
//************************************************************************
package ds_dynamic;
import ds_dynamic.autoreferencia.Fila;

public class Exercicio21{
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