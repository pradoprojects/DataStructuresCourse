package sorting;
import java.io.*;

//Exercise 26
public class CNH{
  private String primeiroNome;
  private int numero;
  
  public CNH (String pN, int nr) { 
	this.primeiroNome = pN; 
	this.numero = nr;
  }
  
  public String getPrimeiroNome(){
	  return this.primeiroNome;
  }
  
  public int getNumero(){
	  return this.numero;
  }
    
  public String toString () { 
	return "nome:" + this.primeiroNome + "\n" + "numero:" + this.numero + "\n";
  }
  
  
 
  //versao do compareTo para o exercicio 26.1
  public int compareTo (CNH c2) { 
	if(this.numero < c2.getNumero()){
		return -1;
	}else{
		if(this.numero > c2.getNumero()){
			return 1;
		}
	}
	return 0;
  }
  
  
  // versao do compareTo para o exercicio 26.2. Para usa-lo, descomente esse metodo e comente o anterior (26.1).
  
  //Note que eh preciso chamar getNome() para obter o nome de c2 antes de compara-lo, pq primeiroNome eh um atributo privado.
  //O metodo compareToIgnoreCase compara
  
  /*
  public int compareTo (CNH c2) { 
	if( this.primeiroNome.compareToIgnoreCase(c2.getPrimeiroNome()) < 0 ){
		return -1;
	}else{
		if( this.primeiroNome.compareToIgnoreCase(c2.getPrimeiroNome()) > 0 ){
			return 1;
		}
	}
	return 0;
  }
  */
  
  
  
}