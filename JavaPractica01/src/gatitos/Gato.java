package gatitos;

/**
 * @author Alex y Soto
 *
 */
public class Gato {
	
	// Atributos		
	private String color, raza, sexo;
	private int edad;
	private double peso;
	
	// Constructores
	
	public Gato() { // por defecto
		
	}
	
	public Gato(String sexo) {
		this.sexo = sexo;
	}
	
	public Gato(String color, String raza, String sexo, int edad, double peso) {
		this.color = color;
		this.raza = raza;
		this.sexo = sexo;
		this.edad = edad;
		this.peso = peso;
	}
	
	// Setter y getters

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return
	 */
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		
	}
	
	// Métodos especiales
	
	public String maulla() {
		return "Miauuu";
	}
	
	public String ronronea() {
		return "rrrrrrrrr";
	}
	
	@Override
	public String toString() {
		return "Gato [color=" + color + ", edad=" + edad + ", peso=" + peso + "]";
	}
//

}
