package e03_cuentaCorriente;

public class Main {

	public static void main(String[] args) {
		CuentaCorriente cuenta1 = new CuentaCorriente();
		CuentaCorriente cuenta2 = new CuentaCorriente(2000);
		CuentaCorriente cuenta3 = new CuentaCorriente(1000.50);
		cuenta1.cargo(50);
		cuenta2.ingreso(1250);
		cuenta2.transferencia(cuenta3, 5);
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		System.out.println(cuenta3);
	}
}

