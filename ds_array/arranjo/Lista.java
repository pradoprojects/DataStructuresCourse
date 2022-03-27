package cap3.arranjo;
public class Lista {
  private Object item[];
  private int primeiro, ultimo, pos;
  // @{\it Operations}@
  public Lista () { // @{\it Creates an empty list with 1000 positions capacity}@
    this.item = new Object[1000]; this.pos = -1;
    this.primeiro = 0; this.ultimo = this.primeiro;
  }
  public Lista (int maxTam) { // @{\it Creates an empty list with maxTam capacity}@
    this.item = new Object[maxTam]; this.pos = -1;
    this.primeiro = 0; this.ultimo = this.primeiro;
  }
  public Object pesquisa (Object chave) { // @{\it Searches an element in the list based in the key (chave) given in the parameter }@
    if (this.vazia () || chave == null) return null;
    for (int p = 0; p < this.ultimo; p++)
      if (this.item[p].equals (chave)) return this.item[p];
    return null;
  }
  public void insere (Object x) throws Exception {  // @{\it Inserts an element (x) in the list }@
    if (this.ultimo >= this.item.length)
      throw new Exception ("Erro: A lista esta cheia");
    else { this.item[this.ultimo] = x; this.ultimo = this.ultimo + 1; }
  }
  public Object retira (Object chave) throws Exception { // @{\it Removes and returns a reference to an element (if existing) from the list based in its key (chave)}@
    if (this.vazia () || chave == null)
      throw new Exception ("Erro : A lista esta vazia");
    int p = 0;
    while (p < this.ultimo && !this.item[p].equals (chave)) p++;
    if (p >= this.ultimo) return null; // @{\it key not found}@
    Object item = this.item[p]; this.ultimo = this.ultimo - 1;
    for (int aux = p; aux < this.ultimo; aux++)
      this.item[aux] = this.item[aux + 1];
    return item;
  }
  public Object retiraPrimeiro () throws Exception { // @{\it Removes and returns a reference to the first element from the list}@
    if (this.vazia ()) throw new Exception ("Erro : A lista esta vazia");
    Object item = this.item[0]; this.ultimo = this.ultimo - 1;
    for (int aux = 0; aux < this.ultimo; aux++)
      this.item[aux] = this.item[aux + 1];
    return item;
  }
  public boolean vazia () { // @{\it Checks if the list is empty}@
	return (this.primeiro == this.ultimo); }
  public void imprime () {
    for (int aux = this.primeiro; aux < this.ultimo; aux++){
		System.out.println (this.item[aux].toString ());
	}
  }

  public Object primeiro () { // @{\it Returns a reference for the first element of the list}@
    this.pos = -1; return this.proximo ();
  }

  public Object proximo () {  // @{\it Returns a reference for the next element of the list, in relation to the current position}@
    this.pos++;
    if (this.pos >= this.ultimo) return null; 
    else return this.item[this.pos];
  }
  
  
// @{\it Exercise 6: Method to insert an object x after the first occurence of an specific key (chave) }@
  public void insereAposChave (Object x, Object chave) throws Exception {

    if (this.vazia ()|| chave == null){
		
		throw new Exception ("Erro: A lista esta vazia ou a chave buscada eh nula.");
	
	}else{
	
		if (this.ultimo >= this.item.length){
		  
		  throw new Exception ("Erro: A lista esta cheia");
		
		}else{
		
			int p=0; // essa var. será usada para marcar a posição da chave buscada, caso ela exista.
			
			// Percorre a lista procurando a posição da primeira ocorrência da chave buscada.
			while( (this.item[p].equals(chave) == false) && p < this.ultimo ){
				p++;
			} 
			
			// Testa se a chave foi encontrada
			if(p < this.ultimo) {

				// Abre espaço, após p, para inserção do novo item na lista
				for (int c = this.ultimo; c > p; c--){
					this.item[c] = this.item[c-1];
				}
			
			    // Insere o novo item na lista.
				this.item[p+1] = x;
				
				// Atualiza o índice último, já que a Lista cresceu 1 unidade.
				this.ultimo = this.ultimo + 1;			
			}else{
				throw new Exception ("Erro: Valor não encontrado.");
			}
		}

	}
  }
  
  
//@{\it Exercise 7: Method that inserts an element unless it already exists in the list.  }@
  public void insereSemRepetir (Object x) throws Exception {

    Object existeItem = null;
    if (this.ultimo >= this.item.length){
      throw new Exception ("Erro: A lista esta cheia");
	}
    else{
		existeItem = this.pesquisa(x);
		if(existeItem == null){
		    this.insere(x);
		}else{
		    throw new Exception ("Erro: Item ja existe na lista!");
		}
	}
  }
 
//@{\it Exercise 8: Method that returns the total of itens contained in the list }@ 
  public int getTamanho(){
	  return this.ultimo;
  }
  
  
//@{\it Exercise 8: Method that creates a new list attaching a list, given in the parameters, to the current list}
  public Lista uneListas (Lista  lst2) throws Exception{
	
	if(lst2 == null){
		throw new Exception ("Erro: a listas a ser unida é null.");
	}else{	
		int cont;
		int tamanholst3 = this.getTamanho() + lst2.getTamanho();
		Lista lst3 = new Lista(tamanholst3);  
		
		//insere os itens da lista atual
		for(cont=0; cont<this.getTamanho(); cont++){
			lst3.insere(this.proximo());
		}
		
		//insere os itens da segunda lista, caso a mesma não esteja vazia.
		if(!lst2.vazia()){
			for(cont=0; cont<lst2.getTamanho(); cont++){
				lst3.insere(lst2.proximo());
			}
		}
		
		return lst3;
	}
  }

  //@{\it Exercise 8: Method that creates a new list based in the two lists, given in the parameters.}
  
  public Lista uneListas2 (Lista  lst1, Lista  lst2) throws Exception{
	  
		if(lst1 == null || lst2 == null){
			throw new Exception ("Erro: alguma das listas informadas é null.");
		}else{
			int cont;
			int tamanholst3 = lst1.getTamanho() + lst2.getTamanho();
			Lista lst3 = new Lista(tamanholst3);  
			
			
			//insere os itens da primeira lista, caso a mesma não esteja vazia.
			if(!lst1.vazia()){
				for(cont=0; cont<lst1.getTamanho(); cont++){
					lst3.insere(lst1.proximo());
				}
			}		
			
			//insere os itens da segunda lista, caso a mesma não esteja vazia.
			if(!lst2.vazia()){
				for(cont=0; cont<lst2.getTamanho(); cont++){
					lst3.insere(lst2.proximo());
				}
			}	
			return lst3;
		}
	}
	

	//public int tamanho( ){return this.ultimo;}
	
	//@{\it Inverts and intercalates a List given in the parameter with the current one}
	public Lista inverteEintercala(Lista lis2)throws Exception{
		int total = this.getTamanho() + lis2.getTamanho();
		Lista lisF = new Lista(total);
		int cont;
		Object aux;
		for(cont=this.primeiro; cont<(this.getTamanho()/2); cont++){
			aux = this.item[cont];
			this.item[cont] = this.item[(this.ultimo-1)-cont];
			this.item[(this.ultimo-1)-cont]=aux;
		}
		for(cont=lisF.primeiro; cont<total; cont++){
			if(!this.vazia()){
				lisF.insere(this.retiraPrimeiro());		
			}
			if(!lis2.vazia()){
				lisF.insere(lis2.retiraPrimeiro());
			}			
		}
		return lisF;
	}
	

}
