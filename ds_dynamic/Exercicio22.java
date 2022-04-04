//************************************************************************
// Exercise 22
//************************************************************************
package ds_dynamic;
import ds_dynamic.autoreferencia.Fila;

public class Exercicio22{
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
			for(index = 20; index < 30; index++) {
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
		System.out.println("Impressao da fila 1:");
		f1.imprime();
		System.out.println("Impressao da fila 2:");
		f2.imprime();
	}
}