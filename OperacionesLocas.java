package ampliacionmetodos;
public class OperacionesLocas {
public static void main(String[] args) {
long a=(long)(Math.random()*20)+1;
long b=(long)(Math.random()*20)+1;
long c=(long)(Math.random()*20)+1;
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println("El numero maximo es: " + maxTresNum(a, b, c));
System.out.println("El numero minimo es: " + minTresNum(a, b, c));
System.out.println("El resultado de la potencia es: " + potencia (a, b, c));
System.out.println("El resultado del factorial minimo es: " + factorial(minTresNum(a, b, c)) + " y el resultado del factorial maximo es : " + factorial(maxTresNum(a, b, c)));
primo (a, b, c);
sumaDivisores (a, b, c);
uneDivisores (a, b, c);
invierteDivisores (a, b, c);
}
public static long maxTresNum(long a, long b, long c) {
return maximo (maximo(a, b),c);
}
public static long maximo (long a, long b) {
if (a >= b) { return a; } else return b;
}
public static long minTresNum(long a, long b, long c) {
return minimo (minimo(a, b),c);
}
public static long minimo (long a, long b) {
if (a <= b) { return a; } else return b;
}
public static long potencia (long a, long b, long c) {
long calculo = 1;
if (minTresNum(a, b, c) == 1) return 1;
for (int i = 1; i < minTresNum(a, b, c); i ++) {
calculo *= maxTresNum(a, b, c);
}
return calculo;
}
public static long factorial (long n) {
long mul = 1;
for (long i = 1; i <= n; i++) { mul *= i; }
return mul;
}
public static void primo (long a, long b, long c) {
long menorNumero = minTresNum(a, b, c);
boolean primo = true;
for (int i = 2; i < menorNumero; i++) {
if (menorNumero % i == 0) { primo = false; }
}
if (primo) { System.out.println("El número menor es primo"); } else { System.out.println("El número menor no es primo"); }
long maximoNumero = maxTresNum(a, b, c);
boolean primo2 = true;
for (int i = 2; i < maximoNumero; i++) {
if (maximoNumero % i == 0) { primo2 = false; }
}
if (primo2) { System.out.println("El número mayor es primo"); } else { System.out.println("El número mayor no es primo"); }
}
public static void sumaDivisores (long a, long b, long c) {
long prueba = 0;
for (int i = 1; i <= minTresNum(a, b, c); i++) {
if (minTresNum(a, b, c) % i == 0) prueba += i; }
System.out.println("El resultado de la suma de divisores del numero minimo es: " + prueba);
long prueba2 = 0;
for (int i = 1; i <= maxTresNum(a, b, c); i++) {
if (maxTresNum(a, b, c) % i == 0) prueba2 += i; }
System.out.println("El resultado de la suma de divisores del numero maximo es: " + prueba2);
}
public static void uneDivisores (long a, long b, long c) {
String pruebaconcat1 = "";
for (int i = 1; i <= minTresNum(a, b, c); i++) {
if (minTresNum(a, b, c) % i == 0) pruebaconcat1 += i; }
System.out.println("El concatenador del numero minimo es: " + pruebaconcat1);
String pruebaconcat2 = "";
for (int i = 1; i <= maxTresNum(a, b, c); i++) {
if (maxTresNum(a, b, c) % i == 0) pruebaconcat2 += i; }
System.out.println("El concatenador del numero numero maximo es: " + pruebaconcat2);
}
public static void invierteDivisores (long a, long b, long c) {
String pruebaconcat1 = "";
for (long i = minTresNum(a, b, c); i >= 1; i--) {
if (minTresNum(a, b, c) % i == 0) pruebaconcat1 += i; }
System.out.println("El concatenador del numero minimo es: " + pruebaconcat1);
String pruebaconcat2 = "";
for (long i = maxTresNum(a, b, c); i >= 1; i--) {
if (maxTresNum(a, b, c) % i == 0) pruebaconcat2 += i; }
System.out.println("El concatenador del numero numero maximo es: " + pruebaconcat2);
}
}