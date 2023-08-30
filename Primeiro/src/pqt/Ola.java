package pqt;
import java.util.Scanner;

public class Ola {
public static void main (String [] args)
{
	int a, b, soma;
	Scanner input = new Scanner (System.in);
 	System.out.println("Ola TI2!");
	
 	//Leitura do primeiro número:
 	System.out.println("Digite um número");
 	a = input.nextInt();
	
 	//Leitura do segundo número:
 	System.out.println("Digite outro número");
 	b = input.nextInt();
	
	//Somando e exibindo o resultado:
 	soma = a + b;
 	System.out.printf("A soma e %d", soma);
}
}
