package pqt;
import java.util.Scanner;

public class Ola {
public static void main (String [] args)
{
	int a, b;
	Scanner input = new Scanner (System.in);
 	System.out.println("Ola TI2!");
 	System.out.println("Digite um número");
 	a = input.nextInt();
 	System.out.println("Digite outro número");
 	b = input.nextInt();
 	System.out.printf("A soma e %d", a+b);
}
}
