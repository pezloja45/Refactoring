package boletin7;
import java.util.Arrays;
import java.util.Scanner;
public class ejercicio13 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Dime el numero n: ");
int n = sc.nextInt();
System.out.println("Dime el numero m: ");
int m = sc.nextInt();
int[] listan = new int[n];
int[] listam = new int[m];
int[] listanm = new int[listan.length + listam.length];

for (int i = 0; i < listan.length; i++) { System.out.println("Dime el numero " + i + " para la lista n: "); listan[i] = sc.nextInt(); }
for (int i = 0; i < listam.length; i++) { System.out.println("Dime el numero " + i + " para la lista m: "); listam[i] = sc.nextInt(); }

System.arraycopy(listan, 0, listanm, 0, listan.length);
System.arraycopy(listam, 0, listanm, listan.length, listam.length);

Arrays.sort(listanm);
System.out.println("La lista ordenada de menor a mayor queda asi: ");

for (int value : listanm) { System.out.println(value); }
int length = listanm.length;

for (int i = 0; i < length / 2; i++) { int temp = listanm[i]; listanm[i] = listanm[length - 1 - i]; listanm[length - 1 - i] = temp; }

System.out.println("La lista ordenada de mayor a menor queda asi:");

for (int value : listanm) { System.out.println(value); }

sc.close();
}
}
