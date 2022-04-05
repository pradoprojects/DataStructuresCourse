//************************************************************************
// @author Marllos
//************************************************************************
package sorting.internal;
import sorting.Item;

public class TesteExercicio24{
	public static void main (String [] args){
		Item[] vetA = new Item[51];
		Item[] vetB = new Item[51];
		
		Ordenacao ordenador = new Ordenacao();
		
		for(int i=1; i< 51; i++){
			vetA[i] = new Item(i);
			vetB[i] = new Item(i);
		}
		
		System.out.println("Vetor de Itens vetA logo apos o preenchimento:");
		for(int i=1; i< 51; i++){
			System.out.println(vetA[i].toString());
		}
		
		System.out.println("Vetor de Itens vetB logo apos o preenchimento:");
		for(int i=1; i< 51; i++){
			System.out.println(vetB[i].toString());
		}
		
		
		ordenador.selecaoInvertido(vetA, 50);
		
		System.out.println("Vetor de Itens vetA logo apos a ordenacao por selecaoInvertido:");
		for(int i=1; i< 51; i++){
			System.out.println(vetA[i].toString());
		}
		
		
		ordenador.insercaoInvertido(vetB, 50);
		
		System.out.println("Vetor de Itens vetB logo apos a ordenacao por insecaoInvertido:");
		for(int i=1; i< 51; i++){
			System.out.println(vetB[i].toString());
		}
		
		
	}
}

