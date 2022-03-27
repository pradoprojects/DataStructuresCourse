package cap3.arranjo;
public class Lista {
  private Object item[];
  private int primeiro, ultimo, pos;
  // @{\it Opera\c{c}\~oes}@
  public Lista () { // @{\it Cria uma Lista vazia}@
    this.item = new Object[1000]; this.pos = -1;
    this.primeiro = 0; this.ultimo = this.primeiro;
  }
  public Lista (int maxTam) { // @{\it Cria uma Lista vazia}@
    this.item = new Object[maxTam]; this.pos = -1;
    this.primeiro = 0; this.ultimo = this.primeiro;
  }
  public Object pesquisa (Object chave) {
    if (this.vazia () || chave == null) return null;
    for (int p = 0; p < this.ultimo; p++)
      if (this.item[p].equals (chave)) return this.item[p];
    return null;
  }
  public void insere (Object x) throws Exception {
    if (this.ultimo >= this.item.length)
      throw new Exception ("Erro: A lista esta cheia");
    else { this.item[this.ultimo] = x; this.ultimo = this.ultimo + 1; }
  }
  public Object retira (Object chave) throws Exception { 
    if (this.vazia () || chave == null)
      throw new Exception ("Erro : A lista esta vazia");
    int p = 0;
    while (p < this.ultimo && !this.item[p].equals (chave)) p++;
    if (p >= this.ultimo) return null; // @{\it Chave n\~ao encontrada}@
    Object item = this.item[p]; this.ultimo = this.ultimo - 1;
    for (int aux = p; aux < this.ultimo; aux++)
      this.item[aux] = this.item[aux + 1];
    return item;
  }
  public Object retiraPrimeiro () throws Exception {
    if (this.vazia ()) throw new Exception ("Erro : A lista esta vazia");
    Object item = this.item[0]; this.ultimo = this.ultimo - 1;
    for (int aux = 0; aux < this.ultimo; aux++)
      this.item[aux] = this.item[aux + 1];
    return item;
  }
  public boolean vazia () { return (this.primeiro == this.ultimo); }
  public void imprime () {
    for (int aux = this.primeiro; aux < this.ultimo; aux++){
		System.out.println (this.item[aux].toString ());
	}
  }

  public Object primeiro () {
    this.pos = -1; return this.proximo ();
  }

  public Object proximo () {
    this.pos++;
    if (this.pos >= this.ultimo) return null; 
    else return this.item[this.pos];
  }
  
  
// Exercicio 6: Metodo para inserir um objeto x após a primeira ocorrência de uma determinada "chave"
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
  
  
//Exercicio 7: Método que insere evitando que a inserção ocorra quando o objeto ja existe na lista.
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
  
//Exercicio 8: Metodo que me retorna a quantidade de itens contidos na lista.
  public int getTamanho(){
	  return this.ultimo;
  }
  
  
// Exercicio 8: Metodo que cria uma lista nova juntando a lista atual a uma segunda, fornecida no parametro
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

  
  // Exercicio 8 (segunda opcao): Metodo que cria uma lista nova juntando duas listas fornecidas no parametro.
  
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
	

	public int tamanho( ){return this.ultimo;}
	
	public Lista inverteEintercala(Lista lis2)throws Exception{
		int total = this.tamanho() + lis2.tamanho();
		Lista lisF = new Lista(total);
		int cont;
		Object aux;
		for(cont=this.primeiro; cont<(this.tamanho()/2); cont++){
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
