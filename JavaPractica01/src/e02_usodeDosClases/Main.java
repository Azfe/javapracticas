package e02_usodeDosClases;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Punto p1 = new Punto(4.21, 7.3);
		Punto p2 = new Punto(-2, 1.66);
		
		System.out.println(p1);
		
		Linea l = new Linea(p1, p2);
		System.out.println(l);

	}

}
