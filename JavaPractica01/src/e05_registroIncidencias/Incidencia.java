package e05_registroIncidencias;

public class Incidencia {
	
	
	//Atributos
	
	private int n_puesto, cd;
	private String problema, solucion;
	private boolean estado;
	
	
	//Atributos de clase
	
	private static int pendientes = 0, cod_incidencia = 0;
	
	
	//Constructores
	
	public Incidencia() {
		
	}
	
	public Incidencia(int n_puesto, String problema){
		pendientes++;
		cod_incidencia++;
		
		estado = false;
		this.cd = cod_incidencia;
		this.n_puesto = n_puesto;
		this.problema = problema;
	}

	
	// Getters y Setters

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public String getSolucion() {
		return solucion;
	}

	public void setSolucion(String solucion) {
		this.solucion = solucion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	//Método de clase
	public static int getPendientes() {
		return pendientes;
	}
	
	
	//Métodos de instancia
	
	public String resuelve(String solucion) {
		pendientes--;
		this.estado = true;
		return this.solucion = solucion;
	}

	@Override
	public String toString() {
		if (estado == false) {
			return "Incidencia "  + cd +
					" - Puesto: " + n_puesto +
					" - "         + problema +
					" - Pendiente";
		} else {
			return "Incidencia " + cd +
			" - Puesto: "        + n_puesto +
			" - "                + problema +
			" - Resuelta - "     + solucion;
		}
	}
}
