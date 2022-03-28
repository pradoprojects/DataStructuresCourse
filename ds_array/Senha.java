/*
Password for exercises 20 and 23
*/
package cap3;
import cap3.arranjo.Fila;

public class Senha{
	int senha;
	int hora;
	char tipo;

	// A senha deve ser definida desde o momento de sua criação.
	// The password must be defined from the moment of its creation.
	public Senha(int s, int h, char t) throws Exception {
		if(s > 0)
			senha = s;
		else
			throw new Exception("Formato de senha invalido " + s);
		
		if((h < 24) && (h >= 0))
			hora = h;
		else
			throw new Exception("Hora invalida");
		
		if(t == 'N' || t == 'P')
			tipo = t;
		else if(t == 'n')
			tipo = 'N';
		else if(t == 'p')
			tipo = 'P';
		else
			throw new Exception("Tipo de senha invalido");
	}
	public char retornaTipo() {
		return this.tipo;
	}
	public int retornaSenha() {
		return this.senha;
	}
	public int retornaHora() {
		return this.hora;
	}
	public String toString() {
		return("Senha: " + senha + ", Horario: " + hora + ", Tipo: " + tipo);
	}
	public boolean equals(Senha s) {
		if(s.senha == this.senha)
			return true;
		else
			return false;
	}
}

