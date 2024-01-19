package boletin8;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio8 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[][] a = new int [4][4];
System.out.println("Introduce un 1 si quieres inscribir un participante, un 2 si quieres mostrar el listado de datos, un 3 para mostrar el listado por marcas, un 4 para finalizar el programa");
int opcion = sc.nextInt();
final int b = 0;
final int c = 1;
while (opcion != 4) {
switch (opcion) {
case 1:
System.out.println("Introduce el dorsal del participante, su mejor marca del 2002, la del 2001 y la del 2000");
for (int row = 0; row < a.length; row++) {
for (int column = 0; column < a[row].length; column++) {
a[row][column] = sc.nextInt();
}
}
break;
case 2:
int[] arrai2 = new int[4];
for (int column = 0; column < arrai2.length; column++) {
arrai2[column] = a[column][b];
}
Arrays.sort(arrai2);
for (int value : arrai2) {
System.out.println("Dorsal: " + value);
}
break;
case 3:
int[] arrai = new int[4];
for (int column = 0; column < arrai.length; column++) {
arrai[column] = a[column][c];
}
int length = arrai.length;
for (int i = 0; i < length / 2; i++) {
int temp = arrai[i];
arrai[i] = arrai[length - 1 - i];
arrai[length - 1 - i] = temp;
}
System.out.println("La lista ordenada de mayor a menor queda asi:");
for (int value : arrai) {
System.out.println(value);
}
break;
case 4:
break;
}
System.out.println("Introduce un 1 si quieres inscribir un participante, un 2 si quieres mostrar el listado de datos, un 3 para mostrar el listado por marcas, un 4 para finalizar el programa");
opcion = sc.nextInt();
}
}
}