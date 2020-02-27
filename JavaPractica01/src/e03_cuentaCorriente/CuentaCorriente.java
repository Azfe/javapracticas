
package e03_cuentaCorriente;
import java.util.Random;

public class CuentaCorriente {
	
	//Atributos
	private double c_saldo,  c_cargo, c_ingreso;
	private String c_numero;
	
	
	//Constructores
	public CuentaCorriente () {
		c_numero = numeroCuenta();
		c_saldo = 0;
	}
	
	public CuentaCorriente (double c_saldo) {
		c_numero = numeroCuenta();
		this.c_saldo = c_saldo;
	}
	
	
	// Getters y setters
	public double getC_saldo() {
		return c_saldo;
	}

	public void setC_saldo(double c_saldo) {
		this.c_saldo = c_saldo;
	}

	public String getC_numero() {
		return c_numero;
	}

	public void setC_numero(String c_numero) {
		this.c_numero = c_numero;
	}
	

	// método de instancia
	public double ingreso (double c_ingreso) {
		c_saldo += c_ingreso;
		return c_saldo;
	}
	
	public double cargo (double c_cargo) {
		c_saldo -= c_cargo;
		return c_saldo;
	}
	
	public double transferencia(CuentaCorriente cuenta, int cantidad) {
		if (cantidad >= 0) {
			cuenta.c_saldo += cantidad;
			this.c_saldo -=cantidad;
		}
		return this.c_saldo;
	}
	
	// Genera número de 10 dígitos
	public static String numeroCuenta() {
		int n;
		String sid="";
		for (n = 0; n<10 ; n++)
			sid += (int) (Math.random()*9+1);
		return sid;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [c_saldo=" + c_saldo + ", c_numero=" + c_numero + "]";
	}
	
	
}
