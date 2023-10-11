import java.util.Scanner;

public class DeconstruccionNumero {
public static void main (String[] args){
Scanner sc = new scanner (system.in);

System.out.println("Ingresa el primer numero");
int num1= sc.NextInt();
System.out.println("Ingresa el segundo numero");
int num2= sc.NextInt();
System.out.println("Ingresa el tercer numero");
int num3= sc.NextInt();

int  numero1;
int  numero2;
int numero3;
int numeroFinal;

numero1= num1 / 100;
numero2= (num2/10) % 10;
numero3= num3 % 10;
numeroFinal= numero1 * 100 + numero2 *10 +numero3;

System.out.println("El numero deconstruido es: " + numeroFinal);
}
}
