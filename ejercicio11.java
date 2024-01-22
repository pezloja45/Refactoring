package practica;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		final double const_Mercurio=0.38;
		final double const_Venus=0.91;
		final double const_Martes=0.38;
		final double const_Jupiter=2.36;
		final double const_Saturno=0.92;
		final double const_Urano=0.89;
		final double const_Neptuno=1.12;
		
		
		System.out.println("Calculadora de peso en los planetasTemporals del Sistema Solar");
		System.out.print("Por favor, ingresa tu peso en la Tierra (en kilogramos): ");

		double peso=introducirPeso();

		System.out.println("\nTu peso en diferentes planetasTemporals del Sistema Solar:");

		temporal("Mercurio", peso, const_Mercurio);
		temporal("Venus", peso, const_Venus);
		temporal("Marte", peso, const_Martes);
		temporal("Júpiter", peso, const_Jupiter);
		temporal("Saturno", peso, const_Saturno);
		temporal("Urano", peso, const_Urano);
		temporal("Neptuno", peso, const_Neptuno);

	}
	public static double introducirPeso() {
		double pesoEnTierra;
		Scanner scanner = new Scanner(System.in);
		do {
			
		pesoEnTierra = scanner.nextDouble();
		if(pesoEnTierra<=0) {
			System.out.println("Error al introducir el peso, vuelve a introducirlo:");
		}
		}while(pesoEnTierra<=0);
		
		scanner.close();
		return pesoEnTierra;
	}

	public static void temporal(String planetasTemporal, double pesoEnTierra, double constante) {

		double pesoEnplanetasTemporal = pesoEnTierra * constante;

		System.out.println("Tu peso en " + planetasTemporal + " es: " + pesoEnplanetasTemporal + " kilogramos"

		);
	}

}