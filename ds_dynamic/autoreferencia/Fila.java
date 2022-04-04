package ds_dynamic.autoreferencia;
public class Fila {
  private static class Celula {
    Object item;
    Celula prox;
  }
  private Celula frente;
  private Celula tras;
  // @{\it Opera\c{c}\~oes}@
  public Fila () { // @{\it Cria uma Fila vazia}@
    this.frente = new Celula ();
    this.tras = this.frente;
    this.frente.prox = null;
  }
  public void enfileira (Object x) {
    this.tras.prox = new Celula ();
    this.tras = this.tras.prox;
    this.tras.item = x;
    this.tras.prox = null;
  }
  public Object desenfileira () throws Exception {
    Object item = null;
    if (this.vazia ())
      throw new Exception ("Erro: A fila esta vazia");
    this.frente = this.frente.prox;
    item = this.frente.item;
    return item;
  }
  // Função criada para o exercicio 21
  public void imprime() {
		if(!this.vazia()) {
		    Celula temp;
			
			for(temp = this.frente.prox; temp != null; temp = temp.prox) {
				System.out.println(temp.item.toString());
			}
		}
		else
			System.out.println("Fila vazia!");
  }
  // Função criada para o exercicio 22
  public Fila intercalar(Fila f) throws Exception {
	  Fila fIntercalada = new Fila();
	  Celula tempFila1 = this.frente.prox;
	  Celula tempFila2 = f.frente.prox;
	  while(tempFila1 != null || tempFila2 != null) {
		  if(tempFila1 != null) {
			  fIntercalada.enfileira(tempFila1.item);
			  tempFila1 = tempFila1.prox;
		  }
		  if(tempFila2 != null) {
			  fIntercalada.enfileira(tempFila2.item);
			  tempFila2 = tempFila2.prox;
		  }
	  }
	  return fIntercalada;
  }
  public boolean vazia () {
    return (this.frente == this.tras);
  }
  
}
