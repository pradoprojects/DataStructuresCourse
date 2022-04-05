package sorting;
import java.io.*;
public class ItemCNH{
  private CNH chave; /*1a mudanca. De chave tipo int para tipo CNH*/
  // @{\it outros componentes do registro}@

  public ItemCNH (CNH ch) { /*2a mudanca. De chave tipo int para tipo CNH*/
	this.chave = ch; 
  }
  
  public int compara (ItemCNH it) {
    if (this.chave.compareTo(it.chave) < 0) /*3a mudanca. Como a chave agora é um objeto, a comparação agora deve usar o metodo compareTo(). Ver  metodo compareTo() da classe CNH*/
		return -1;
    else
		if (this.chave.compareTo(it.chave) > 0) /*4a mudanca. Como a chave agora é um objeto, a comparação agora deve usar o metodo compareTo(). Ver metodo compareTo() da classe CNH*/
			return 1;
    return 0;
  }
  
  public void alteraChave (Object chave) {
    CNH ch = (CNH) chave;/*5a mudanca. So substitui a chave pelo objeto recebido no parametro*/
	this.chave = ch;
  }
  
  public CNH recuperaChave () {
	return this.chave;/*6a mudanca. So retorna o objeto chave*/
  }
  
  public String toString () { 
	return "" + this.chave.toString(); /*7a mudanca. Como a chave agora é um objeto, deve usar o metodo toString() para imprimir. Ver sobrescrita do metodo toString() da classe CNH*/
  }
  
  /* Desnecessarios para o exercicio 26.
  public void gravaArq (RandomAccessFile arq) throws IOException {
    arq.writeInt (this.chave.toString());
  }
  
  public void leArq (RandomAccessFile arq) throws IOException {
    this.chave = arq.readInt ();
  }
 
  
  */
}