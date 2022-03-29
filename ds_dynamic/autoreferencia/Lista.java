package ds_dynamic.autoreferencia;
public class Lista {
  private static class Celula { Object item; Celula prox; }
  private Celula primeiro, ultimo, pos;
  // @{\it Opera\c{c}\~oes}@
  public Lista () { // @{\it Cria uma Lista vazia}@
    this.primeiro = new Celula (); this.pos = this.primeiro;
    this.ultimo = this.primeiro; this.primeiro.prox = null;    
  }
  public Object pesquisa (Object chave) {
    if (this.vazia () || chave == null) return null;
    Celula aux = this.primeiro;
    while (aux.prox != null) {
      if (aux.prox.item.equals (chave)) return aux.prox.item;
      aux = aux.prox;
    }    
    return null;
  }
  public void insere (Object x) {
    this.ultimo.prox = new Celula (); this.ultimo = this.ultimo.prox;
    this.ultimo.item = x; this.ultimo.prox = null;
  }
  // @{\it Insere antes do primeiro item da lista}@
  public void inserePrimeiro (Object item) {
    Celula aux =  this.primeiro.prox;
    this.primeiro.prox = new Celula ();
    this.primeiro.prox.item = item;
    this.primeiro.prox.prox = aux;
  }
  public Object retira (Object chave) throws Exception {
    if (this.vazia () || (chave == null))
      throw new Exception ("Erro: Lista vazia ou chave invalida");
    Celula aux = this.primeiro;
    while (aux.prox != null && !aux.prox.item.equals (chave)) 
      aux = aux.prox;
    if (aux.prox == null) return null; // @{\it Chave n\~ao encontrada}@ 
    Celula q = aux.prox; Object item = q.item; aux.prox = q.prox;
    if (aux.prox == null) this.ultimo = aux;
    return item;
  }
  public Object retiraPrimeiro () throws Exception {
    if (this.vazia ()) throw new Exception ("Erro: Lista vazia");    
    Celula aux = this.primeiro; Celula q = aux.prox;
    Object item = q.item; aux.prox = q.prox;
    if (aux.prox == null) this.ultimo = aux;
    return item;
  }
  public boolean vazia () { return (this.primeiro == this.ultimo); } 
  public void imprime () {
    Celula aux = this.primeiro.prox;
    while (aux != null) {
      System.out.println (aux.item.toString ()); aux = aux.prox;
    }
  }
  public boolean estaNaLista (Object chave) {
    Object obj = this.pesquisa (chave);
    return (obj != null);
  }
  
  public Object primeiro () {
    // @{\it Retorna o primeiro item da lista}@
    this.pos = this.primeiro; return this.proximo ();
  }

  public Object proximo () {
    // @{\it Retorna o pr\'oximo item da lista}@
    this.pos = this.pos.prox;
    if (this.pos == null) return null; 
    else return this.pos.item;
  }
  
  //Metodo para o exercicio 11
   public void insereSemRepetir (Object x) throws Exception {
	Object retorno;   
	retorno = this.pesquisa(x);
	
	if(retorno != null){
		throw new Exception ("Erro: Item a ser inserido já existe na lista");
	}else{
		this.insere(x);
	}
   }
   
   
   
   
   //Metodo para o exercicio 12
	public Lista uneLista (Lista lst2) throws Exception {
		
	Lista lst3;
	Object proxItem;

	if(lst2 == null){
		throw new Exception ("Erro: Lista a ser unida não existe");
	}else{
		lst3 = new Lista();
		proxItem = this.primeiro();
		
		while(proxItem != null){
			lst3.insere(proxItem);
			proxItem = this.proximo();
		}
		
		proxItem = lst2.primeiro();
		while(proxItem != null){
			lst3.insere(proxItem);
			proxItem = lst2.proximo();
		}		
	}
	
   return lst3;
   }
   
   
}

