package ejerciciosClase;

public class Dia {
	enum enumMeses {
		enero, 
		febrero, 
		marzo, 
		abril, 
		mayo, 
		junio, 
		julio, 
		agosto, 
		septiembre, 
		noviembre, 
		diciembre
	};
	
	private int dia;
	private enumMeses mes;
	private int anio;
	
	private static int dias=0;
	
	public Dia() {
		dias++;
		mes = enumMeses.enero;
	}
	
	public Dia(enumMeses mes) {
		dias++;
		this.mes = mes;
		this.dia = 0;
		this.anio = 0;
	}
	
	public Dia(int dia, enumMeses mes, int anio) {
		dias++;
		this.mes = mes;
		this.dia = dia;
		this.anio = anio;
	}
	
	public int getDia() {
		return this.dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getAnio() {
		return this.anio;
	}
	
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public boolean isSummer() {
		return (
			(mes == enumMeses.junio && dia >= 21) 
			|| (mes.equals(enumMeses.julio)) 
			|| (mes == enumMeses.agosto && dia <= 21)
		);
	}
		
	public String toString() {
		return this.dia + " de " + this.mes.toString() + " de " + this.anio;
	}
}
