package ds_array.arranjo;
public class Fila {
  private Object item[];
  private int    frente, tras;
  // @{\it Opera\c{c}\~oes}@
  public Fila () { // @{\it Cria uma Fila vazia}@
    this.item = new Object[1000];
    this.frente = 0;
    this.tras = this.frente;
  }
  public Fila (int maxTam) { // @{\it Cria uma Fila vazia}@
    this.item = new Object[maxTam];
    this.frente = 0;
    this.tras = this.frente;
  }
  public void enfileira (Object x) throws Exception {
    if ((this.tras + 1) % this.item.length == this.frente)
      throw new Exception ("Erro: A fila esta cheia");
    this.item[this.tras] = x;
    this.tras = (this.tras + 1) % this.item.length;
  }
  public Object desenfileira () throws Exception {
    if (this.vazia ())
      throw new Exception ("Erro: A fila esta vazia");
    Object item = this.item[this.frente];
    this.frente = (this.frente + 1) % this.item.length;
    return item;
  }
  public boolean vazia () {
    return (this.frente == this.tras);
  }
  
  
  
  
// Função criada para o exercicio 18
	public void imprime() {
		if(!this.vazia()) {
			for(int ind = this.frente;ind != this.tras; ind = ((ind + 1) % this.item.length)) {
					Object item = this.item[ind];
					System.out.println(item.toString());
			}
		}
	}
  
	// Função criada para o exercício 19
	/*
	Esta implementação não preserva as filas originais.
	*/
	public Fila intercalar(Fila segundaFila) throws Exception{
		Fila intercalada = new Fila();
	  
		while(!this.vazia() || !segundaFila.vazia()) {
			if(!this.vazia())
				intercalada.enfileira(this.desenfileira());
			if (!segundaFila.vazia()) {
				intercalada.enfileira(segundaFila.desenfileira());
			}
		}
		
		return intercalada;
	}
  

  
}