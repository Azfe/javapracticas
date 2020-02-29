package e04_FichaDomino;

public class FichaDomino {
	
	//Atributos
	private int valor_d, valor_i;
	
	//Constructores
	public FichaDomino () {
	}
	
	public FichaDomino (int valor_d,int valor_i) {
		this.valor_d = valor_d;
		this.valor_i = valor_i;
	}

	// Getters y Setters
	public int getValor_d() {
		return valor_d;
	}

	public void setValor_d(int valor_d) {
		this.valor_d = valor_d;
	}

	public int getValor_i() {
		return valor_i;
	}

	public void setValor_i(int valor_i) {
		this.valor_i = valor_i;
	}

		
	//Métodos de instancia
	
	public boolean encaja(FichaDomino ficha) {
		if ((this.valor_d == ficha.valor_d) || 
			(this.valor_d == ficha.valor_i) ||
			(this.valor_i == ficha.valor_d) ||
			(this.valor_i == ficha.valor_i)) {
			return true;
		}else {
			return false;
		}
	}
	
	public void voltea() {
		this.valor_d = this.valor_d + this.valor_i;
		this.valor_i = this.valor_d - this.valor_i;
		this.valor_d = this.valor_d - this.valor_i;
	}

	@Override
	public String toString() {
		if ((valor_d == 0) && (valor_i != 0)) {
			return "[ |" + valor_i + "]";
		}else if ((valor_d != 0) && (valor_i == 0)) {
			return "[" + valor_d + "| ]";
		}else if ((valor_i == 0 ) && (valor_d == 0)) {
			return "[ | ]";
		}else {
		return "[" + valor_d + "|" + valor_i + "]";
		}
	}
	
	
	
}
