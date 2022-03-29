package cap3.autoreferencia;
public class Pilha {
  private static class Celula {
    Object item;
    Celula prox;
  }
  private Celula topo;
  private int    tam;
  // @{\it Opera\c{c}\~oes}@
  public Pilha () { // @{\it Cria uma Pilha vazia}@
    this.topo = null; this.tam = 0;
  }
  public void empilha (Object x) {
    Celula aux = this.topo;
    this.topo = new Celula ();
    this.topo.item = x;
    this.topo.prox = aux;
    this.tam++;
  }
  public Object desempilha () throws Exception {
    if (this.vazia ())
      throw new Exception ("Erro: A pilha esta vazia");
    Object item = this.topo.item;
    this.topo = this.topo.prox;    
    this.tam--;
    return item;
  }
  public boolean vazia () {
    return (this.topo == null);
  }
  public int tamanho () {
    return this.tam;
  }
  
  //Exercicio 15. Teste junto feito junto do Exercicio 16
  public void imprime() {
	Celula aux = this.topo;
	
	while(aux != null) {
		System.out.println(aux.item.toString());
		aux = aux.prox;
	}
  }
}