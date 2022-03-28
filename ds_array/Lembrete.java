package cap3;
import cap3.autoreferencia.*;


public class Lembrete{
	private String texto;
	private int horario;
	

	public Lembrete(String nota)
	{
		this.texto = nota;
	}
	public void adHorario(int hora, int minuto) throws Exception{
		if(hora > 24 || hora < 0)
			throw new Exception("Valor de horas invalido");
		if(minuto > 60 || minuto < 0)
			throw new Exception("Valor de minutos invalido");
		this.horario = hora * 100 + minuto;
	}
	public String toString() {
		return("Horario: " + horario + " Lembrete: " + texto);
	}
	public boolean equals(Object o) {
		Lembrete aux = (Lembrete)o;
		return(aux.horario == this.horario);
	}
	public boolean ehMaisRecente(Lembrete aux) {
		return(this.horario < aux.horario);
	}
	public boolean ehMenosRecente(Lembrete aux) {
		return(this.horario > aux.horario);
	}
}