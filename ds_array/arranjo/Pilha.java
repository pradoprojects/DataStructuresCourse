package cap3.arranjo;
public class Pilha {
  private Object item[];
  private int    topo;
  // @{\it Opera\c{c}\~oes}@
  
  public Pilha () { // @{\it Creates an empty stack (Pilha) with 1000 positions capacity}@
    this.item = new Object[1000]; this.topo = 0;
  }
  public Pilha (int maxTam) { // @{\it Creates an empty stack with maxTam capacity}@
    this.item = new Object[maxTam]; this.topo = 0;
  }
  public void empilha (Object x) throws Exception {
    if (this.topo == this.item.length)
      throw new Exception ("Erro: A pilha esta cheia");
    else this.item[this.topo++] = x;
  }
  public Object desempilha () throws Exception {
    if (this.vazia())
      throw new Exception ("Erro: A pilha esta vazia");    
    return this.item[--this.topo];
  }
  public boolean vazia () {
    return (this.topo == 0);
  }
  public int tamanho () {
    return this.topo;
  } 
  
  public void imprimeSimples(){
	  int aux = topo-1;
	  
	  if(this.vazia()){
		System.out.println("Pilha vazia!\n");
	  }else{
		  while(aux>=0){
			System.out.println(this.item[aux].toString());
			aux--;
		  }
	  }
  }
  
  public String toString(){
	  int aux = topo-1;
	  String resultado="";
	  
	  if(this.vazia()){
		  return null;
	  
	  }
	  while(aux>=0){
		resultado = resultado + this.item[aux].toString()+"\n";
		aux--;
		
	  }
	  return resultado;
	  
  }
}

