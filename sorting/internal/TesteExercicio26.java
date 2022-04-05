//************************************************************************
package sorting.internal;
import sorting.ItemCNH;
import sorting.CNH;

public class TesteExercicio26{
	public static void main (String [] args){
		ItemCNH[] vetCNH = new ItemCNH[7];
				
		Ordenacao ordenador = new Ordenacao();
		
		
		vetCNH[1] = new ItemCNH(new CNH("Ze", 12));
		vetCNH[2] = new ItemCNH(new CNH("Rai", 9));
		vetCNH[3] = new ItemCNH(new CNH("Souza", 11));
		vetCNH[4] = new ItemCNH(new CNH("Paula", 8));
		vetCNH[5] = new ItemCNH(new CNH("Marllos", 10));
		vetCNH[6] = new ItemCNH(new CNH("Daniele", 7));
		
		System.out.println("Vetor de CNHs vetCNH logo apos o preenchimento:");
		for(int i=1; i< 7; i++){
			System.out.println(vetCNH[i].recuperaChave().toString());
		}
		
		ordenador.selecao(vetCNH, 6);
		
		System.out.println("Vetor de CNHs vetCNH logo apos a ordenacao por selecao:");
		for(int i=1; i< 7; i++){
			System.out.println(vetCNH[i].recuperaChave().toString());
		}
		
		
	}
}

