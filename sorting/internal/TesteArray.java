//************************************************************************
// @author Marllos
//************************************************************************
package sorting.internal;
import sorting.Item;

public class TesteArray{
	public static void main (String [] args){
		Item[] vet = new Item[101];
		Ordenacao ordenador = new Ordenacao();
		for(int i=1; i< 101; i++){
			vet[i] = new Item(101-i);
		}
		
		System.out.println("Vetor de Itens logo após o preenchimento:");
		for(int i=1; i< 101; i++){
			System.out.println(vet[i].toString());
		}
		
		ordenador.selecao(vet, 100);
		
		System.out.println("Vetor de Itens logo após a ordenação:");
		for(int i=1; i< 101; i++){
			System.out.println(vet[i].toString());
		}
		
		
		
	}
}

