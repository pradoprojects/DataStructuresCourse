//************************************************************************
// @author Marllos
//************************************************************************
package sorting.internal;
import sorting.Item;

public class TesteExercicio25{
	public static void main (String [] args){
		Item[] vetA = new Item[41];
		Item[] vetB = new Item[41];
		
		Ordenacao ordenador = new Ordenacao();
		
		for(int i=1; i< 41; i++){
			vetA[i] = new Item(41-i);
			vetB[i] = new Item(41-i);
		}
		
		System.out.println("Vetor de Itens vetA logo apos o preenchimento:");
		for(int i=1; i< 41; i++){
			System.out.println(vetA[i].toString());
		}
		
		System.out.println("Vetor de Itens vetB logo apos o preenchimento:");
		for(int i=1; i< 41; i++){
			System.out.println(vetB[i].toString());
		}
		
		
		ordenador.selecaoParcial(vetA, 40, 20);
		
		System.out.println("Vetor de Itens vetA logo apos a ordenacao por selecaoParcial:");
		for(int i=1; i< 41; i++){
			System.out.println(vetA[i].toString());
		}
		
		
		ordenador.insercaoParcial(vetB, 40, 20);
		
		System.out.println("Vetor de Itens vetB logo apos a ordenacao por insecaoParcial:");
		for(int i=1; i< 41; i++){
			System.out.println(vetB[i].toString());
		}
		
		
	}
}

