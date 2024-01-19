package practica;
import java.util.Scanner;
public class ejercicio11 {
public static void main(String[] args) {
double pesoEnTierra;

System.out.println("Calculadora de peso en los planetasTemporals del Sistema Solar");
System.out.print("Por favor, ingresa tu peso en la Tierra (en kilogramos): ");

Scanner scanner = new Scanner(System.in);
pesoEnTierra = scanner.nextDouble();
scanner.close();

System.out.println("\nTu peso en diferentes planetasTemporals del Sistema Solar:");

temporal("Mercurio", pesoEnTierra, 0.38); temporal("Venus", pesoEnTierra, 0.91); temporal("Marte", pesoEnTierra, 0.38); temporal("Júpiter", pesoEnTierra, 2.36); temporal("Saturno", pesoEnTierra, 0.92); temporal("Urano", pesoEnTierra, 0.89); temporal("Neptuno", pesoEnTierra, 1.12); }

public static void temporal(String planetasTemporal, double pesoEnTierra, double constante) { double pesoEnplanetasTemporal = pesoEnTierra * constante; System.out.println("Tu peso en " + planetasTemporal + " es: " + pesoEnplanetasTemporal + " kilogramos");}
}
